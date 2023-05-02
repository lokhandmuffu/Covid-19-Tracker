package com.mfpe.spring.boot.cvt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Integer userid;
	private String usercity;
	private String userdistrict;
	private String userstate;
	private String usercountry;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUsercity() {
		return usercity;
	}
	public void setUsercity(String usercity) {
		this.usercity = usercity;
	}
	public String getUserdistrict() {
		return userdistrict;
	}
	public void setUserdistrict(String userdistrict) {
		this.userdistrict = userdistrict;
	}
	public String getUserstate() {
		return userstate;
	}
	public void setUserstate(String userstate) {
		this.userstate = userstate;
	}
	public String getUsercountry() {
		return usercountry;
	}
	public void setUsercountry(String usercountry) {
		this.usercountry = usercountry;
	}
	@Override
	public String toString() {
		return "UserAddress [id=" + id + ", userid=" + userid + ", usercity=" + usercity + ", userdistrict="
				+ userdistrict + ", userstate=" + userstate + ", usercountry=" + usercountry + "]";
	}
	
}
