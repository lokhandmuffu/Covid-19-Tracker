package com.mfpe.spring.boot.cvt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mfpe.spring.boot.cvt.model.LocationStats;
import com.mfpe.spring.boot.cvt.model.UserDetails;
import com.mfpe.spring.boot.cvt.repos.UserDetailsRepository;
import com.mfpe.spring.boot.cvt.service.CvtDataService;
@Controller
public class SignUpController {
	@Autowired
    CvtDataService cvtDataService;
	@Autowired
	private UserDetailsRepository repository;
	@GetMapping("/signUp")
	public String userReg() {
		return "signUp";
	}
	@PostMapping("/home")
	public String regResult(@ModelAttribute UserDetails details,ModelMap model) {
		repository.save(details);
		List<LocationStats> allStats = cvtDataService.getAllStats();
        int totalReportedCases = allStats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
        int totalNewCases = allStats.stream().mapToInt(stat -> stat.getDiffFromPrevDay()).sum();
        model.addAttribute("locationStats", allStats);
        model.addAttribute("totalReportedCases", totalReportedCases);
        model.addAttribute("totalNewCases", totalNewCases);
        return "home";

	}
}
