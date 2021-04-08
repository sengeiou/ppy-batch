package com.puppyou.batch.service;

import java.math.BigInteger;

public interface AppPushService {
	
	public void pushSend(BigInteger memNo, String type);
	//단일 푸쉬 전송
	
	public void multiPushSend(String type);
	//단일 푸쉬 전송
}
