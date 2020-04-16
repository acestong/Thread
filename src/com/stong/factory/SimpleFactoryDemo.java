package com.stong.factory;

/**
 * 简单工厂，该模式通过向工厂传递类型来指定要创建的对象
 * @author stong
 *
 */
public class SimpleFactoryDemo {

	public static void main(String[] args) {
		Phone phone = PhoneFactory.makePhone("MiPhone");
		phone.make();
		Phone phone2 = PhoneFactory.makePhone("IPhone");
		phone2.make();
	}
}


interface Phone{
	void make();
}

class MiPhone implements Phone{

	public MiPhone() {
		System.out.println("小米");
	}
	
	
	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("小米");
	}
	
}

class IPhone implements Phone{

	public IPhone() {
		System.out.println("苹果");
	}
	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("苹果");
	}
}


class PhoneFactory{
	public static Phone makePhone(String type) {
		switch (type) {
		case "MiPhone":
			return new MiPhone();
		case "IPhone":
			return new IPhone();
		default:
			return null;
		}
	}
}