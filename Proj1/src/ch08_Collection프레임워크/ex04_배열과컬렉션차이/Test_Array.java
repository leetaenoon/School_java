package ch08_Collection프레임워크.ex04_배열과컬렉션차이;

import java.util.*;
import ch08_Collection프레임워크.common.Student;

public class Test_Array {

	public static void main(String[] args) {
		// String 원소
		// - 추가, 출력, 발견, 제거
		
//		// - 추가
//		String[] strs = new String[5];
//		System.out.println(Arrays.toString(strs));
//		strs[0] = "성구";
//		strs[3] = "현우";
//		System.out.println(Arrays.toString(strs));
//		strs[2] = "지은";
//		System.out.println(Arrays.toString(strs));
//		
//		// - 출력
//		for(String s : strs) {
//			if(s == null) continue;
//			System.out.println(s);
//		}
//		
//		// - 발견
//		String f_s = "성구";
//		for(String s : strs) {
//			if(s != null && s.equals(f_s)) {
//				System.out.println("발견했습니다...");
//				break;
//			}
//		}
//		System.out.println(Arrays.toString(strs));
//		
//		// - 제거
//		String r_s = "성구";
//		for(int i = 0; i < strs.length; i++) {
//			if(strs[i] != null && strs[i].equals(r_s)) {
//				System.out.println("제거합니다...");
//				strs[i] = null;
//				break;
//			}
//		}
//		System.out.println(Arrays.toString(strs));
		
		// Student 원소 
		// - 추가, 출력, 발견, 제거
		
//		// - 추가
//		Student[] sts = new Student[5];
//		System.out.println(Arrays.toString(sts));
//		sts[0] = new Student(1, "성구");
//		sts[3] = new Student(2, "현우");
//		System.out.println(Arrays.toString(sts));
//		sts[2] = new Student(3, "지은");
//		System.out.println(Arrays.toString(sts));
//		
//		// - 출력
//		for(Student st : sts) {
//			if(st == null) continue;
//			System.out.println(st);
//		}
//		
//		// - 발견
//		Student f_s = new Student(1, "성구");
//		for(Student st : sts) {
//			if(st != null && st.equals(f_s)) {
//				System.out.println("발견했습니다...");
//				break;
//			}
//		}
//		System.out.println(Arrays.toString(sts));
//		
//		// - 제거
//		Student r_s = new Student(1, "성구");
//		for(int i = 0; i < sts.length; i++) {
//			if(sts[i] != null && sts[i].equals(r_s)) {
//				System.out.println("제거합니다...");
//				sts[i] = null;
//				break;
//			}
//		}
//		System.out.println(Arrays.toString(sts));
	}
}
