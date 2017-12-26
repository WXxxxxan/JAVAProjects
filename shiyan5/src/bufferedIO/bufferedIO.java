package bufferedIO;

import java.io.*;


public class bufferedIO {

	public static void main(String[] args) {
		File file1 = new File("file.txt");
		File file2 = new File("test.txt");
		try{
			long start=System.currentTimeMillis();
			FileReader fr = new FileReader(file1);
			FileWriter fw = new FileWriter(file2);
			int c;
			while((c = fr.read())!= -1){
				fw.write(c);
			}
			fr.close();
			fw.close();
			long end=System.currentTimeMillis();
			System.out.println("不带缓冲的字符流复制文件用时"+(end-start)+"ms");
		}catch(Exception e){
			e.printStackTrace();
		}
		try{
			long start=System.currentTimeMillis();
			FileReader fr = new FileReader(file1);
			FileWriter fw = new FileWriter(file2);
			BufferedReader bufr = new BufferedReader(fr);
			BufferedWriter bufw = new BufferedWriter(fw);
			String s=null;
			while((s = bufr.readLine())!= null){
				bufw.write(s);
			}
			bufr.close();
			bufw.close();
			fr.close();
			fw.close();
			long end=System.currentTimeMillis();
			System.out.println("带缓冲的字符流复制文件用时"+(end-start)+"ms");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
