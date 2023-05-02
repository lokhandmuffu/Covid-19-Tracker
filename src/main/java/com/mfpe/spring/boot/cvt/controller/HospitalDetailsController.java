package com.mfpe.spring.boot.cvt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mfpe.spring.boot.cvt.model.CvtStates;
import com.mfpe.spring.boot.cvt.model.HospitalDetails;
import com.mfpe.spring.boot.cvt.repos.CvtStatesRepository;
import com.mfpe.spring.boot.cvt.repos.HospitalDetailsRepository;

@RestController
@CrossOrigin(origins="http://localhost:5100")
public class HospitalDetailsController {

	@Autowired
	private HospitalDetailsRepository repository;
	@Autowired
	private CvtStatesRepository stateRepository;
//	@GetMapping("/hospitals")
//	public String hospitals() {
//		return "hospitals";
//	}
//	@PostMapping("/hospitals")
//	public String hello(@ModelAttribute Hello hello,ModelMap model) {
//		String state=hello.getStatesearch();
//		List<HospitalDetails> hospitalstate = repository.findByHospitalstate(state);
//		model.addAttribute("hospitalstate", hospitalstate);
//		return "hospitals";
//	}
	@GetMapping("/india/hospitals")
	public List<HospitalDetails> getAllHospitals(){
		List<HospitalDetails> hospitalDetails= (List<HospitalDetails>) repository.findAll();
		return hospitalDetails;
	}
	
	@GetMapping("/india/hospitals/states")
	public List<CvtStates> getAllStates(){
		List<CvtStates> states=(List<CvtStates>) stateRepository.findAll();
		return states;
	}
	@GetMapping("/india/hospitals/{state}")
	public List<HospitalDetails> getState(@PathVariable String state){
		List<HospitalDetails> hospitalState = repository.findByHospitalState(state);
		System.out.println(hospitalState);
		return hospitalState;
	}
	
}
