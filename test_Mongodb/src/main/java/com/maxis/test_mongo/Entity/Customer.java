package com.maxis.test_mongo.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Customer")
public class Customer {

  @Id
  public String id;

  private String firstName;
  private String lastName;

  public Customer(String id, String firstName, String lastName) {
	
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public Customer() {}

  public Customer(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return String.format(
        "Customer[id=%s, firstName='%s', lastName='%s']",
        id, firstName, lastName);
  }

}