package com.puppyou.batch.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.puppyou.batch.service.MatchingService;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class MatchingJob {
	
	@Autowired
	MatchingService matchingService;
	
	@Scheduled(fixedRate = 300000) // 5분이면 너무 많은 리스트가 생기게 되나?.
    public void beforeMatchingEndJob() {
		log.info("Before Matching END Job Start");
		matchingService.beforeMatchingEndJob();
	}
	
	@Scheduled(cron="0 0 5 * * *") // 오전 5시 모든 매칭 건 종료 
	public void resetMatchingJob() {
		log.info("Reset Matching END Job Start");
		matchingService.resetMatchingJob();
	}

}
