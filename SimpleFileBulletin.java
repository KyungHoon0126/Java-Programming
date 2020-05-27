package kr.hs.dgsw.c1.bbs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class SimpleFileBulletin  implements Bulletin 
{
	private static final String PATH = "C:\\java_study\\bulletin.txt";
	
	private File file;
	
	public SimpleFileBulletin() 
	{	
		// ������ �����ϴ��� �˻��� ��, ������ ���ο� ������ �����.
		// if(file.exists() == false)
		// {
		 	file = new File(PATH);
		// }
	}
	
	
	/*
	 * Bulletin �������̽��� �޼��带 Override �ϴ� �۾��� �޼��� 
	 * writing�� ���� ���µ� �ʿ��� ������ ��� �ִ�.
	 */
	@Override
	public void write(Writing writing) 
	{	
		try 
		{
			// true�� ���ִ� ������ �̾�� ���ؼ� �����ش�.
			PrintWriter  pw = new PrintWriter(new FileWriter(this.file, true));
			
			// �ۼ��� �Խñ��� �����.
			// String line = "�Ϸ� ��ȣ : " + writing.getSequence() + "���� : " + writing.getTitle() + "���� : " + writing.getContent() + "���� : " + writing.getWriter();
            String line = writing.getSequence() + "-" + writing.getTitle() + "-"+ writing.getContent() + "-" + writing.getWriter() + "-!";
			
			// ����Ѵ�.
			pw.println(line);;
			
			pw.close();
			
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
	}

	
	/*
	 *  Bulletin �������̽��� �޼��带 Override �ϴ� read �޼���
	 */
	@Override
	public Writing read(int sequence) 
	{	
		List<Writing> postList = list();
		
		for(Writing post : postList)
		{
			if(post.getSequence() == sequence)
			{
				return post;
			}
		}
		
		return null;
	}

	
	/*
	 *  Bulletin �������̽��� �޼��带 Override �ϴ� list �޼���
	 */
	@Override
	public List<Writing> list() 
	{	
		List<Writing> result = new ArrayList<Writing>();
		
		try 
		{
			BufferedReader in = new BufferedReader(new FileReader(this.file));
			
			String line = null;
			
			// file�� Line�� null�� �ƴҶ� ����
			while((line = in.readLine()) != null) 
			{
				// line ���ڿ��� writing Ÿ������ ��ȯ �� ���� �־�� �Ѵ�.
				Writing writing = new Writing();
				int cnt = 0;
				int lastIndex = 0;
				
				for(int i = 0; i < line.length(); i++)
				{
					// �Ϸù�ȣ, ����, ����, ���� ������ �Խñ��� ��� �ǹǷ� cnt�� �̿��� �����Ѵ�. 
					// cnt => 0 : sequence, 1 : title, 2 : content, 3 : writer
					
                    if(line.charAt(i) == '_'&& cnt == 0) 
                    {
                        writing.setSequence(Integer.parseInt(line.substring(0, i)));
                        lastIndex = i;
                        cnt++;
                    }
                    else if (line.charAt(i) == '_'&& cnt == 1) 
                    {
                        writing.setTitle(line.substring(lastIndex+1, i));
                        lastIndex = i;
                        cnt++;
                    }
                    else if(line.charAt(i) == '_'&& cnt == 2) 
                    {
                        writing.setContent(line.substring(lastIndex+1 ,i));
                        lastIndex = i;
                        cnt++;
                    }
                    else if(line.charAt(i) == '_'&& cnt == 3) 
                    {
                        writing.setWriter(line.substring(lastIndex+1, i));
                        lastIndex = i;
                        cnt++;
                    }
                    else if(line.charAt(i) == '!') 
                    {
                        break;
                    }
                }
		
				result.add(writing);
			}
			
			in.close();	
			
		} 
		catch(Exception e) 
		{
			e.printStackTrace();
		}
			
		return result;
	}
	
}
