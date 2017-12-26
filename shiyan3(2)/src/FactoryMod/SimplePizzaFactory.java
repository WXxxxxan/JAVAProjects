package FactoryMod;

public class SimplePizzaFactory {
	public Pizza createPizza(String type){
		if(type == "cheese"){
			CheesePizza P1 = new CheesePizza();
			P1.prepare();
			P1.bake();
			P1.cut();
			P1.box();
			return P1;
		}
		else if(type == "pepperoni"){
			PepperoniPizza P2 = new PepperoniPizza();
			P2.prepare();
			P2.bake();
			P2.cut();
			P2.box();
			return P2;	
		}
		else if(type == "clam"){
			ClamPizza P3 = new ClamPizza();
			P3.prepare();
			P3.bake();
			P3.cut();
			P3.box();
			return P3;
		}
		return null;
	}
}
