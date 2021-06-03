package com.puppyou.batch.service;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AppPushServiceImpl implements AppPushService {
	
	@Value("${PUSH.URL}")
	private String pushUrl;
	
	@Override
	public void pushSend(BigInteger memNo, String type) {
		RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));
		
		Map<String, String> request = new HashMap<String,String>();
		request.put("memNo", memNo.toString());
		request.put("type", type);
		try {
			restTemplate.postForObject(pushUrl+"/push/send", request, Map.class);
		}catch (HttpClientErrorException e) {
			log.info("## push server HttpClientErrorException !! ");
			e.printStackTrace();
		}catch (Exception e) {
			log.info("## push server exception !! ");
			e.printStackTrace();
		}finally {
			restTemplate = null;
			request = null;
		}
		return;
	}

	@Override
	public void multiPushSend(String type) {
		RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));
		
		Map<String, String> request = new HashMap<String,String>();
		request.put("type", type);
		try {
			restTemplate.postForObject(pushUrl+"/push/multi-send", request, Map.class);
		}catch (HttpClientErrorException e) {
			log.info("## push server HttpClientErrorException !! ");
			e.printStackTrace();
		}catch (Exception e) {
			log.info("## push server exception !! ");
			e.printStackTrace();
		}finally {
			restTemplate = null;
			request = null;
		}
		return;
	}

}
