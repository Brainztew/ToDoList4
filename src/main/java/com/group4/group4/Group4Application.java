package com.group4.group4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Group4Application {

	public static void main(String[] args) {
		
		SpringApplication.run(Group4Application.class, args);

		List<String> users = new ArrayList<>();
        String user1 = "Erik";
		String user2 = "Lars";
        System.out.println(UserMangement.addUser(users, user1));
		System.out.println(UserMangement.addUser(users, user2));
		UserMangement.removeUser(users, user2);
		System.out.println(users);
	}

	

}
