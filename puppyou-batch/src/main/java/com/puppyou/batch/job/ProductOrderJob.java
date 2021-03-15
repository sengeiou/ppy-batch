package com.puppyou.batch.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.puppyou.batch.service.ProductOrderService;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Component
public class ProductOrderJob {
	
	@Autowired
	ProductOrderService productOrderService;
	
	
	@Scheduled(fixedRate = 300000) // 5분
    public void complateProductJob() {
		log.info("Product complate job start");
		productOrderService.complateProductStatus();
	}

}
