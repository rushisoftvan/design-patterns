package com.main;

public class Main {
  public static void main(String[] args) {
	EmployeeResponse build = EmployeeResponse.builder(23, "rushikesh")
			.withlastName("malvadkar")
			.build();
	System.out.println(build);
}
}
