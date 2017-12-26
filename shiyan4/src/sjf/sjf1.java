package sjf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class sjf1 {
		public static void main(String[] agrs) throws IOException {
//			test P = new test();
//			P.input();
			File fileout = new File("input.txt");
			Scanner read = new Scanner(new FileInputStream(fileout));
			int taskID[]= new int[150];
			int arrivalTime[]= new int[150];
			int serviceTime[]= new int[150];
			int startingTime=0;
			int finishingTime = 0;
			int clock=0;
			for (int i=0; i<100; i++){
				taskID[i]=read.nextInt();
				arrivalTime[i]=read.nextInt();
				serviceTime[i]=read.nextInt();
//				System.out.println(taskID[i]+" "+arrivalTime[i]+" "+serviceTime[i]);
			}
			for(; clock<100; clock++) {			
				startingTime = finishingTime;
				finishingTime = startingTime + serviceTime[clock];
				System.out.println("taskID:"+taskID[clock]+" "+"arrivalTime:"+arrivalTime[clock]+" "+"serviceTime:"+serviceTime[clock]+" "+"startingTime:"+startingTime+" "+"finishingTime:"+finishingTime+" "+"turnAround_time:"+(finishingTime-arrivalTime[clock])+" "+"weightTurnAround:"+((finishingTime-arrivalTime[clock])/serviceTime[clock]));
				if(finishingTime<100) {					
				    for(int m= clock+2; m<=finishingTime; m++) {
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
				else if(finishingTime>=100) {
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