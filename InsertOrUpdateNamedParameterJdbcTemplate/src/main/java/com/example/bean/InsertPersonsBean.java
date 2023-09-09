package com.example.bean;

import java.sql.Timestamp;

public class InsertPersonsBean {
	private Long personId;
	private String personFirstNm;
	private String personLastNm;
	private Integer personAge;
	private Integer personNum;
	private String address;
	private String stateNm;
	private String cityNm;
	private String pinCode;
	private String personBatchNm;
	private Integer versionId;
	private Timestamp modifiedDttm;
	private Integer orgId;

	public Integer getOrgId() {
		return orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	public String getPersonFirstNm() {
		return personFirstNm;
	}

	public void setPersonFirstNm(String personFirstNm) {
		this.personFirstNm = personFirstNm;
	}

	public String getPersonLastNm() {
		return personLastNm;
	}

	public void setPersonLastNm(String personLastNm) {
		this.personLastNm = personLastNm;
	}

	public Integer getPersonAge() {
		return personAge;
	}

	public void setPersonAge(Integer personAge) {
		this.personAge = personAge;
	}

	public Integer getPersonNum() {
		return personNum;
	}

	public void setPersonNum(Integer personNum) {
		this.personNum = personNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStateNm() {
		return stateNm;
	}

	public void setStateNm(String stateNm) {
		this.stateNm = stateNm;
	}

	public String getCityNm() {
		return cityNm;
	}

	public void setCityNm(String cityNm) {
		this.cityNm = cityNm;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getPersonBatchNm() {
		return personBatchNm;
	}

	public void setPersonBatchNm(String personBatchNm) {
		this.personBatchNm = personBatchNm;
	}

	public Integer getVersionId() {
		return versionId;
	}

	public void setVersionId(Integer versionId) {
		this.versionId = versionId;
	}

	public Timestamp getModifiedDttm() {
		return modifiedDttm;
	}

	public void setModifiedDttm(Timestamp modifiedDttm) {
		this.modifiedDttm = modifiedDttm;
	}

}
