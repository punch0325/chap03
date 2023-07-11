
public class NanInfinityExample {

	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 0;		
//		int result = num1 / num2;     ◀ 프로그래밍 언어에서 정수는 0으로 나눌 수 없음 에러난다.
		
		double d1 = 5.0;
		double d2 = 0.0;
		double result1 = d1 / d2 ;
		double result2 = d1 % d2;
		
		System.out.println(result1);
		System.out.println(result2);
		// 실수에서 0으로 나누면 infinity 또는 NaN(Not a Number)가 나오므로 주의해야한다. 
		
		System.out.println(Double.isInfinite(result1));
		System.out.println(Double.isNaN(result2));
		// 그러므로 isInfinite 메소드와 isNaN메소드를 이용하여 infinity와 NaN이 나왔는지 콘솔 창에 확인해보면 좋다. (infinity와 NaN이면 출력값이 True가 나옴)
		
		
	}

}
