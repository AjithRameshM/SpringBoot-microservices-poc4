package com.user.entity;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "USER_TB")
public class User {

	@Id
	private Long userId;
	private String firstName;
	private String lastName;
	private String emailId;
	private Long departmentId;
	
}
