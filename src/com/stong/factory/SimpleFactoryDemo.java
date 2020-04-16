package com.stong.factory;

/**
 * �򵥹�������ģʽͨ���򹤳�����������ָ��Ҫ�����Ķ���
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
		System.out.println("С��");
	}
	
	
	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("С��");
	}
	
}

class IPhone implements Phone{

	public IPhone() {
		System.out.println("ƻ��");
	}
	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("ƻ��");
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