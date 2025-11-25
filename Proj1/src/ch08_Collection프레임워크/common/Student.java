package ch08_Collection프레임워크.common;

import java.util.Objects;

public class Student implements Comparable<Student> {
	private int id;
	private String name;

	public Student() { }
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() { return id; }
	public String getName() { return name; }
	
	// ------------ toString( ) 재정의 -----------------
	@Override
	public String toString() {
		return "id:" + id + " name:" + name;
	}

	// ------------ equals( ) 재정의 -----------------
	// case1: id 기준
//	@Override
//	public boolean equals(Object other) {
//		if (!(other instanceof Student)) return false;
//		Student other1 = (Student) other;
//		return this.id == other1.id; // return Objects.equals(this.id, other.id) // 비효율
//	}
	
	// case2: name 기준
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof Student)) return false;  
		Student other1 = (Student) other;
		return Objects.equals(this.name, other1.name); // return this.name.equals(other1.name); // null 처리 불가
	}
	
	// case3: id + name 기준
//	@Override
//	public boolean equals(Object other) {
//		if (!(other instanceof Student)) return false;  
//		Student other1 = (Student) other;
// 		return this.id == other1.id && 
// 				Objects.equals(this.name, other1.name); // this.name.equals(other1.name); // null 처리 불가
//	}
	
	// ------------ hashCode( ) 재정의 -----------------
	// case1: id 기준
//	@Override
//	public int hashCode() {
//		return id; // return Objects.hash(id); 비효율
//	}
	
	// case2: name 기준
	@Override
	public int hashCode() {	
		return Objects.hash(name); // return name.hashCode(); // null 처리 불가
	}
	
	// case3: id + name 기준
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, name); // return id + name.hashCode(); // null 처리 불가
//	}
	
	// ------------ compareTo( ) 재정의 -----------------
	// case1: id 기준
//	@Override
//	public int compareTo(Student other) {
//		return this.id - other.id; 
//	}
	
	// case2: name 기준
	@Override
	public int compareTo(Student other) {
	    if (this.name == null && other.name == null) return 0; // 둘 다 null -> 정렬상 동등
	    if (this.name == null) return -1;  // this 더 작다고 간주 -> Tree 좌측 배치
	    if (other.name == null) return 1;  // this 더 크다고 간주 -> Tree 우측 배치
	    return this.name.compareTo(other.name); // 문자열 사전식 비교 (오름차순), null 처리 불가하므로 앞에서 반드시 처리
	}

	// case3: id + name 기준
//	@Override
//	public int compareTo(Student other) {
//	    // (1) 1차 기준: id 비교
//	    int result = this.id - other.id;
//	    if (result != 0) return result; // id가 다르면 즉시 정렬 결정
//	    // (2) 2차 기준: name 비교
//    	if (this.name == null && other.name == null) return 0; // 둘 다 null → 정렬상 동등
//    	if (this.name == null) return -1;  // this 더 작다고 간주 -> Tree 좌측 배치
//    	if (other.name == null) return 1;  // this 더 크다고 간주 -> Tree 우측 배치
//    	return this.name.compareTo(other.name); // 문자열 사전식 비교 (오름차순), null 처리 불가하므로 앞에서 반드시 처리
//	}
}

