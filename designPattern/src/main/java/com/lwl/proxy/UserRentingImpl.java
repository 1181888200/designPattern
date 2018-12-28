package com.lwl.proxy;

/**
 * 用户租房
 * @author lwl
 * @create 2018年12月28日 上午8:34:54
 * @version 1.0
 */
public class UserRentingImpl implements IRentingService{

	@Override
	public double renting(double money) {
		 
		System.out.println("用户缴费："+money);
	
		return money;
	}

}
