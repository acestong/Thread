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
 * 定义PC产品接口
 * @author stong
 *
 */
interface PC{
	void make();
}

/**
 * 定义小米电脑产品（MiPC）
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
 * 定义苹果类电脑产品
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
