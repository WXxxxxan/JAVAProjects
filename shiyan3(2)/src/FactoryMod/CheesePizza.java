package FactoryMod;

public class CheesePizza extends Pizza{
	
	void prepare() {
		System.out.println("Prepare CheesePizza");
	}
	void bake() {
		System.out.println("Bake CheesePizza");
	}
	void cut() {
		System.out.println("Cut CheesePizza");
	}
	void box() {
		System.out.println("Box CheesePizza");
	}

}
