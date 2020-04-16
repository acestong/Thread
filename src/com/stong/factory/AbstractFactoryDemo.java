package com.stong.factory;

public class AbstractFactoryDemo {

	public static void main(String[] arg) {
        IAbstractFactory miFactory = new XiaoMiFactory1();
        IAbstractFactory appleFactory = new AppleFactory();
        miFactory.makePhone();            // make xiaomi phone!
        miFactory.makePC();                // make xiaomi PC!
        appleFactory.makePhone();        // make iphone!
        appleFactory.makePC();            // make MAC!
    }
}

/**
 * ����PC��Ʒ�ӿ�
 * @author stong
 *
 */
interface PC{
	void make();
}

/**
 * ����С�׵��Բ�Ʒ��MiPC��
 * @author Administrator
 *
 */
class MiPC implements PC{

	public MiPC() {
		this.make();
	}
	@Override
	public void make() {
		// TODO Auto-generated method stub
		 System.out.println("make xiaomi PC!");
	}
}
/**
 * ����ƻ������Բ�Ʒ
 * @author stong
 *
 */
class MAC implements PC{
	public MAC() {
		this.make();
	}

	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("make MAC!");
	}
}

interface IAbstractFactory{
	Phone makePhone();
	PC makePC();
}


class XiaoMiFactory1 implements IAbstractFactory{
    @Override
    public Phone makePhone() {
        return new MiPhone();
    }
    @Override
    public PC makePC() {
        return new MiPC();
    }
}

class AppleFactory implements IAbstractFactory {
    @Override
    public Phone makePhone() {
        return new IPhone();
    }
    @Override
    public PC makePC() {
        return new MAC();
    }
}