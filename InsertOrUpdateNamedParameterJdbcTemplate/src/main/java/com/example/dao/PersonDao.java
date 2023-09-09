package com.example.dao;

import java.util.List;

import com.example.bean.InsertPersonsBean;

public interface PersonDao {

	Boolean insertPersonDetails(List<InsertPersonsBean> savePersonList);

	Boolean updatePersonDetails(List<InsertPersonsBean> updatePersonList);

}
