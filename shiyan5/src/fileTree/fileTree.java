package fileTree;

import java.io.File;
import java.util.*;

public class fileTree {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a path:");
		String path = scan.nextLine();
		File list = new File(path);
		File[] tempList = list.listFiles();
		Arrays.asList(tempList);
		for(int i = 0; i<tempList.length;i++){
			if (tempList[i].isDirectory()) {
				System.out.println("文件名："+tempList[i].getName()+" 最后修改日期："+tempList[i].lastModified()+" 文件大小："+tempList[i].length());
			}
		}
		for(int i = 0; i<tempList.length;i++){
			if (tempList[i].isFile()) {
				System.out.println("文件名："+tempList[i].getName()+" 最后修改日期："+tempList[i].lastModified()+" 文件大小："+tempList[i].length());
			}
		}

	}

}
