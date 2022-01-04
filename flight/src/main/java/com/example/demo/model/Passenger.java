package com.example.demo.model;

public class Passenger {
	private String name;
	private String gender;
	private int age;
	private String meal;
	private int seatNum;
	
	public Passenger(String name, String gender, int age, String meal, int seatNum) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.meal = meal;
		this.seatNum = seatNum;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMeal() {
		return meal;
	}
	public void setMeal(String meal) {
		this.meal = meal;
	}
	public int getSeatNum() {
		return seatNum;
	}
	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
	
	@Override
	public String toString() {
		return "Passenger [name=" + name + ", gender=" + gender + ", age=" + age + ", meal=" + meal + ", seatNum="
				+ seatNum + "]";
	}
}
