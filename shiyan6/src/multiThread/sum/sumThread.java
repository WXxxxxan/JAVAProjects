package multiThread.sum;

public class sumThread implements Runnable {
	
	private int start;
	private int end;
	private int number;
	public sumThread(int start,int end) {
		this.start=start;
		this.end=end;
	}
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		synchronized (this) {
			for(;start<=end;start++)
			{
				number+=start;
			}
			
		}

	}
	public int returnNum() {
		return number;
		
	}

}
