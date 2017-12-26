package ToGradeScore;

public class ToGradeScore {

	public static void main(String[] args) {
		int a[]={55,65,75,85,95};
		for(int i =0; i < 5; i++){
			switch(a[i]/10){
			case 10: ;
			case 9 :System.out.println(a[i]+" 优");break;
			case 8 :System.out.println(a[i]+" 良");break;
			case 7 :System.out.println(a[i]+" 中");break;
			case 6 :System.out.println(a[i]+" 及格");break;
			default:System.out.println(a[i]+" 不及格");break;
			}
		}
		

	}

}
