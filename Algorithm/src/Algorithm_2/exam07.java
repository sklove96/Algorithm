//클래스 예시
package Algorithm_2;

class A {
	private int f1;     //비공개 필드
	protected int f2; //한정공개 필드
	public int f3;      //공개 필드
	
	public A() { //생성자
		
		f1 = f2 = f3 = 0;		
	}
	public A(int f1, int f2, int f3, int f4) { //생성자
		this.f1= f1;
		this.f2=f2;
		this.f3=f3;
	}
	public void setF1(int f) { //메서드 F1의 setter
		f1=f;
	}
	public int getF1() { //메서드 F1의 getter
		return f1;
	}

	public static void main(String[] args) {

	}

}
