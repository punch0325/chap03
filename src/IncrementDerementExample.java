
public class IncrementDerementExample {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 10;
		int num3 = 10;
		int result1 , result2 = 0;
		
		++num1 ; // num = num+1과 같다
		
		System.out.println(num1);
		
		
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println();

		result1 = ++num2 + 10;
		result2 = num3++ + 10;
		
		System.out.println("++num2 + 10 = "+result1);
		System.out.println("num3++ + 10 = "+result2);
		System.out.println("최종 num2의 값 : "+num2);
		System.out.println("최종 num3의 값 : "+num3);
		
//		증감연산자가 변수의 앞에 붙어 있으면 연산 순위가 높기 때문에 변수의 값이 가장 먼저 증감이 된 후 나머지 계산식을 처리하지만,
//		증감연산자가 변수의 뒤에 붙어 있으면 연산 순위가 낮기 때문에 모든 계산식이 끝난 후 변수의 값이 증감 된다.
//		따라서 계산식에는 증감된 변수의 값이 적용되지 않는다.
		
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println();
		
		int number1 = 10;
		int number2 = 10;
		
//		System.out.println(++number1);   ▶  ++이 앞에 붙으면 변수가 본인의 값에 1을 더한 후 출력함
//		System.out.println(number2++);  ▶ ++이 뒤에 붙으면 변수가 본인의 원래 값을 출력 후 1을 더함 
		
		int result3 = ++number1;
		int result4 = number2++;
		
		System.out.println(result3);
		System.out.println(result4);

	
	}

}
