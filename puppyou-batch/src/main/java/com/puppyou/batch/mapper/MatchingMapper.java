package com.puppyou.batch.mapper;

import java.math.BigInteger;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.puppyou.batch.entity.Matching;

public interface MatchingMapper {
	
	public List<Matching> getPastMatchingTimeList();
	public List<Matching> getGoingMatchingList();
	
	public void updateEndMatching(@Param("matchingNo")BigInteger matchingNo); 
	
	public void updateMemNoMatching(@Param("memNo")BigInteger memNo); 

}
