package com.mfpe.spring.boot.cvt.repos;

import org.springframework.data.repository.CrudRepository;

import com.mfpe.spring.boot.cvt.model.UserDetails;

public interface UserDetailsRepository extends CrudRepository<UserDetails, Integer> {

}
