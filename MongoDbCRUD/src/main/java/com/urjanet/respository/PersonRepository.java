package com.urjanet.respository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.urjanet.model.Person;

public interface PersonRepository extends MongoRepository<Person, String> {
	public Person findByFirstName(String firstName);
	public List<Person> findByage(int age);
	public List<Person> findByAgeLessThan(int age);
 
	
	

}
