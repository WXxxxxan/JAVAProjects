package ShuiXianHua;

public class ShuiXianHua {
	
	public static void main(String[] args){
		for(int i = 100;i < 1000; i++){
			int a, b ,c;
			a= i/100;
			b= (i%100)/10; 
			c= i%10;
			if(a*a*a+b*b*b+c*c*c == i){
				System.out.println(i+"是水仙花数");
			}
		}
	}
}
