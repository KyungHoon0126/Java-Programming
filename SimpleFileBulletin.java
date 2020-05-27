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
		// 파일이 존재하는지 검사한 후, 없으면 새로운 파일을 만든다.
		// if(file.exists() == false)
		// {
		 	file = new File(PATH);
		// }
	}
	
	
	/*
	 * Bulletin 인터페이스의 메서드를 Override 하는 글쓰기 메서드 
	 * writing은 글을 쓰는데 필요한 정보를 담고 있다.
	 */
	@Override
	public void write(Writing writing) 
	{	
		try 
		{
			// true를 해주는 이유는 이어쓰기 위해서 적어준다.
			PrintWriter  pw = new PrintWriter(new FileWriter(this.file, true));
			
			// 작성할 게시글을 만든다.
			// String line = "일련 번호 : " + writing.getSequence() + "제목 : " + writing.getTitle() + "내용 : " + writing.getContent() + "저자 : " + writing.getWriter();
            String line = writing.getSequence() + "-" + writing.getTitle() + "-"+ writing.getContent() + "-" + writing.getWriter() + "-!";
			
			// 기록한다.
			pw.println(line);;
			
			pw.close();
			
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
	}

	
	/*
	 *  Bulletin 인터페이스의 메서드를 Override 하는 read 메서드
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
	 *  Bulletin 인터페이스의 메서드를 Override 하는 list 메서드
	 */
	@Override
	public List<Writing> list() 
	{	
		List<Writing> result = new ArrayList<Writing>();
		
		try 
		{
			BufferedReader in = new BufferedReader(new FileReader(this.file));
			
			String line = null;
			
			// file의 Line이 null이 아닐때 까지
			while((line = in.readLine()) != null) 
			{
				// line 문자열을 writing 타입으로 변환 후 값을 넣어야 한다.
				Writing writing = new Writing();
				int cnt = 0;
				int lastIndex = 0;
				
				for(int i = 0; i < line.length(); i++)
				{
					// 일련번호, 제목, 내용, 저자 순으로 게시글이 기록 되므로 cnt를 이용해 구분한다. 
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
