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
			System.out.println("���ɹ�");
			empty = false;
		}
		else{
			System.out.println("��¯δ���");
		}
	}
	public void boil(){
		if(empty == false && boiled == false){
			System.out.println("��ʼ��");
			boiled =true;
		}
		else if(empty == false && boiled == true){
			System.out.println("�Ѿ����");
		}
		else {
			System.out.println("��¯Ϊ��");
		}
	}
	public void drain(){
		if(empty == false && boiled == true){
			System.out.println("�ų������");
			empty = true;
		}
		else if(empty == false && boiled == false){
			System.out.println("δ���");
		}
		else {
			System.out.println("��¯Ϊ��");
		}
	}
	public boolean isEmpty(){
		return empty;
	}
	public boolean isBoiled(){
		return boiled;
	}

}
