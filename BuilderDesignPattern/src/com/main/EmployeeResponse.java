package com.main;

import java.util.Objects;

//immutable
public class EmployeeResponse {
    
	//required
	private Integer age;
	private String firstName;
	
	
	//optional
	private String lastName;
	private Double salary;
	
	private EmployeeResponse(Integer age, String firstName,String lastName,Double salary) {
		this.age=age;
		this.firstName=firstName;
		this.lastName=lastName;
		this.salary=salary;
	}
	public static EmployeeResponseBuilder builder(Integer age,String firstName) {
		return new EmployeeResponseBuilder(age, firstName);
	}
	
	static class EmployeeResponseBuilder{
		private Integer age;
		private String firstName;
		
		
		//optional
		private String lastName;
		private Double salary;
		
		private EmployeeResponseBuilder(Integer age, String firstName) {
			this.age=age;
			this.firstName=firstName;
		}
		
		public static EmployeeResponseBuilder builder(Integer age,String firstName) {
			return new EmployeeResponseBuilder(age, firstName);
		}
		
		public EmployeeResponseBuilder withlastName(String lastName) {
			this.lastName=lastName;
		  return this;
		}
		public EmployeeResponseBuilder withSalary(Double salary) {
			this.salary=salary;
			return this;
		}
		public EmployeeResponse build() {
			if(Objects.isNull(age)) {
				throw new IllegalArgumentException("age should not be null");
			}
			if(Objects.isNull(firstName)) {
				throw new IllegalArgumentException("salary should not be null");
				
			}
			return  new EmployeeResponse(age, firstName, lastName, salary);
		}
		
	}

	@Override
	public String toString() {
		return "EmployeeResponse [age=" + age + ", firstName=" + firstName + ", lastName=" + lastName + ", salary="
				+ salary + "]";
	}
	
	
}
