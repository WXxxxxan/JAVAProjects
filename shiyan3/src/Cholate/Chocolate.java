package Cholate;

public class Chocolate {
	public static void main(String[] args){
		ChocolateBoiler C = ChocolateBoiler.getInstance();
		System.out.println("empty = "+C.isEmpty());
		System.out.println("boiled = "+C.isBoiled());
		C.fill();
		System.out.println("empty = "+C.isEmpty());
		System.out.println("boiled = "+C.isBoiled());
		C.boil();
		System.out.println("empty = "+C.isEmpty());
		System.out.println("boiled = "+C.isBoiled());
		C.drain();
		System.out.println("empty = "+C.isEmpty());
		System.out.println("boiled = "+C.isBoiled());
	}
}