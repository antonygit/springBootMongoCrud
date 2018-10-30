package com.urjanet.MongoDbCRUD;

import java.net.MalformedURLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Controller;

import com.personservice.PersonService;

@Controller
@SpringBootApplication(scanBasePackages={
"com.personcontroller", "com.personservice","com.urjanet.model"})
 @EnableMongoRepositories(basePackages="com.urjanet.respository")


 public class MongoDbCrudApplication {

	public static void main(String[] args)  throws MalformedURLException{
		SpringApplication.run(MongoDbCrudApplication.class, args);
	}
}
