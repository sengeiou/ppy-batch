package com.puppyou.batch.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.puppyou.batch.service.AppPushService;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class YesterdayPuppy {
	
	@Autowired
	AppPushService appPushService;
	
	@Scheduled(cron="0 0 8 * * *") // 오전 8시 전날 퍼피 동네 확인 및 전달
	public void newPuppyPushJob() {
		log.info("newPuppyPushJob Start");
		appPushService.multiPushSend("YESTERDAY_PUPPY");
	}
}
