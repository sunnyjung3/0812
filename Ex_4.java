package java0812;

public class Ex_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		사람 a사람1 = new 사람();
		a사람1.이름 = "홍길동";
		a사람1.나이 = 22;
		
		a사람1.자기소개();
		// 출력 : 저는 22살 홍길동 입니다.
		
		사람 a사람2 = new 사람();
		a사람2.이름 = "홍길순";
		a사람2.나이 = 25;
		
		a사람2.자기소개();
		// 출력 : 저는 25살 홍길순 입니다.
		
		a사람1.자기소개();
		// 출력 : 저는 22살 홍길동 입니다.
	}

}
class 사람 {  //공유 될 수 없는 것에는 사용 할 수 없다. static은 nonstatic을 참조 할 수 없다. 
	
	   int 나이;
	   String 이름;
		
	   void 자기소개() {
			System.out.println("저는 " + 나이 + "살 " + 이름 + " 입니다.");
		}
	}