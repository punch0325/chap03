import java.util.Scanner;

public class TerneryOperatorExample {

	public static void main(String[] args) {

		/*랜덤 메소드*/
		double num2 = Math.random();
		System.out.println(num2);
		
		int num3 = (int) (num2*100);
		System.out.println(num3);
		//랜덤메소드는 double타입이기 때문에 다른 타입의 변수에 대입하고 싶으면 형변환을 시켜주어야 함
		
		
		
		
		
		/*삼항 연산자*/		
		int num1 = (int) (Math.random()*100);
		System.out.print(num1+" : ");
		System.out.println(num1%2==0 ? "짝수" : "홀수");
		                       // 해석 : num1을 2로 나눈 나머지가 0과 같다면(조건식) ? 짝수를 출력하고(true값) : 그렇지 않다면 홀수를 출력해라(false값)
		                       //         조건식 ? true값 : false값
		
		
		
	}

}
