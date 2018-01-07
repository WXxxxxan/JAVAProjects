package multiThread.chocolate;

public class chocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private static chocolateBoiler uniqueInstance;
	private chocolateBoiler(){
		empty = true;
		boiled = false;
	}
	public static chocolateBoiler getInstance(){
		if(uniqueInstance == null){
			uniqueInstance = new chocolateBoiler();
		}
		return uniqueInstance;
	}
	public void fill(){
		if(empty == true){
			System.out.println("填充成功");
			empty = false;
		}
		else{
			System.out.println("锅炉未清空");
		}
	}
	public void boil(){
		if(empty == false && boiled == false){
			System.out.println("开始煮");
			boiled =true;
		}
		else if(empty == false && boiled == true){
			System.out.println("已经煮沸");
		}
		else {
			System.out.println("锅炉为空");
		}
	}
	public void drain(){
		if(empty == false && boiled == true){
			System.out.println("排除混合物");
			empty = true;
			boiled = false;
		}
		else if(empty == false && boiled == false){
			System.out.println("未煮沸");
		}
		else {
			System.out.println("锅炉为空");
		}
	}
	public boolean isEmpty(){
		return empty;
	}
	public void setEmpty(boolean empty) {
		this.empty = empty;
	}
	public boolean isBoiled(){
		return boiled;
	}
	public void setBoiled(boolean boiled) {
		this.boiled = boiled;
	}

}