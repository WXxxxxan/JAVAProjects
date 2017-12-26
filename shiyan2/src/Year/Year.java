package Year;

public class Year {
	public static void main(String[] args) {
		int i=0;
		for(int year = 1900;year <= 2007; year++){
			if(year%4 == 0 && year%100 != 0){
				System.out.print(year+" ");
				i++;
			}
			else if(year %400 == 0){
				System.out.print(year+" ");
				i++;
			}
			if(i==2){
				System.out.println();
				i=0;
			}
		}

	}

}
