package com.maxis.webform.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maxis.webform.Models.Field;
import com.maxis.webform.Models.Tab;
import com.maxis.webform.Models.WebForm;
import com.maxis.webform.Service.WebFormService;

@RestController
@RequestMapping("/api")
public class WebformController {
	
	@Autowired
	public WebFormService serv;
	
	@GetMapping("/gets/{code}")
	public WebForm getAlls(@PathVariable("code")int code) {
		WebForm webform =  serv.getAllWebForm(code);
		
		ArrayList<Tab> tab = new ArrayList<>();
		tab = webform.getTab();
		
		ArrayList<Field> field = new ArrayList<>();
		field = webform.getField();
				
		return webform;
	}
	
	@PostMapping("/add")
	public String saveOrupdat(@RequestBody WebForm webForm) {
		serv.saveAll(webForm);		
		return "ha ha";
		
	}
}

	

