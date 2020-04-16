package com.stong.factory;

/**
 * ��������ģʽ,�ͼ򵥹���ģʽ�й��������������в�Ʒ��ȣ���������ģʽ�����ɾ����Ʒ������ַ�������Ĳ�Ʒ����
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