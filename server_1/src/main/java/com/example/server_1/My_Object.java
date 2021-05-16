package com.example.server_1;

public class My_Object {
	private String name;
	private String city;
	private String eye_color;
	private Integer age;

	public My_Object(String name, String city, String eye_color, Integer age){
		this.name = name;
		this.city = city;
		this.eye_color = eye_color;
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public Integer getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getEye_color() {
		return eye_color;
	}

}
