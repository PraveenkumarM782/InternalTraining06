package com.example.service;

import java.util.ArrayList;


import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.InsertPersonReq;
import com.example.bean.InsertPersonsBean;
import com.example.dao.PersonDao;

@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	PersonDao personDao;

	@Override
	public Boolean insertOrUpdatePersonDetails(InsertPersonReq insertPersonsReq) {
		Boolean insertFlag = false;
		Boolean updateFlag = false;
		if (CollectionUtils.isNotEmpty(insertPersonsReq.getPersonsList())) {
			List<InsertPersonsBean> savePersonList = new ArrayList<>();
			List<InsertPersonsBean> updatePersonList = new ArrayList<>();
			for (InsertPersonsBean insertPersonsObj : insertPersonsReq.getPersonsList()) {
				insertPersonsReq.setOrgId(insertPersonsReq.getOrgId());
				if (insertPersonsObj.getPersonId() == null) {
					savePersonList.add(insertPersonsObj);
				} else {
					updatePersonList.add(insertPersonsObj);
				}
			}
			if (CollectionUtils.isNotEmpty(savePersonList)) {
				insertFlag = personDao.insertPersonDetails(savePersonList);
			}
			if (CollectionUtils.isNotEmpty(updatePersonList)) {
				updateFlag = personDao.updatePersonDetails(updatePersonList);
			}
		}
		return insertFlag || updateFlag;
	}

}
