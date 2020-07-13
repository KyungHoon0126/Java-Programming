package kr.hs.dgsw.c1.chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerStudy 
{
	public static void main(String[] args) 
	{	
		System.out.println("Start server");
		
		try
		{	
			ServerSocket serverSocket = new ServerSocket(6000);
			System.out.println("Waiting connect");
			Socket socket = serverSocket.accept();
			
			System.out.println("Connected Client");
			OutputStream output = socket.getOutputStream();
		
			// Client에서 받는 데이터
			PrintWriter out = new PrintWriter(output, true);
			
			InputStream input = socket.getInputStream();
			
			// Server에서 내보내는 데이터
			BufferedReader in = new BufferedReader(
					new InputStreamReader(input));
		
			Scanner sc = new Scanner(System.in);
		
			while(true) 
			{
				System.out.print("Server Input Data : ");
				String inputData = sc.nextLine();
				out.println(inputData);
				
				if((inputData=in.readLine()) != null)
				{
					System.out.println("Server Receive : " + inputData);
				}
			}
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
