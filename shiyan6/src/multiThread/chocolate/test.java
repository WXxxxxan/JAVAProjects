package multiThread.chocolate;


public class test implements Runnable {
	
	private chocolateBoiler test=null;

	public test() {
		test=chocolateBoiler.getInstance();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (test) {
			System.out.println("锅炉是否为空："+test.isEmpty());
			System.out.println("烹煮状态："+test.isBoiled());
			test.isBoiled();
			test.fill();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			test.boil();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			test.drain();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
