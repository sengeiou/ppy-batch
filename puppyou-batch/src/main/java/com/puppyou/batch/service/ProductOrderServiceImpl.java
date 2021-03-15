package com.puppyou.batch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.puppyou.batch.entity.ProductOrder;
import com.puppyou.batch.mapper.ProductOrderMapper;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProductOrderServiceImpl implements ProductOrderService {

	@Autowired
	ProductOrderMapper productOrderMapper;
	
	@Override
	public void complateProductStatus() {
		// 상품 구매 후 create_dt 8일이 지난 딜리버리 리스트를 찾는다.
		List<ProductOrder> list = productOrderMapper.getFinishList();
		
		if(!list.isEmpty()) {
			list.forEach(p -> {
				// complate로 변경.
				try {
					productOrderMapper.updateComplateOrder(p.getOrderNo());
				} catch (Exception e) {
					log.info("EXCEPTION Order No : {}", p.getOrderNo());
					e.printStackTrace();
				}
			});
		}
		log.info("Product Order Complate SUCCESS");
	}
	
	
}
