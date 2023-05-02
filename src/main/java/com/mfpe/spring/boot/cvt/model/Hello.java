package com.mfpe.spring.boot.cvt.model;

public class Hello {
	private String statesearch;
	public String getStatesearch() {
		return statesearch;
	}

	public void setStatesearch(String statesearch) {
		this.statesearch = statesearch;
	}

	@Override
	public String toString() {
		return "Hello [statesearch=" + statesearch + "]";
	}
}
