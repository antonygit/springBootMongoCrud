package com.personservice;
import com.urjanet.respository.PersonRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.urjanet.model.Person;

@Service
public class PersonService {
	
	@Autowired
	public PersonRepository personRepository;
	
	
	//Create new Person Record
	public Person create (String firstName,String lastName,int age)throws NullPointerException
	{
		 return personRepository.save(new Person(firstName,lastName,age));
	}
	
	public List<Person> getAll()
	{
		return personRepository.findAll();
	}
	
	public void  deleteAll()
	{
		personRepository.deleteAll();
	}
	
	public Person  getUsingFirstName(String firstname)
	{
		return personRepository.findByFirstName(firstname);
	}
	
	
	public List<Person> getAgeLessThan(int age)
	{
		return personRepository.findByAgeLessThan(age);
	}

}
