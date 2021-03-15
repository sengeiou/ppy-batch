package com.puppyou.batch.entity;

import java.math.BigInteger;
import java.time.LocalDateTime;

import com.puppyou.batch.core.CD.BreedType;
import com.puppyou.batch.core.CD.DeleteYn;
import com.puppyou.batch.core.CD.Gender;
import com.puppyou.batch.core.CD.MainYn;
import com.puppyou.batch.core.CD.NeutralizationYn;
import com.puppyou.batch.core.CD.VaccinationStatus;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter@ToString
@NoArgsConstructor (access = AccessLevel.PRIVATE)
public class Puppy {
	private BigInteger puppyNo;
	private BigInteger memNo;
	private MainYn mainYn;
	private String name;
	private BreedType breed;
	private String birth;
	private int year;
	private int month;
	private int age;
	private Gender gender;
	private NeutralizationYn neutralizationYn;
	private VaccinationStatus vaccinationStatus;
	private Double weight;
	private String introduce;
	private DeleteYn deleteYn;
	private LocalDateTime createDt;
	private LocalDateTime updateDt;
	
}