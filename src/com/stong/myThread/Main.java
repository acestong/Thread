package com.stong.myThread;

/**
 * ͨ���̳�Thread�࣬ʵ�ֶ��߳�
 * @author stong
 * @since 2020/04/14
 */
public class Main {

	public static void main(String[] args) {
//		ͨ���̳�Threadʵ�ֶ��߳�
		Thread1 mTh1 = new Thread1("A");
		Thread1 mTh2 = new Thread1("B");
		mTh1.start();
		mTh2.start();
		System.out.println(mTh1.getPriority());
		System.out.println(mTh2.getPriority());
		
//		//ͨ���̳�runnableʵ�ֶ��߳�
//		new Thread(new Thread1("C")).start();
//		new Thread(new Thread1("D")).start();
		
	}
}


/**
 * ͨ���̳�Thread��ʵ�ֶ��߳�
 * 
 * 
 * ������������mainʱ��java���������һ�����̣����߳�main��main()����ʱ�򱻴��������ŵ���MitiSay�����������start���������������߳�Ҳ�����ˣ�����������Ӧ�þ��ڶ��߳������С�
 * ע�⣺start()�����ĵ��ú󲢲�������ִ�ж��̴߳��룬����ʹ�ø��̱߳�Ϊ������̬��Runnable����ʲôʱ���������ɲ���ϵͳ�����ġ�
 * �ӳ������еĽ�����Է��֣����̳߳���������ִ�С���ˣ�ֻ������ִ�еĴ�����б�Ҫ���Ϊ���̡߳�
 * Thread.sleep()��������Ŀ���ǲ��õ�ǰ�̶߳��԰�ռ�ý�������ȡ��CPU��Դ��������һ��ʱ��������߳�ִ�еĻ��ᡣ
 * ʵ�������еĶ��̴߳���ִ��˳���ǲ�ȷ���ģ�ÿ��ִ�еĽ����������ġ�
 * ����start�����ظ����õĻ��������java.lang.IllegalThreadStateException�쳣��
 */
class Thread1 extends Thread{
	
	private String name;
	
	public Thread1(String name){
		this.name = name;
	}
	
	@Override
		public void run() {
			for (int i = 0; i < 5; i++) {
				System.out.println(name + "����"+ i);
				try {
					sleep((int)(Math.random()* 10));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
}


/**
 * @author stong
 * 
 * Thread2��ͨ��ʵ��Runnable�ӿڣ�ʹ�ø������˶��߳����������run���������Ƕ��̳߳����һ��Լ�������еĶ��̴߳��붼��run�������档Thread��ʵ����Ҳ��ʵ����Runnable�ӿڵ��ࡣ
 * �������Ķ��̵߳�ʱ����Ҫ��ͨ��Thread��Ĺ��췽��Thread(Runnable target) ���������Ȼ�����Thread�����start()���������ж��̴߳��롣
 * ʵ�������еĶ��̴߳��붼��ͨ������Thread��start()���������еġ���ˣ���������չThread�໹��ʵ��Runnable�ӿ���ʵ�ֶ��̣߳����ջ���ͨ��Thread�Ķ����API�������̵߳ģ���ϤThread���API�ǽ��ж��̱߳�̵Ļ�����
 *
 */
class Thread2 implements Runnable{

	private String name;
	
	public Thread2(String name) {
		this.name = name ;
	}
	
	
	@Override
	public void run() {
		 for (int i = 0; i < 5; i++) {
	            System.out.println(name + "����  :  " + i);
	            try {
	            	Thread.sleep((int) Math.random() * 10);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	}
	
}
