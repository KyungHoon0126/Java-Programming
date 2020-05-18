package kr.hs.dgsw.c1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListStudy {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		String[] array = new String[100];
		
		array[0] = "김경훈";
		array[1] = "최진우";
		
		list.add("김경훈");
		list.add("최진우");
		list.add("제정민");
		list.add("권순관");
		
		
		System.out.println("0 : " + array[0]);
		System.out.println("1 : " + array[1]);
		
		System.out.println("0 : " + list.get(0));
		System.out.println("1 : " + list.get(1));
		
		
		System.out.println("데이터 개수 : " + list.size());
		System.out.println("데이터 존재 여부 : " + (list.contains("김경훈") ? "yes" : "no"));
		System.out.println("데이터의 위치 : " + list.indexOf("김경훈"));
		
		list.remove(1);
		list.remove("최진우");
		
		
		// 정렬 전
		for(String item : list)
		{
			System.out.println(item);
		}
		
		list.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		
		// 정렬 후
		for(String item : list)
		{
			System.out.println(item);
		}
	}

}
