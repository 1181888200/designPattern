package com.lwl.prototype;

/**
 * 原型模式
 * 	
 * 	原型模式就是用原型实例指定创建对象的种类，并且通过复制这些原型创建新的对象。
 * 
 * 	在原型模式中，所发动创建的对象通过请求原型对象来拷贝原型对象自己来实现创建过程，当然所发动创建的对象需要知道原型对象的类型。
 *  这里也就是说所发动创建的对象只需要知道原型对象的类型就可以获得更多的原型实例对象，至于这些原型对象时如何创建的根本不需要关心。

           讲到原型模式了，我们就不得不区分两个概念：深拷贝、浅拷贝。

           浅拷贝：使用一个已知实例对新创建实例的成员变量逐个赋值，这个方式被称为浅拷贝。

            深拷贝：当一个类的拷贝构造方法，不仅要复制对象的所有非引用成员变量值，还要为引用类型的成员变量创建新的实例，并且初始化为形式参数实例值。
            
            
    模式使用场景

	  1、如果创建新对象成本较大，我们可以利用已有的对象进行复制来获得。
      2、如果系统要保存对象的状态，而对象的状态变化很小，或者对象本身占内存不大的时候，也可以使用原型模式配合备忘录模式来应用。
      	相反，如果对象的状态变化很大，或者对象占用的内存很大，那么采用状态模式会比原型模式更好。 
      3、需要避免使用分层次的工厂类来创建分层次的对象，并且类的实例对象只有一个或很少的几个组合状态，通过复制原型对象得到新实例可能比使用构造函数创建一个新实例更加方便。
      
  模式总结

      1、原型模式向客户隐藏了创建对象的复杂性。客户只需要知道要创建对象的类型，然后通过请求就可以获得和该对象一模一样的新对象，无须知道具体的创建过程。
      2、克隆分为浅克隆和深克隆两种。
      3、我们虽然可以利用原型模式来获得一个新对象，但有时对象的复制可能会相当的复杂，比如深克隆。
 * 
 * 	
 * @author lwl
 * @create 2019年1月9日 下午12:53:43
 * @version 1.0
 */
public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {

//	             原型模式主要包含如下三个角色：
//
//       Prototype：抽象原型类。声明克隆自身的接口。 
//       ConcretePrototype：具体原型类。实现克隆的具体操作。 
//       Client：客户类。让一个原型克隆自身，从而获得一个新的对象。
		
		
		//下面是使用浅拷贝
		// 我们发现被克隆对象的基本属性是可以改变的，但是引用对象的属性一旦改变，则克隆对象和被克隆对象都会被改变
		PrototypeUser user = new PrototypeUser("引用对象", "12", "123456789");
		PrototyClone clone = new PrototyClone(user , "被克隆对象", "男");
		
		//克隆之后的对象
		PrototyClone c = (PrototyClone) clone.clone();
		
		c.setName("克隆之后的对象");
		c.setSex("女");
		
		c.getUser().setEmail("kkkkkkkkk");
		c.getUser().setAge("0000");
		
		System.out.println(clone.toString());
		System.out.println(c.toString());
		
		System.out.println();
		System.out.println();
		
		// 深拷贝就是在克隆对象的同时，把引用对象也通过克隆的方式进行克隆
		
		PrototypeUser2 user2 = new PrototypeUser2("引用对象", "12", "123456789");
		PrototyClone2 clone2 = new PrototyClone2(user2 , "被克隆对象", "男");
		
		//克隆之后的对象
		PrototyClone2 c2 = (PrototyClone2) clone2.clone();
		
		c2.setName("克隆之后的对象");
		c2.setSex("女");
		
		c2.getUser().setEmail("kkkkkkkkk");
		c2.getUser().setAge("0000");
		
		System.out.println(clone2.toString());
		System.out.println(c2.toString());
		
	}

}
