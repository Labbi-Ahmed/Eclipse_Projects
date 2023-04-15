package com.maxis.webform.Models;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("WebForm")
public class WebForm {
	
	@Id
	private int id;
	private int code;
	private ArrayList<Tab> tab;
	private ArrayList<Field> field;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public ArrayList<Tab> getTab() {
		return tab;
	}
	public void setTab(ArrayList<Tab> tab) {
		this.tab = tab;
	}
	public ArrayList<Field> getField() {
		return field;
	}
	public void setField(ArrayList<Field> field) {
		this.field = field;
	}
	

	
}
