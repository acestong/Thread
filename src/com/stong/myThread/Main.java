package com.stong.myThread;

/**
 * 通过继承Thread类，实现多线程
 * @author stong
 * @since 2020/04/14
 */
public class Main {

	public static void main(String[] args) {
//		通过继承Thread实现多线程
		Thread1 mTh1 = new Thread1("A");
		Thread1 mTh2 = new Thread1("B");
		mTh1.start();
		mTh2.start();
		System.out.println(mTh1.getPriority());
		System.out.println(mTh2.getPriority());
		
//		//通过继承runnable实现多线程
//		new Thread(new Thread1("C")).start();
//		new Thread(new Thread1("D")).start();
		
	}
}


/**
 * 通过继承Thread类实现多线程
 * 
 * 
 * 程序启动运行main时候，java虚拟机启动一个进程，主线程main在main()调用时候被创建。随着调用MitiSay的两个对象的start方法，另外两个线程也启动了，这样，整个应用就在多线程下运行。
 * 注意：start()方法的调用后并不是立即执行多线程代码，而是使得该线程变为可运行态（Runnable），什么时候运行是由操作系统决定的。
 * 从程序运行的结果可以发现，多线程程序是乱序执行。因此，只有乱序执行的代码才有必要设计为多线程。
 * Thread.sleep()方法调用目的是不让当前线程独自霸占该进程所获取的CPU资源，以留出一定时间给其他线程执行的机会。
 * 实际上所有的多线程代码执行顺序都是不确定的，每次执行的结果都是随机的。
 * 但是start方法重复调用的话，会出现java.lang.IllegalThreadStateException异常。
 */
class Thread1 extends Thread{
	
	private String name;
	
	public Thread1(String name){
		this.name = name;
	}
	
	@Override
		public void run() {
			for (int i = 0; i < 5; i++) {
				System.out.println(name + "运行"+ i);
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
 * Thread2类通过实现Runnable接口，使得该类有了多线程类的特征。run（）方法是多线程程序的一个约定。所有的多线程代码都在run方法里面。Thread类实际上也是实现了Runnable接口的类。
 * 在启动的多线程的时候，需要先通过Thread类的构造方法Thread(Runnable target) 构造出对象，然后调用Thread对象的start()方法来运行多线程代码。
 * 实际上所有的多线程代码都是通过运行Thread的start()方法来运行的。因此，不管是扩展Thread类还是实现Runnable接口来实现多线程，最终还是通过Thread的对象的API来控制线程的，熟悉Thread类的API是进行多线程编程的基础。
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
	            System.out.println(name + "运行  :  " + i);
	            try {
	            	Thread.sleep((int) Math.random() * 10);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	}
	
}

