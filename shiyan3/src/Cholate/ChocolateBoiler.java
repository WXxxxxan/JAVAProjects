package Cholate;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private static ChocolateBoiler uniqueInstance;
	private ChocolateBoiler(){
		empty = true;
		boiled = false;
	}
	public static ChocolateBoiler getInstance(){
		if(uniqueInstance == null){
			uniqueInstance = new ChocolateBoiler();
		}
		return uniqueInstance;
	}
	public void fill(){
		if(empty == true){
			System.out.println("Ìî³ä³É¹¦");
			empty = false;
		}
		else{
			System.out.println("¹øÂ¯Î´Çå¿Õ");
		}
	}
	public void boil(){
		if(empty == false && boiled == false){
			System.out.println("¿ªÊ¼Öó");
			boiled =true;
		}
		else if(empty == false && boiled == true){
			System.out.println("ÒÑ¾­Öó·Ð");
		}
		else {
			System.out.println("¹øÂ¯Îª¿Õ");
		}
	}
	public void drain(){
		if(empty == false && boiled == true){
			System.out.println("ÅÅ³ý»ìºÏÎï");
			empty = true;
		}
		else if(empty == false && boiled == false){
			System.out.println("Î´Öó·Ð");
		}
		else {
			System.out.println("¹øÂ¯Îª¿Õ");
		}
	}
	public boolean isEmpty(){
		return empty;
	}
	public boolean isBoiled(){
		return boiled;
	}

}
