package com.mfpe.spring.boot.cvt.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mfpe.spring.boot.cvt.model.HospitalDetails;

public interface HospitalDetailsRepository extends CrudRepository<HospitalDetails, Integer> {
	public List<HospitalDetails> findByHospitalState(String state);
}
