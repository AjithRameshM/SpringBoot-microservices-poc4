package com.department.entity;


import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "DEPARTMENT_TB")
public class Department {

	@Id
	private Long departmentId;
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;
	
}
