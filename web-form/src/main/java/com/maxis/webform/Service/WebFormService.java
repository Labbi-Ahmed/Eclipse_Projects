package com.maxis.webform.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxis.webform.Models.WebForm;
import com.maxis.webform.Repository.WebFormRepo;

@Service
public class WebFormService {
	
	@Autowired
	public WebFormRepo wrepo;
	
	public int saveAll(WebForm webForm) {
		
		wrepo.save(webForm);
		return 200;
	}

	public WebForm getAllWebForm(int code) {
		// TODO Auto-generated method stub
		return wrepo.findById(code).get();
	}
	

}
