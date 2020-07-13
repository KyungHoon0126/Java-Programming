package kr.hs.dgsw.c1.chatting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class ClientStudy 
{
	public static void main(String[] args) 
	{
		File file = new File("ChattingLog.txt");
		FileWriter writer = null;
		BufferedWriter bufferedWriter = null;
		
		// ä�� �α� �ð� ����
		Date now = new Date();
		
		try 
		{
			writer = new FileWriter(file, true);
			bufferedWriter = new BufferedWriter(writer);
			
			InetAddress inet = InetAddress.getLocalHost();
			Socket socket = new Socket(inet, 6000);
			
			System.out.println("Conneting Server...");
			
			OutputStream output = socket.getOutputStream();
			PrintWriter out = new PrintWriter(output, true);
			InputStream input = socket.getInputStream();
			BufferedReader in = 
					new BufferedReader(new InputStreamReader(input));
			
			Scanner sc = new Scanner(System.in);
			
			while(true) 
			{
				String inputData = "";
				
				if((inputData=in.readLine()) != null)
				{
					System.out.println("Client Receive : "+ inputData);
					
					// �������� ���� Message ����
					System.out.println("Chatting Log ���� ��.."); 
					// System.out.println(now +  inputData);
					
					bufferedWriter.write("Server : " + now + " => " + inputData + "\n");
					bufferedWriter.flush();
				}
				
				System.out.print("Client Input Data : ");
				inputData = sc.nextLine();
				
				// Ŭ���̾�Ʈ���� ������ Message ����
				bufferedWriter.write("Client : " + now + " => " + inputData + "\n");
				bufferedWriter.flush();
				
				out.println(inputData);
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}

	}
}
