package com.puppyou.batch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.puppyou.batch.mapper.PuppyMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Transactional
public class PuppyServiceImpl implements PuppyService {
	
	@Autowired
	PuppyMapper puppyMapper;

	@Override
	public void puppyPlusAge() {
		puppyMapper.updateAllUsePuppyAge();
		log.info("New Year Puppy PLUS Age ! SUCCESS");
		return;
	}
}
