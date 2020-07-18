package kr.hs.dgsw.uritest;

import java.net.URI;
import java.net.URL;

public class URITest 
{
	public static void main(String[] args) 
	{
		try
		{
			// 첫 번째 / 부터 ? 전까지는 :  path
			URI uri = new URI("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EB%8C%80%EA%B5%AC+%EC%86%8C%ED%94%84%ED%8A%B8%EC%9B%A8%EC%96%B4+%EA%B3%A0%EB%93%B1%ED%95%99%EA%B5%90#dgsw");
			showURIInfo(uri);
			
			URL url = new URL("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EB%8C%80%EA%B5%AC+%EC%86%8C%ED%94%84%ED%8A%B8%EC%9B%A8%EC%96%B4+%EA%B3%A0%EB%93%B1%ED%95%99%EA%B5%90#dgsw");
			showURLInfo(url);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

	private static void showURIInfo(URI uri) 
	{
		System.out.println("URI Info");
		System.out.println("getScheme : " + uri.getScheme());
		System.out.println("getHost" + uri.getHost());
		System.out.println("getPath" + uri.getPath());
		System.out.println("getFragment : " + uri.getFragment());
		System.out.println("getPort : " + uri.getPort());
		System.out.println("getQuery : " + uri.getQuery()); 
		System.out.println("getAuthority : " + uri.getAuthority()); 
		System.out.println("getUserInfo : " + uri.getUserInfo()); 
		
	}
	
	private static void showURLInfo(URL url)
	{
		System.out.println("URL Info");
		System.out.println("getProtocol : " + url.getProtocol());
		System.out.println("getHost" + url.getHost());
		System.out.println("getPath" + url.getPath());
		System.out.println("getRef" + url.getRef());
		System.out.println("getPort : " + url.getPort());
		System.out.println("getQuery : " + url.getQuery());
		System.out.println("getPort : " + url.getAuthority());
		System.out.println("getQuery : " + url.getUserInfo());
		
	}

}
