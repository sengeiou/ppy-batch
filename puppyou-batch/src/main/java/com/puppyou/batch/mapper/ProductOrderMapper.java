package com.puppyou.batch.mapper;

import java.math.BigInteger;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.puppyou.batch.entity.ProductOrder;

public interface ProductOrderMapper {
	
	public List<ProductOrder> getFinishList();

	public void updateComplateOrder(@Param("orderNo")BigInteger orderNo);
}
