package kr.hs.dgsw.c1;

import java.util.Arrays;

public class Sort {

    private int[] array;
    private int[] sorted;

    private String[] sArray;
    private String[] sSorted;

    public void setArray(int[] array) {
        this.array = array;
        this.sorted = Arrays.copyOf(array, array.length);
    }

    public void setArray(String[] array) {
        this.sArray = array;
        this.sSorted = Arrays.copyOf(array, array.length);
    }

    public  void execute() {
        if (array != null) {
            this.sorted = sort(sorted);
        } else if(sArray != null) {
            this.sSorted = sort(sSorted);
        }
    }


    public int[] sort(int[] sorted) {
        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = 0; j < sorted.length - 1; j++) {
                if (sorted[j] > sorted[i]) {
                    int temp = sorted[j];
                    sorted[j] = sorted[i];
                    sorted[i] = temp;
                }
            }
        }
		return sorted;
    }

    public String[] sort(String[] sorted) {
        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = 0; j < sorted.length - 1; j++) {
                if (sorted[j].compareTo(sorted[i]) > 0) {
                    String temp = sorted[j];
                    sorted[j] = sorted[i];
                    sorted[i] = temp;
                }
            }
        }
		return sorted;
    }

    public void print() {
    	 if (array != null) {
    	        System.out.println("���� ��");
    	        for (int i = 0; i < array.length; i += 1) {
    	            System.out.print(array[i] + " ");
    	        }
    	        System.out.println();

    	        System.out.println("���");
    	        for (int i = 0; i < sorted.length; i += 1) {
    	            System.out.print(sorted[i] + " ");
    	        }
    	        System.out.println();
    	        array = null;

         } else if(sArray != null) {
             System.out.println("���� ��");
             for (int i = 0; i < sArray.length; i += 1) {
                 System.out.print(sArray[i] + " ");
             }
             System.out.println();

             System.out.println("���");
             for (int i = 0; i < sSorted.length; i += 1) {
                 System.out.print(sSorted[i] + " ");
             }
             System.out.println();

         }
    }

    public static void main(String[] args) {
    	int[] array = new int[] {32, 29, 58, 123, 20, 4, -12, 50};
    	String[] sArray = new String[] {"���μ�", "�̿���", "������", "������", "���Լ�"};

    	Sort sort = new Sort();

    	// ������ ���� �����Ѵ�.
    	sort.setArray(array);

    	// ������ �����Ѵ�.
    	sort.execute();

    	// ����� ����Ѵ�.
    	sort.print();


    	sort.setArray(sArray);
    	sort.execute();
    	sort.print();

    }
}
