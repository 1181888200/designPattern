package com.lwl.proxy;


/**
 * 中介租房
 * @author lwl
 * @create 2018年12月28日 上午8:37:02
 * @version 1.0
 */
public class AgencyRentingImpl implements IRentingService{

	//被代理的对象
	private IRentingService renting;	
	
	public AgencyRentingImpl(IRentingService renting) {
		this.renting = renting;
	}
	
	
	@Override
	public double renting(double money) {
		
		System.out.println("中介开始找房子............");
		System.out.println();
		System.out.println();
		System.out.println("中介找到了房子，开始让用户缴费........");
		
		renting.renting(money);
		
		System.out.println("中介从房费中收取10%作为中介费.........");
		System.out.println("中介收到："+money*0.1);
		System.out.println();
		System.out.println();
		
		System.out.println("房东收到房租："+money*0.9);
		
		return money;
	}

}

