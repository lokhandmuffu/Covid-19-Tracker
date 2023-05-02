package com.mfpe.spring.boot.cvt.repos;

import org.springframework.data.repository.CrudRepository;

import com.mfpe.spring.boot.cvt.model.Feedback;

public interface FeedbackRepository extends CrudRepository<Feedback, Integer> {

}
