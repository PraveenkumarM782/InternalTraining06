package com.example.bean;

import java.util.List;

public class InsertOrUpdatePersonsReq {
	private List<InsertPersonsBean> insertPersonsList;
	private List<UpdatePersonsBean> updatePersonsList;

	public List<InsertPersonsBean> getInsertPersonsList() {
		return insertPersonsList;
	}

	public void setInsertPersonsList(List<InsertPersonsBean> insertPersonsList) {
		this.insertPersonsList = insertPersonsList;
	}

	public List<UpdatePersonsBean> getUpdatePersonsList() {
		return updatePersonsList;
	}

	public void setUpdatePersonsList(List<UpdatePersonsBean> updatePersonsList) {
		this.updatePersonsList = updatePersonsList;
	}
}
