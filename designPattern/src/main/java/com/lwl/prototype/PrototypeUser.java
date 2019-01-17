package com.lwl.prototype;
/**
 * 浅拷贝使用
 * @author lwl
 * @create 2019年1月17日 上午9:27:37
 * @version 1.0
 */
public class PrototypeUser {

	private String name;
	private String age;
	private String phone;
	private String email;
	
	public PrototypeUser(String name,String age,String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "PrototypeUser [name=" + name + ", age=" + age + ", phone=" + phone + ", email=" + email + "]";
	}
	
}
