package kr.hs.dgsw.uri;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class UriMain 
{
	public static void main(String[] args) 
	{
		try 
		{
			// URI uri = new URI("https://namu.wiki/w/WWW");
			// URI uri = new URI("https://search.naver.com/search.naver?sm=top_hty&fbm=0&ie=utf8&query=%EB%8C%80%EA%B5%AC%EC%86%8C%ED%94%84%ED%8A%B8%EC%9B%A8%EC%96%B4%EA%B3%A0%EB%93%B1%ED%95%99%EA%B5%90");
			// printUri(uri);
			
			URL url = new URL("https://search.naver.com/search.naver?sm=top_hty&fbm=0&ie=utf8&query=%EB%8C%80%EA%B5%AC%EC%86%8C%ED%94%84%ED%8A%B8%EC%9B%A8%EC%96%B4%EA%B3%A0%EB%93%B1%ED%95%99%EA%B5%90");
			printUrl(url);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	// URI
	public static void printUri(URI uri)
	{
		System.out.println("Uri : " + uri);
		System.out.println("Schema : " + uri.getScheme());
		System.out.println("Host : " + uri.getHost());
		System.out.println("Port : " + uri.getPort());
		System.out.println("Path : " + uri.getPath());
		System.out.println("Fragment : " + uri.getFragment());
		System.out.println("UserInfo : " + uri.getUserInfo());
		System.out.println("Query : " + uri.getQuery());
	}
	
	// URL
	public static void printUrl(URL url)
	{
		System.out.println("Url : " +  url);
		System.out.println("Protocol : " + url.getProtocol());
		System.out.println("Host : " + url.getHost());
		System.out.println("Port : " + url.getPort());
		System.out.println("Path : " + url.getPath());
		System.out.println("UserInfo : " + url.getUserInfo());
		System.out.println("Query : " + url.getQuery());
	}
}
