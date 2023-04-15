package com.maxis.webform.Models;

import java.util.List;

public class Field {
	
	private int code;
	private String title;
	private List<FieldName> fieldName;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<FieldName> getFieldName() {
		return fieldName;
	}
	public void setFieldName(List<FieldName> fieldName) {
		this.fieldName = fieldName;
	}
	
	
}
