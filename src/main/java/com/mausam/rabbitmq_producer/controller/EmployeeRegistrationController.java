package com.mausam.rabbitmq_producer.controller;


import com.mausam.rabbitmq_producer.model.Employee;
import com.mausam.rabbitmq_producer.source.EmployeeRegistrationSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableBinding(EmployeeRegistrationSource.class)
public class EmployeeRegistrationController {

	@Autowired
	EmployeeRegistrationSource employeeRegistrationSource;

	@PostMapping("/register")
	public String orderFood(@RequestBody Employee employee) {
		System.out.println("PRODUCER");
		employeeRegistrationSource.employeeRegistration().send(MessageBuilder.withPayload(employee).build());
		System.out.println(employee.toString());
		System.out.println("====================");
		return "Employee Registered";
	}
}