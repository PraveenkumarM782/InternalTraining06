package com.example.bean;

import java.util.List;

public class InsertPersonReq {
	private Integer orgId;
	private List<InsertPersonsBean> personsList;

	public Integer getOrgId() {
		return orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}

	public List<InsertPersonsBean> getPersonsList() {
		return personsList;
	}

	public void setPersonsList(List<InsertPersonsBean> personsList) {
		this.personsList = personsList;
	}

}
