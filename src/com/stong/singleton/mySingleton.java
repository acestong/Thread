package com.stong.singleton;

/**
 * ����ģʽ
 * @author stong
 * @since 2020/04/16
 *
 */
public class mySingleton {

	
	public static void main(String[] args) {
		
		//��ȡ����ʵ��
//		LHan lHan1 = LHan.getInstance();
//		LHan lHan2 = LHan.getInstance();
//		System.out.println(lHan1 == lHan2);
		
		//��ȡ����ʵ��
//		EHan eHan1 = EHan.getInstance();
//		EHan eHan2 = EHan.getInstance();
//		System.out.println(eHan1 == eHan2);
		
		//��ȡ˫����ʵ����
//		DoubleCheck instance1 = DoubleCheck.getInstance();
//		DoubleCheck instance2 = DoubleCheck.getInstance();
//		System.out.println(instance1 == instance2);
		
		//��ȡ��̬�ڲ��൥��ʵ��
//		StaticInnerClass instance1 = StaticInnerClass.getInstance();
//		StaticInnerClass instance2 = StaticInnerClass.getInstance();
//		System.out.println(instance1 == instance2);
		
//		ö�����ȡ����ʵ��
	}
}


/**
 * ����ģʽ��ʵ�����õ���ʱ��Ż�ȥ����
 * @author stong
 *
 */
class LHan{
	private static LHan instance;
	
	//˽�л�������
	private LHan() {}
	
	public static LHan getInstance() {
		if(instance == null) {
			instance =  new LHan();
		}
		return instance;
	}
	
	
}



/**
 * ����ģʽ��ʵ���������ʱ�ʹ�������
* @author stong
*/
class EHan{
	//˽�л�������
	private EHan() {}
	
	private static EHan instance = new EHan();
	
	public static EHan getInstance() {
		return instance;
	}
}


/**
*  ˫����
* @author stong
*/
class DoubleCheck{
	//˽�л�������
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
 * ��̬�ڲ���
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
 * ö�� ����ģʽ
 * @author Administrator
 *
 */
enum EnumSingleton{
	TEST_INSTANCE;
	
	public void getInstance() {
	}
}