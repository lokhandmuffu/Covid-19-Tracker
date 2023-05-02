package com.mfpe.spring.boot.cvt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HospitalDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="hospital_city")
	private String hospitalCity;
	@Column(name="hospital_district")
	private String hospitalDistrict;
	@Column(name="hospital_state")
	private String hospitalState;
	@Column(name="hospital_name")
	private String hospitalName;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getHospitalCity() {
		return hospitalCity;
	}
	public void setHospitalCity(String hospitalCity) {
		this.hospitalCity = hospitalCity;
	}
	public String getHospitalDistrict() {
		return hospitalDistrict;
	}
	public void setHospitalDistrict(String hospitalDistrict) {
		this.hospitalDistrict = hospitalDistrict;
	}
	public String getHospitalState() {
		return hospitalState;
	}
	public void setHospitalState(String hospitalState) {
		this.hospitalState = hospitalState;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	@Override
	public String toString() {
		return "HospitalDetails [id=" + id + ", hospitalCity=" + hospitalCity
				+ ", hospitalDistrict=" + hospitalDistrict + ", hospitalState=" + hospitalState + ", hospitalName="
				+ hospitalName + "]";
	}
	
}
