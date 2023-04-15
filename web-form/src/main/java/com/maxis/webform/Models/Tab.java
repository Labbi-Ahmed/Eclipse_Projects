package com.maxis.webform.Models;

import java.util.ArrayList;
import java.util.List;

public class Tab {
	private int code;
	private String title;
	private ArrayList<Section> section;
	private ArrayList<Field> field;
	
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
	
	public List<Section> getSection() {
		return section;
	}
	
	public void setSection(ArrayList<Section> section) {
		this.section = section;
	}
	
	public ArrayList<Field> getField() {
		return field;
	}
	
	public void setField(ArrayList<Field> field) {
		this.field = field;
	}
	
}
