package com.puppyou.batch.entity;

import java.math.BigInteger;
import java.time.LocalDateTime;

import com.puppyou.batch.core.CD.ActivationYn;
import com.puppyou.batch.core.CD.BusinessCd;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor (access = AccessLevel.PRIVATE)
public class ProductOrder {
	private BigInteger orderNo;
	private BigInteger memNo;
	private BigInteger boneNo;
	private BigInteger productNo;
	private int quantity;
	private String dstMemName;
	private String dstMemPhone;
	private String dstMemPostcode;
	private String dstMemComment;
	private String dstMemAddress;
	private String dstMemAddressDetail;
	private LocalDateTime createDt;
	private LocalDateTime updateDt;
	
}
