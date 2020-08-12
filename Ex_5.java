package java0812;

public class Ex_5 {

	static int a = 10; // 유연성이 떨어짐
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(a);
		
		출력("안녕");
		// 출력 : 안녕
		
		출력(5);
		// 출력 : 5
	}
	
	
    // 메서드 오버로딩
	static void 출력(String s) {  // 매개변수가 다르면 메서드가 두개여도 알아서 출력
		System.out.println(s);
	}
	static void 출력(int i) {
		System.out.println(i);
	}
	
}