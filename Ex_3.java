package java0812;

public class Ex_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		자동차 자동차 = new 자동차();
	    자동차.달리다();

		// 출력 : 자동차가 달립니다.
	    
	    
	    System.out.println(수학.PI);
		// 출력 : 3.141592
	}

}
class 자동차 {
	  
	int 최고속력;

	void 달리다() {
	   System.out.println("자동차가 달립니다.");
	}
}
class 수학 {     // Static 사용하는이유 -> 공유 
	 static double PI = 3.141592; // static 변수 또는 정적변수 
//	 double PI = 3.141592; //객체화 변수
	}
