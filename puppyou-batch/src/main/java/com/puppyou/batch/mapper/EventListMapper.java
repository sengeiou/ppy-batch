package com.puppyou.batch.mapper;

import java.math.BigInteger;

import org.apache.ibatis.annotations.Param;

import com.puppyou.batch.entity.BoneHistory;

public interface EventListMapper {
	
	public int getEventPoint(@Param("eventCode") String eventCode);
	public BigInteger getEventNo(@Param("eventCode") String eventCode);
	public int getBoneBalance(@Param("memNo") BigInteger memNo);
	public void insertBalance(BoneHistory boneHistory);
	public void updateBalance(@Param("memNo") BigInteger memNo, @Param("balance") int balance);
}
