package winsock.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class clientManager {
	private BufferedReader reader;
	private PrintWriter writer;
	private Socket socket;
	private clientView cView;
	public void getserver(){
		try {
			cView=new clientView("客户端端口");
			cView.setSize(300,400);
			cView.setVisible(true);
			System.out.println("客户端端口创建成功");
			socket=new Socket("127.0.0.1",8998);
			System.out.println("客户端套接字创建成功");
				reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
				writer=new PrintWriter(socket.getOutputStream(),true);
				cView.setWriter(writer);
				getClientMessage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private void getClientMessage(){
		try {
			String line;
			System.out.println("开始获取服务器信息");
		
				while ((line = reader.readLine()) != null) {
					System.out.println("服务器："+line);
					cView.appendText("服务器："+line);
				}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("异常1");
		}
	}

}
