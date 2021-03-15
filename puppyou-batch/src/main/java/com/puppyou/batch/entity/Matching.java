package com.puppyou.batch.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;

import com.puppyou.batch.core.CD.MatchStatus;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor (access = AccessLevel.PRIVATE)
public class Matching {
	
	private BigInteger matchingNo;
	private BigInteger memNo;
	private BigInteger dstMemNo;
	private MatchStatus matchStatus;
	private BigInteger puppyNo;
	private BigInteger dstPuppyNo;
	private BigDecimal dstLatitude;
	private BigDecimal dstLongitude;
	private String dstAddress;
	private String dstAddressDetail;
    private LocalDateTime createDt;
    private LocalDateTime updateDt;
    
    

}
