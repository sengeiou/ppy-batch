package com.puppyou.batch.entity;

import java.math.BigInteger;
import java.time.LocalDateTime;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter@ToString
@NoArgsConstructor (access = AccessLevel.PRIVATE)
public class BoneHistory {
	private BigInteger boneNo;
    private BigInteger memNo;
    private BigInteger targetNo;
	private String type;
	private int point;
	private int balance;
    private LocalDateTime createDt;
    private LocalDateTime updateDt;

	public BoneHistory reqToEntityBoneHistoryEventInsert(BigInteger memNo, BigInteger targetNo, String type, int point, int balance) throws Exception {
		return BoneHistory.builder()
				.memNo(memNo)
				.targetNo(targetNo)
				.type(type)
				.point(point) 
				.balance(balance)
				.createDt(LocalDateTime.now())
				.updateDt(LocalDateTime.now())
				.build();
	}
    
    @Builder
    public BoneHistory(BigInteger boneNo, BigInteger memNo, String type, BigInteger targetNo,
    		int point, int balance, LocalDateTime createDt, LocalDateTime updateDt) {
		super();
		this.boneNo = boneNo;
		this.memNo = memNo;
		this.targetNo = targetNo;
		this.type = type;
		this.point = point;
		this.balance = balance;
		this.createDt = createDt;
		this.updateDt = updateDt;
	}
}