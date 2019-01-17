package com.lwl.prototype;
/**
 * 深拷贝使用
 * @author lwl
 * @create 2019年1月17日 上午9:28:55
 * @version 1.0
 */
public class PrototyClone2 implements Cloneable {


	private String name;
	private String sex;
	private String address;
	private String pwd;
	private PrototypeUser2 user;
	
	public PrototyClone2(PrototypeUser2 user,String name,String sex) {
		 this.user = user;
		 this.name = name;
		 this.sex = sex;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public PrototypeUser2 getUser() {
		return user;
	}
	public void setUser(PrototypeUser2 user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "PrototyClone [name=" + name + ", sex=" + sex + ", address=" + address + ", pwd=" + pwd + ", user="
				+ user.toString() + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		PrototyClone2 clone = null;
		clone = (PrototyClone2) super.clone();
		//将引用对象也使用克隆
		clone.user = (PrototypeUser2) user.clone();
		return clone;
	}
	
	
	
}
