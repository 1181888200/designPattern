package com.lwl.prototype;

/**
 * 浅拷贝使用
 * @author lwl
 * @create 2019年1月17日 上午9:28:35
 * @version 1.0
 */
public class PrototyClone implements Cloneable {

	private String name;
	private String sex;
	private String address;
	private String pwd;
	private PrototypeUser user;
	
	public PrototyClone(PrototypeUser user,String name,String sex) {
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
	public PrototypeUser getUser() {
		return user;
	}
	public void setUser(PrototypeUser user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "PrototyClone [name=" + name + ", sex=" + sex + ", address=" + address + ", pwd=" + pwd + ", user="
				+ user.toString() + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		PrototyClone clone = null;
		
		clone = (PrototyClone) super.clone();
		
		return clone;
	}
	
	
	
}
