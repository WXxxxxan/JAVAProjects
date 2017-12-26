package Device;

public class Device {
	
	public static void main(String[] args) {
		for(int i =0; i <= 3 ; i++){
			for(int j =0; j <= 2-i ;j++){
				System.out.print(" ");
			}
			for(int j =0 ; j <= i*2 ;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i =0; i < 3 ; i++){
			for(int j =0; j <= i ;j++){
				System.out.print(" ");
			}
			for(int j =0; j<= 4-2*i ;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
