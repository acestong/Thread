package com.stong.singleton;

/**
 * 单例模式
 * @author stong
 * @since 2020/04/16
 *
 */
public class mySingleton {

	
	public static void main(String[] args) {
		
		//获取懒汉实例
//		LHan lHan1 = LHan.getInstance();
//		LHan lHan2 = LHan.getInstance();
//		System.out.println(lHan1 == lHan2);
		
		//获取饿汉实例
//		EHan eHan1 = EHan.getInstance();
//		EHan eHan2 = EHan.getInstance();
//		System.out.println(eHan1 == eHan2);
		
		//获取双检锁实例、
//		DoubleCheck instance1 = DoubleCheck.getInstance();
//		DoubleCheck instance2 = DoubleCheck.getInstance();
//		System.out.println(instance1 == instance2);
		
		//获取静态内部类单例实例
//		StaticInnerClass instance1 = StaticInnerClass.getInstance();
//		StaticInnerClass instance2 = StaticInnerClass.getInstance();
//		System.out.println(instance1 == instance2);
		
//		枚举类获取单例实例
	}
}


/**
 * 懒汉模式，实例在用到的时候才回去创建
 * @author stong
 *
 */
class LHan{
	private static LHan instance;
	
	//私有化构造器
	private LHan() {}
	
	public static LHan getInstance() {
		if(instance == null) {
			instance =  new LHan();
		}
		return instance;
	}
	
	
}



/**
 * 饿汉模式，实例在类加载时就创建出来
* @author stong
*/
class EHan{
	//私有化构造器
	private EHan() {}
	
	private static EHan instance = new EHan();
	
	public static EHan getInstance() {
		return instance;
	}
}


/**
*  双检锁
* @author stong
*/
class DoubleCheck{
	//私有化构造器
	private DoubleCheck() {}
	
	private static DoubleCheck instance;
	
	public static DoubleCheck getInstance() {
		
		if(instance == null) {
			synchronized (DoubleCheck.class) {
				if(instance == null) {
					instance = new DoubleCheck();
				}
			}
		}
		return instance;
	}
}

/**
 * 静态内部类
 * @author stong
 *
 */
class StaticInnerClass{
	
	
	private StaticInnerClass() {}
	
	
	private static class SingletonHolder{
		private static final StaticInnerClass INSTANCE = new StaticInnerClass();
	}
	
	public static final StaticInnerClass getInstance() {
		return SingletonHolder.INSTANCE;
	}
}


/**
 * 枚举 单例模式
 * @author Administrator
 *
 */
enum EnumSingleton{
	TEST_INSTANCE;
	
	public void getInstance() {
	}
}
