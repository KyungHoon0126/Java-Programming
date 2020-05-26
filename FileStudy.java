package kr.hs.dgsw.c1.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

public class FileStudy {

	public static void main(String[] args) {
		
		try {
			File hello = new File("C:\\java_study\\hello.txt");
			// File hello1 = new File("C:\\java_study\\hello1.txt");
			// File directory = new File("C:\\java_study");
			
			/* System.out.println(hello.exists());
			System.out.println(hello1.exists());
			System.out.println(directory.exists());
			
			System.out.println(hello.isFile() + " " + hello.isDirectory());
			System.out.println(hello1.isFile() + " " + hello.isDirectory());
			System.out.println(directory.isFile() + " " + directory.isDirectory());
			
			boolean result = hello1.createNewFile();
			System.out.println("Result of createNewFile : " + result);
			
			File subDirectory = new File(directory, "sub");
			// .createNewFile() : ���ο� ���� ����, mkdir() : ���ο� ���� ����
			subDirectory.mkdir(); */
			
			
			/* mkdir()�� �θ� �������� ������ ���� x <-> mkdirs()�� �θ� ������ ����� ���ϵ� �������ش�.
			File subDirectory2 = new File("C:\\java_exercise\\sub1");
			boolean result = subDirectory2.mkdirs();
			System.out.println("Result of mkdir : " + result); */
			
			
			// ���� ����
			// hello1.delete();
			
			// ���� ����
			// File sub1 = new File(directory, "sub1");
			// sub1.delete();
			
			// �̸� ����
			/* File rename = new File(directory, "hi.txt");
			hello.renameTo(rename); */
			
			// hello.txt�� Hello World ����
			// OutputStream os = new FileOutputStream(hello, true); true�� �ص� ���ٿ� ���Ⱑ ������.
			OutputStream os = new FileOutputStream(hello);

			String txt = "�ȳ��ϼ���";
			byte[] bytes = txt.getBytes();
			byte[] bytes1 = new byte[] { 1, -5, 3, 7 };
			os.write(bytes);
			os.close(); // �׻� close�� ���־�� �Ѵ�.
			
			// �о����
			InputStream is = new FileInputStream(hello);
			
			byte[] buffer = new byte[1024];
			
			int length;
			while ((length = is.read(buffer)) > 0)
			{
				String readText = new String(buffer, 0, length);
				System.out.println(readText);
			}
			
			/* System.out.println("���� : " + length);
			String readText = new String(buffer, 0, length);
			System.out.println("|" + readText + "|"); */
			is.close();
			
			File directory = new File("C:\\java_study");
			String[] files = directory.list();
			
			System.out.println("���� ���");
			for(String fileName : files)
			{
				System.out.println(" " + fileName);
			}
			
			File[] filesList = directory.listFiles();
			System.out.println("���� ���2");
			for(File file : filesList)
			{
				System.out.println(" " + file.getName() +" " + file.isFile());
			}
			
			// FileWriter���� ture�� ������ ������ ������ ����� ������ ���� ������ ���󰣴�.
			BufferedWriter bw = new BufferedWriter(new FileWriter(hello, true));
			
			// ������ ������ �ڿ� �̾ ����.
			PrintWriter pw = new PrintWriter(bw, true);
			pw.write("��" + "\n");
			pw.write("��" + "\n");
			pw.write("��" + "\n");
			pw.write("��" + "\n");
			pw.write("��" + "\n");
			pw.flush(); // ���۸��Ǿ� ���� ��ϵ��� ���� �����͸� ��� ��Ʈ���� ��� ����Ѵ�.
			pw.close(); // ��µ��� ���� �����Ͱ� ������ ���� ����ϰ� ��Ʈ���� �ݴ´�.
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
