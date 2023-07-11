
public class ComplexAssignmentExample {

	public static void main(String[] args) {

		int num1 = 100;
		num1 += 10;   //num1 = num1+10; 와 같다
		System.out.println(num1);
		
		int num2 = 100;
		num2 *= 2+3; //복합 대입 연산자는 연산 순위가 가장 나중이기 때문에 오른쪽 항에 있는 계산식이 모두 처리 된 후 연산 된다.
		System.out.println(num2);
		
		
	}

}
