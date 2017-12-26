package FactoryMod;

public class PizzaStore {
	private SimplePizzaFactory p;
	PizzaStore(){
		p = new SimplePizzaFactory();
		
	}
	public Pizza orderPizza(String type){
		Pizza Pz;
		Pz = p.createPizza(type);
		return Pz;
	}
}
