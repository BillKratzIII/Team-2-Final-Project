package com.entity;

/*
 * 12 Week Team A, Group 2
 * User class holds the constructor to make a new user object. Variables along with their
 * getters and setters are used to make matches with other users.
 */
public class User {
	//variables
	int userId = 0;
	String name = null;
	int ageRange = 0;
	String gender = null;
	String streetAddress = null;
	String city = null;
	String state = null;
	int zipCode = 00000;
	String aboutMe = null;
	String email = null;
	String password = null;
	String firstLanguage = null;
	String learningLanguage = null;
	String skillLevel = null;
	
	//constructor
	public User(int userId, String name, int ageRange, String gender, String streetAddress, String city, String state,
			int zipCode, String aboutMe, String email, String password, String firstLanguage, String learningLanguage,
			String skillLevel) {
		this.userId = userId;
		this.name = name;
		this.ageRange = ageRange;
		this.gender = gender;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.aboutMe = aboutMe;
		this.email = email;
		this.password = password;
		this.firstLanguage = firstLanguage;
		this.learningLanguage = learningLanguage;
		this.skillLevel = skillLevel;
	}//constructor

	//default constructor
	public User() {
	}

	/*getters and setters below- */
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAgeRange() {
		return ageRange;
	}

	public void setAgeRange(int ageRange) {
		this.ageRange = ageRange;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getAboutMe() {
		return aboutMe;
	}

	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstLanguage() {
		return firstLanguage;
	}

	public void setFirstLanguage(String firstLanguage) {
		this.firstLanguage = firstLanguage;
	}

	public String getLearningLanguage() {
		return learningLanguage;
	}

	public void setLearningLanguage(String learningLanguage) {
		this.learningLanguage = learningLanguage;
	}

	public String getSkillLevel() {
		return skillLevel;
	}

	public void setSkillLevel(String skillLevel) {
		this.skillLevel = skillLevel;
	}
	
}//class
