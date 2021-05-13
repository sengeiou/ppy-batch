package com.puppyou.batch.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.puppyou.batch.entity.BoneHistory;
import com.puppyou.batch.entity.Matching;
import com.puppyou.batch.mapper.EventListMapper;
import com.puppyou.batch.mapper.MatchingMapper;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MatchingServiceImpl implements MatchingService {
	
	@Autowired
	MatchingMapper matchingMapper;
	
	@Autowired
	AppPushService appPushService;
	
	@Autowired
	EventListMapper eventListMapper;

	@Override
	@Transactional
	public void beforeMatchingEndJob() {
		// 매칭 상태 값이 GOING인 사람 중 3시간이 지난 매칭 건을 확인한다.
		List<Matching> list = matchingMapper.getPastMatchingTimeList();
		
		if(!list.isEmpty()) {
			list.forEach(p ->{
				try {
					//1. 해당 매칭을 종료시킨다. -> cancel 
					matchingMapper.updateEndMatching(p.getMatchingNo());
					//2. 해당 유저들에 대한 매칭 상태를 변경해준다. -> NO_MATCH
					matchingMapper.updateMemNoMatching(p.getMemNo());
					//신청자
					matchingMapper.updateMemNoMatching(p.getDstMemNo());
					//수락자
				}catch (Exception e) {
					log.info("EXCEPTION Matching No : {} Member NO : {} DstMember NO : {}"
											, p.getMatchingNo(),p.getMemNo(), p.getDstMemNo());
					e.printStackTrace();
				}
			});
		}
		log.info("Matching END Job Finish");
	}

	@Override
	@Transactional
	public void resetMatchingJob() {
		//오전 5시 모든 매칭중인 건 검색 going 은 제외. 
		List<Matching> list = matchingMapper.getGoingMatchingList();
		
		if(!list.isEmpty()) {
			list.forEach(p ->{
				try {
					//1. 해당 매칭을 종료시킨다. -> end 
					matchingMapper.updateEndMatching(p.getMatchingNo());
					//2. 해당 유저들에 대한 매칭 상태를 변경해준다. -> NO_MATCH
					matchingMapper.updateMemNoMatching(p.getMemNo());
					//신청자
					matchingMapper.updateMemNoMatching(p.getDstMemNo());
					//수락자
					int matchingCnt = matchingMapper.getMatchingCnt(p.getMemNo(), p.getMatchingNo());
					if(matchingCnt < 0) {
						int point = eventListMapper.getEventPoint("FIRST_MATCHING");
						BigInteger targetNo = eventListMapper.getEventNo("FIRST_MATCHING");
						int balance = eventListMapper.getBoneBalance(p.getMemNo());
						int plusBalance = balance + point;
						eventListMapper.insertBalance(BoneHistory.builder().build().reqToEntityBoneHistoryEventInsert(p.getMemNo(), targetNo, "FIRST_MATCHING", point, plusBalance));
						eventListMapper.updateBalance(p.getMemNo(), plusBalance);
						appPushService.pushSend(p.getMemNo(), "FIRST_MATCHING");
					}
					int dstMatchingCnt = matchingMapper.getMatchingCnt(p.getDstMemNo(), p.getMatchingNo());
					if(dstMatchingCnt < 1) {
						int point = eventListMapper.getEventPoint("FIRST_MATCHING");
						BigInteger targetNo = eventListMapper.getEventNo("FIRST_MATCHING");
						int balance = eventListMapper.getBoneBalance(p.getDstMemNo());
						int plusBalance = balance + point;
						eventListMapper.insertBalance(BoneHistory.builder().build().reqToEntityBoneHistoryEventInsert(p.getDstMemNo(), targetNo, "FIRST_MATCHING", point, plusBalance));
						eventListMapper.updateBalance(p.getDstMemNo(), plusBalance);
						appPushService.pushSend(p.getDstMemNo(), "FIRST_MATCHING");
					}
					
				}catch (Exception e) {
					log.info("EXCEPTION Matching No : {} Member NO : {} DstMember NO : {}"
											, p.getMatchingNo(),p.getMemNo(), p.getDstMemNo());
					e.printStackTrace();
				}
			});
		}
		log.info("Matching Reset Job Finish");
	}
}
