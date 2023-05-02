package com.mfpe.spring.boot.cvt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mfpe.spring.boot.cvt.model.LocationStats;
import com.mfpe.spring.boot.cvt.model.RecoveredStats;
import com.mfpe.spring.boot.cvt.service.CvtDataService;
import com.mfpe.spring.boot.cvt.service.RecoveredDataService;

@RestController
@CrossOrigin(origins="http://localhost:5100")
public class CvtHomeController {

	protected Integer totalReportedCases;
	protected Integer totalNewCases; 
	protected Integer totalRecoveredCases;
	protected Integer totalNewRecoveredCases;
	
    @Autowired
    CvtDataService cvtDataService;

//    @GetMapping("/home")
//    public String home(ModelMap model) {
//        List<LocationStats> allStats = cvtDataService.getAllStats();
//        int totalReportedCases = allStats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
//        int totalNewCases = allStats.stream().mapToInt(stat -> stat.getDiffFromPrevDay()).sum();
//        model.addAttribute("locationStats", allStats);
//        model.addAttribute("totalReportedCases", totalReportedCases);
//        model.addAttribute("totalNewCases", totalNewCases);
//
//        return "home";
//    }
    @GetMapping("/CvtAllCases")
    public List<LocationStats> cvtAll() {
        List<LocationStats> allStats = cvtDataService.getAllStats();
         totalReportedCases = allStats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
        totalNewCases = allStats.stream().mapToInt(stat -> stat.getDiffFromPrevDay()).sum();
        return allStats;
    }
    
    @GetMapping("/CvtAllCases/totalReportedCases")
    public Integer cvtReported() {
    	return totalReportedCases;
    }
    
    @GetMapping("/CvtAllCases/totalNewCases")
    public Integer cvtNewCases() {
    	return totalNewCases;
    }
    
    @Autowired
    RecoveredDataService recoveredDataService;
//    @GetMapping("/CvtRecovered")
//    public String recovered(ModelMap model) {
//        List<RecoveredStats> recoveredStats = recoveredDataService.getAllRecoverdStats();
//        int totalReportedCases = recoveredStats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
//        int totalNewCases = recoveredStats.stream().mapToInt(stat -> stat.getDiffFromPrevDay()).sum();
//        model.addAttribute("recovStats", recoveredStats);
//        model.addAttribute("totalReportedCases", totalReportedCases);
//        model.addAttribute("totalNewCases", totalNewCases);
//
//        return "RecoveredCases";
//    }
    @GetMapping("/CvtRecovered")
    public List<RecoveredStats> recovered() {
        List<RecoveredStats> recoveredStats = recoveredDataService.getAllRecoverdStats();
        totalRecoveredCases = recoveredStats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
        totalNewRecoveredCases = recoveredStats.stream().mapToInt(stat -> stat.getDiffFromPrevDay()).sum();
        return recoveredStats;
    }
    @GetMapping("/CvtRecovered/totalRecoveredCases")
    public Integer cvtRecovered() {
    	return totalRecoveredCases;
    }
    
    @GetMapping("/CvtRecovered/totalNewRecoveredCases")
    public Integer cvtNewRecovered() {
    	return totalNewRecoveredCases;
    }
}
