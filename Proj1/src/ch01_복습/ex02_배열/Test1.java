package ch01_복습.ex02_배열;

import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		int [] arr1 = {1,2,3};
		
		String [] arr2 = {"Hi", "Bye", "Queen"};
		
		String ss = "kk";
		Account[] arr3 = {
				new Account(500, ss, 3),
				new Account(500, "Kong", 3)
		};
		
		Account[] arr4;
		arr4 = new Account[55];
		
		String [] arr5;
		arr5 = new String[] {
				"a", "b", "c"
		};
		
		Account[] arr6;
		arr6 = new Account[] {
				new Account(1, "lee", 100),
				new Account(2, "sung", 200),
				new Account(3, "koo", 300),
		};
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		for(int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i].getInfo());
		}
		
//		for(int i = 0; i < arr4.length; i++) {
//			System.out.println(arr4[i]);
//		}
		for(int i = 0; i < arr5.length; i++) {
			System.out.println(arr5[i]);
		}
		for(int i = 0; i < arr6.length; i++) {
			System.out.println(arr6[i].getInfo());
		}
		
		for(String ele : arr2) {
			System.out.println(ele);
		}
		
		for(Account ele2 : arr6) {
			System.out.println(ele2.getInfo());
		}
		
		System.out.println(Arrays.toString(arr2));
		
		
		
	}

}
