package sjf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class sjf2 {
	public static void main(String[] args) throws IOException {
//		test P = new test();
//		P.input();
		File fileout = new File("input.txt");
		Scanner read = new Scanner(new FileInputStream(fileout));
		int taskID[]= new int[150];
		int arrivalTime[]= new int[150];
		int serviceTime[]= new int[150];
		boolean judge1= true;
		boolean judge2= true;
		int startingTime1 = 0;
		int startingTime2 = 1;
		int finishingTime1 = 0;
		int finishingTime2 = 1;
		
		int clock=0;
		for (int i=0; i<100; i++){
			taskID[i]=read.nextInt();
			arrivalTime[i]=read.nextInt();
			serviceTime[i]=read.nextInt();
//			System.out.println(taskID[i]+" "+arrivalTime[i]+" "+serviceTime[i]);
		}
		for(; clock<100; clock++) {	
			
			if (finishingTime1 == finishingTime2) {judge1 = true; judge2 = true;}
			else if (finishingTime1>finishingTime2) {judge2 = true;}
			else {judge1 = true;}
			
			if(judge1==true ) {	
			judge1 = false;
			startingTime1 = finishingTime1;
			finishingTime1 = startingTime1 + serviceTime[clock];
			System.out.println("serve in line 1  "+"taskID:"+taskID[clock]+" "+"arrivalTime:"+arrivalTime[clock]+" "+"serviceTime:"+serviceTime[clock]+" "+"startingTime:"+startingTime1+" "+"finishingTime:"+finishingTime1+" "+"turnAroundTime:"+(finishingTime1-arrivalTime[clock])+" "+"weightTurnAround:"+((finishingTime1-arrivalTime[clock])/serviceTime[clock]));
			if(finishingTime1<100) {					
			    for(int m= clock+2; m<=finishingTime1; m++) {
			    	if(serviceTime[clock+1]>serviceTime[m]) {
			    		int n=0;
			    		n=taskID[clock+1];
			    		taskID[clock+1]=taskID[m];
			    		taskID[m]=n;
			    		
			    		n=arrivalTime[clock+1];
			    		arrivalTime[clock+1]=arrivalTime[m];
			    		arrivalTime[m]=n;
			    		
			    		n=serviceTime[clock+1];
			    		serviceTime[clock+1]=serviceTime[m];
			    		serviceTime[m]=n;
			    	}
				}
			}
			else if(finishingTime1>=100) {
				for(int m= clock+2; m<100; m++) {
			    	if(serviceTime[clock+1]>serviceTime[m]) {
			    		int n=0;
			    		n=taskID[clock+1];
			    		taskID[clock+1]=taskID[m];
			    		taskID[m]=n;
			    		
			    		n=arrivalTime[clock+1];
			    		arrivalTime[clock+1]=arrivalTime[m];
			    		arrivalTime[m]=n;
			    		
			    		n=serviceTime[clock+1];
			    		serviceTime[clock+1]=serviceTime[m];
			    		serviceTime[m]=n;
			    	}					
				}
			}
		  }
			else if(judge2==true ) {	
				judge2 = false;
				startingTime2 = finishingTime2;
				finishingTime2 = startingTime2 + serviceTime[clock];
				System.out.println("serve in line 2  "+"taskID:"+taskID[clock]+" "+"arrivalTime:"+arrivalTime[clock]+" "+"serviceTime:"+serviceTime[clock]+" "+"startingTime:"+startingTime2+" "+"finishingTime:"+finishingTime2+" "+"turnAroundTime:"+(finishingTime2-arrivalTime[clock])+" "+"weightTurnAround:"+((finishingTime2-arrivalTime[clock])/serviceTime[clock]));
				if(finishingTime2<100) {					
				    for(int m= clock+2; m<=finishingTime2; m++) {
				    	if(serviceTime[clock+1]>serviceTime[m]) {
				    		int n=0;
				    		n=taskID[clock+1];
				    		taskID[clock+1]=taskID[m];
				    		taskID[m]=n;
				    		
				    		n=arrivalTime[clock+1];
				    		arrivalTime[clock+1]=arrivalTime[m];
				    		arrivalTime[m]=n;
				    		
				    		n=serviceTime[clock+1];
				    		serviceTime[clock+1]=serviceTime[m];
				    		serviceTime[m]=n;
				    	}
					}
				}
				else if(finishingTime2>=100) {
					for(int m= clock+2; m<100; m++) {
				    	if(serviceTime[clock+1]>serviceTime[m]) {
				    		int n=0;
				    		n=taskID[clock+1];
				    		taskID[clock+1]=taskID[m];
				    		taskID[m]=n;
				    		
				    		n=arrivalTime[clock+1];
				    		arrivalTime[clock+1]=arrivalTime[m];
				    		arrivalTime[m]=n;
				    		
				    		n=serviceTime[clock+1];
				    		serviceTime[clock+1]=serviceTime[m];
				    		serviceTime[m]=n;
				    	}					
					}
				}
			  }
		}	
	}
}