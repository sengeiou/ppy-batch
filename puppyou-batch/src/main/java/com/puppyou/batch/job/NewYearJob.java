package com.puppyou.batch.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.puppyou.batch.service.PuppyService;

import lombok.extern.slf4j.Slf4j;


/*
 * KYC 접수건 중 timeout 건에 대한 scheduler
 * */

@Component
@Slf4j
public class NewYearJob {
	
	@Autowired
	PuppyService puppyService;

	@Scheduled(cron="0 0 2 1 1 *")
    public void plusPuppyAgeJob() {
		log.info("new year update puppy age");
		puppyService.puppyPlusAge();
    }
}
