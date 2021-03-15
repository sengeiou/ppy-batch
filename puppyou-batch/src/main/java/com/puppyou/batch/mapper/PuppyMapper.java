package com.puppyou.batch.mapper;

import java.util.List;

import com.puppyou.batch.entity.Puppy;

public interface PuppyMapper {
	
	public List<Puppy> getAllUsePuppy();
	
	public void updateAllUsePuppyAge();

}
