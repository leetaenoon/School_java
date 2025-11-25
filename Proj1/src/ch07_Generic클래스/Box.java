package ch07_Generic클래스;

// 일반 클래스
class Box { 
	private Object item;
	
	Object getItem() { return item; }
	void setItem(Object obj) { this.item = obj; }
}

// 제너릭 클래스 - 제너릭 매개변수 1개
class Box1<T> {
    private T item;

    T getItem() { return item; }
    void setItem(T item) { this.item = item; }
}

// 제너릭 클래스 - 제너릭 매개변수 2개
class Box2<T1, T2> { 
	private T1 item1;
	private T2 item2;
	
	T1 getItem1() { return item1; }
	void setItem1(T1 t) { this.item1 = t; }
	T2 getItem2() { return item2; }
	void setItem2(T2 t) { this.item2 = t; }
}

class Apple { 
	String name = "apple";
}
class Car { 
	int price = 1000;
}
