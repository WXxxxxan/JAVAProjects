package winsock.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class serverManager {
	private BufferedReader reader;
	private PrintWriter writer;
	private ServerSocket serverSocket;
	private Socket socket;
	private serverView sView;
	public void getserver(){
		try {
			sView=new serverView("服务器端口");
			sView.setSize(300,400);
			sView.setVisible(true);
			System.out.println("服务器端口创建成功");
			serverSocket=new ServerSocket(8998);
			System.out.println("服务器套接字已经创建成功");
			while(true){
				System.out.println("等待客户机连接");
				socket=serverSocket.accept();
				System.out.println("客户机连接成功");
				reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
				writer=new PrintWriter(socket.getOutputStream(),true);
				sView.setWriter(writer);
				getClientMessage();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private void getClientMessage(){
		try {
			String line;
			System.out.println("开始获得客户端信息");
		
				while ((line = reader.readLine()) != null) {
					System.out.println("客户端："+line);
					sView.appendText("客户端："+line);
				}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("异常1");
		}
	}

}
