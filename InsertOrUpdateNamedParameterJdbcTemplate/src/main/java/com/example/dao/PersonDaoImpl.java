package com.example.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Repository;

import com.example.bean.InsertPersonsBean;

@Repository
public class PersonDaoImpl implements PersonDao {
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public Boolean insertPersonDetails(List<InsertPersonsBean> savePersonList) {
		String queryForInsertPersonDetails = "INSERT INTO public.persons_info_ref(person_first_nm, person_last_nm, person_age, person_num, address, state_nm, city_nm, pin_code) VALUES (:personFirstNm, :personLastNm, :personAge, :personNum, :address, :stateNm, :cityNm, :pinCode)";
		SqlParameterSource[] batch = SqlParameterSourceUtils.createBatch(savePersonList);
		return namedParameterJdbcTemplate.batchUpdate(queryForInsertPersonDetails, batch).length > 0;
	}

	@Override
	public Boolean updatePersonDetails(List<InsertPersonsBean> updatePersonList) {
		String queryForUpdatePersonDetails = "UPDATE public.Persons_info_ref SET person_first_nm=:personFirstNm, person_last_nm=:personLastNm, person_age=:personAge, person_num=:personNum, address=:address, state_nm=:stateNm, city_nm=:cityNm, pin_code=:pinCode,version_id=version_id+1, modified_dttm=now() WHERE person_id=:personId";
		SqlParameterSource[] batch = SqlParameterSourceUtils.createBatch(updatePersonList);
		return namedParameterJdbcTemplate.batchUpdate(queryForUpdatePersonDetails, batch).length > 0;

	}

}
