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
		
		array[0] = "�����";
		array[1] = "������";
		
		list.add("�����");
		list.add("������");
		list.add("������");
		list.add("�Ǽ���");
		
		
		System.out.println("0 : " + array[0]);
		System.out.println("1 : " + array[1]);
		
		System.out.println("0 : " + list.get(0));
		System.out.println("1 : " + list.get(1));
		
		
		System.out.println("������ ���� : " + list.size());
		System.out.println("������ ���� ���� : " + (list.contains("�����") ? "yes" : "no"));
		System.out.println("�������� ��ġ : " + list.indexOf("�����"));
		
		list.remove(1);
		list.remove("������");
		
		
		// ���� ��
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
		
		// ���� ��
		for(String item : list)
		{
			System.out.println(item);
		}
	}

}
