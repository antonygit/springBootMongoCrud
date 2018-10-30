package com.personcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.personservice.PersonService;
import com.urjanet.model.Person;

@RestController
public class PersonController {

	@Autowired
	public PersonService personService;
	
	 @GetMapping("/")
	    public String index() {
	        return "<h3>Greetings from Spring Boot!</h3>";
	    }
	 
	@RequestMapping("/create")
	public Person create (@RequestParam String firstName,@RequestParam String lastName,@RequestParam int age)
	{
		return personService.create(firstName,firstName,age);
 	}
	
	@RequestMapping("/getAll")
	public List<Person> getPerson()
	{
		return personService.getAll();
		
	}
	@RequestMapping("/deleteAll")
	public void deleteAll()
	{
		 personService.deleteAll();
		
	}
	@RequestMapping("/{firstname}")
	public Person getFirstName(@PathVariable("firstname") String firstName)
	{
		 return personService.getUsingFirstName(firstName);
		
	}
	@RequestMapping("/age/{age}")
	public List<Person> getAgeLessThan(@PathVariable("age") int age)
	{
		 return personService.getAgeLessThan(age);
		
	}
}
