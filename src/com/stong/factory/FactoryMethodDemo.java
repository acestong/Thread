package com.stong.factory;

/**
 * 工厂方法模式,和简单工厂模式中工厂负责生产所有产品相比，工厂方法模式将生成具体产品的任务分发给具体的产品工厂
 * @author stong
 *
 */
public class FactoryMethodDemo {

	public static void main(String[] args) {
		AbstractFactory xiaomiFactory = new XiaomiFactory();
		AbstractFactory iPhoneFactory = new IPhoneFactory();
		xiaomiFactory.makePhone();
		iPhoneFactory.makePhone();
	}
}

interface AbstractFactory{
	Phone makePhone();
}

class XiaomiFactory implements AbstractFactory{

	@Override
	public Phone makePhone() {
		// TODO Auto-generated method stub
		return new MiPhone();
	}
}


class IPhoneFactory implements AbstractFactory{

	@Override
	public Phone makePhone() {
		// TODO Auto-generated method stub
		return new IPhone();
	}
	
}