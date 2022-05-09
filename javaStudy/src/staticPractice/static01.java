/**
 * 5/7 정보처리기사 실기 static 문제
 */
package staticPractice;

class A {
	int a;
	int b;
}

public class static01 {

	static void func1(A m){
		m.a *= 10;
	}
	
	static void func2(A m){
		m.a += m.b;
	}
	
	public static void main(String[] args) {
		A m = new A();
		
		m.a = 100;
		func1(m);
		m.b = m.a;
		func2(m);
		
		System.out.printf("%d", m.a);
	}

}
