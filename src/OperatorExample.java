import java.util.Scanner;

public class OperatorExample {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		/*
		  ● Operator : 연산자
		  ● Operand : 항
		  ● Expression : 연산식
		  	
		        [연산자는 위 -> 아래 차례로 우선순위처리 된다]  
		  		- 1항 : !(not) , ++ , -- (증감연산자는 리터럴이 올 수 없고 변수만 가능하다)
		  		
		  		- 2항
		  		     1) 산술 연산자 : + , - , * , / , %(나눗셈의 나머지를 구하는 연산자)
		  		     2) 비트 쉬프트 : << , >> , >>>
		  		     3) 관계 연산자 : ==(같다) , !=(같지않다) , < . > , <= , >=
		  		     4) 비트 논리   : & . | , ^
		  		     5) 논리 연산자 : &&(and) , ||(or) , ^(xor)
		  		     
		  		- 3항
		  		
		  		- 복합 대입 연산자 : += , -= , *= , /= , <<= , >>= , >>>=
		  		
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = 0;
		
		System.out.print("num1의 숫자를 입력하세요 : ");
		num1 = scan.nextInt();
		
		num1++;
		
		int result = 0;
		result = num1;
		
		System.out.println("num1의 증감 : "+result);

		
	}

}
