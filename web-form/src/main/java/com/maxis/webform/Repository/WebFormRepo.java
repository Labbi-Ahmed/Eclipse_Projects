package com.maxis.webform.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.maxis.webform.Models.WebForm;
public interface WebFormRepo extends MongoRepository<WebForm, Integer> {

}
