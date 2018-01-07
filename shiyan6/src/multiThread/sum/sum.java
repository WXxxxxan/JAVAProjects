package multiThread.sum;

public class sum {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int sum=0;
		sumThread test1=new sumThread(1, 25);
		sumThread test2=new sumThread(26, 50);
		sumThread test3=new sumThread(51, 75);
		sumThread test4=new sumThread(76, 100);
		Thread threada=new Thread(test1);
		Thread threadb=new Thread(test2);
		Thread threadc=new Thread(test3);
		Thread threadd=new Thread(test4);
		try {
			threada.start();
			threada.join();
			sum+=test1.returnNum();
			threadb.start();
			threadb.join();
			sum+=test2.returnNum();
			threadc.start();
			threadc.join();
			sum+=test3.returnNum();
			threadd.start();
			threadd.join();
			sum+=test4.returnNum();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(sum);
		

	}

}
