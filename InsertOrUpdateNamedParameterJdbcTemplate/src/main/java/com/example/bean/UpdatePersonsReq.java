package com.example.bean;

import java.util.List;

public class UpdatePersonsReq {
	private Integer orgId;
	private List<UpdatePersonsBean> updatePersonsList;

	public Integer getOrgId() {
		return orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}

	public List<UpdatePersonsBean> getUpdatePersonsList() {
		return updatePersonsList;
	}

	public void setUpdatePersonsList(List<UpdatePersonsBean> updatePersonsList) {
		this.updatePersonsList = updatePersonsList;
	}

}
