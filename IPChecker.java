package kr.hs.dgsw.uritest;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPChecker 
{
	public static void main(String[] args) 
	{
		try 
		{
			InetAddress inet = InetAddress.getByName("google.com");
			checkIP(inet);
		}
		catch (UnknownHostException e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void checkIP(InetAddress inet)
	{
		try 
		{
			System.out.println(inet);
			System.out.println("isReachable : " + inet.isReachable(1000));
			System.out.println("isLoopbackAddress : " + inet.isLoopbackAddress());
			System.out.println("isReachable : " + inet.isAnyLocalAddress());
			System.out.println("isAnyLocalAddress : " + inet.isLinkLocalAddress());
			System.out.println("isSiteLocalAddress : " + inet.isSiteLocalAddress());
			System.out.println("isMulticastAddress : " + inet.isMulticastAddress());
			System.out.println("isMCGlobal : " + inet.isMCGlobal());
			System.out.println("isMCLinkLocal : " + inet.isMCLinkLocal());
			System.out.println("isMCSiteLocal : " + inet.isMCSiteLocal());
			System.out.println("isMCNodeLocal : " + inet.isMCNodeLocal());
		} 
		catch (Exception e) 
		{
			e.printStackTrace();	
		}
	}
}
