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
			// .createNewFile() : 새로운 파일 생성, mkdir() : 새로운 폴더 생성
			subDirectory.mkdir(); */
			
			
			/* mkdir()은 부모 존재하지 않으면 생성 x <-> mkdirs()는 부모가 없으면 만들고 파일도 생성해준다.
			File subDirectory2 = new File("C:\\java_exercise\\sub1");
			boolean result = subDirectory2.mkdirs();
			System.out.println("Result of mkdir : " + result); */
			
			
			// 파일 삭제
			// hello1.delete();
			
			// 폴더 삭제
			// File sub1 = new File(directory, "sub1");
			// sub1.delete();
			
			// 이름 변경
			/* File rename = new File(directory, "hi.txt");
			hello.renameTo(rename); */
			
			// hello.txt에 Hello World 쓰기
			// OutputStream os = new FileOutputStream(hello, true); true만 해도 덧붙여 쓰기가 가능함.
			OutputStream os = new FileOutputStream(hello);

			String txt = "안녕하세요";
			byte[] bytes = txt.getBytes();
			byte[] bytes1 = new byte[] { 1, -5, 3, 7 };
			os.write(bytes);
			os.close(); // 항상 close를 해주어야 한다.
			
			// 읽어오기
			InputStream is = new FileInputStream(hello);
			
			byte[] buffer = new byte[1024];
			
			int length;
			while ((length = is.read(buffer)) > 0)
			{
				String readText = new String(buffer, 0, length);
				System.out.println(readText);
			}
			
			/* System.out.println("길이 : " + length);
			String readText = new String(buffer, 0, length);
			System.out.println("|" + readText + "|"); */
			is.close();
			
			File directory = new File("C:\\java_study");
			String[] files = directory.list();
			
			System.out.println("파일 목록");
			for(String fileName : files)
			{
				System.out.println(" " + fileName);
			}
			
			File[] filesList = directory.listFiles();
			System.out.println("파일 목록2");
			for(File file : filesList)
			{
				System.out.println(" " + file.getName() +" " + file.isFile());
			}
			
			// FileWriter에서 ture를 해주지 않으면 파일을 덮어쓰기 때문에 기존 파일이 날라간다.
			BufferedWriter bw = new BufferedWriter(new FileWriter(hello, true));
			
			// 생성된 파일의 뒤에 이어서 쓴다.
			PrintWriter pw = new PrintWriter(bw, true);
			pw.write("덧" + "\n");
			pw.write("붙" + "\n");
			pw.write("여" + "\n");
			pw.write("쓰" + "\n");
			pw.write("기" + "\n");
			pw.flush(); // 버퍼링되어 아직 기록되지 않은 데이터를 출력 스트림에 모두 출력한다.
			pw.close(); // 출력되지 않은 데이터가 있으면 먼저 출력하고 스트림을 닫는다.
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
