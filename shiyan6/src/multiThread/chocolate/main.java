package multiThread.chocolate;

public class main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		test tester= new test();
		Thread t1=new Thread(tester);
		Thread t2=new Thread(tester);
		Thread t3=new Thread(tester);
		t1.start();
		t2.start();
		t3.start();
		

	}

}
