package basicIO;

import java.io.*;
import java.util.*;

public class basicIO {
	public static void main(String[] args){
		File file1 = new File("src.txt");
		File file2 = new File("dest.txt");
		Scanner scan = new Scanner(System.in);
		try{
			System.out.println("Enter a line:");
			String str = scan.nextLine();
			FileWriter srcin = new FileWriter(file1);
			srcin.write(str);
			srcin.close();
			FileReader srcout = new FileReader(file1);
			FileWriter destin = new FileWriter(file2);
			int c;
			while((c = srcout.read())!= -1){
				destin.write(c);
			}
			destin.close();
			srcout.close();
			FileReader destout = new FileReader(file2);
			char byt[] = new char[1024];
			int len = destout.read(byt);
			System.out.println(new String(byt,0,len));
			destout.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
