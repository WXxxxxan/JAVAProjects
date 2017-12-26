package fcfs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class fcfs1 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
//		test P = new test();
//		P.input();
		File fileout = new File("input.txt");
		Scanner read = new Scanner(new FileInputStream(fileout));
		int taskID[]= new int[150];
		int arrivalTime[]= new int[150];
		int serviceTime[]= new int[150];
		int startingTime = 0;
		int finishingTime = 0;
		int clock = 0;
		for (int i=0; i<100; i++){
			taskID[i]=read.nextInt();
			arrivalTime[i]=read.nextInt();
			serviceTime[i]=read.nextInt();
		}
		for(; clock<100; clock++) {			
			startingTime = finishingTime;
			finishingTime = startingTime + serviceTime[clock];
			System.out.println("taskID:"+taskID[clock]+" "+"arriveTime:"+arrivalTime[clock]+" "+"serviceTime:"+serviceTime[clock]+" "+"startingTime:"+startingTime+" "+"finishingTime:"+finishingTime+" "+"turnAroundTime:"+(finishingTime-arrivalTime[clock])+" "+"weightTurnAround:"+((finishingTime-arrivalTime[clock])/serviceTime[clock]));
		}
	}
}