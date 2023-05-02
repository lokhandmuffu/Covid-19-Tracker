package com.mfpe.spring.boot.cvt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mfpe.spring.boot.cvt.model.Feedback;
import com.mfpe.spring.boot.cvt.repos.FeedbackRepository;

@RestController
@CrossOrigin(origins="http://localhost:5100")
public class FeedbackController {

	@Autowired
	private FeedbackRepository repository;
	@PostMapping("/feedback")
	public void saveFeed(@RequestBody Feedback feed) {
		repository.save(feed);
	}
}
