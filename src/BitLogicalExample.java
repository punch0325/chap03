
public class BitLogicalExample {

	public static void main(String[] args) {

		int num1 = 0b1111_1000;
		int num2 = 0b0001_1111;
		
		int result1 = num1 & num2;
		/* 1111_1000
		        & (두 비트 모두 1일 경우에만 연산 결과가 1)
		    0001_1111
		  -------------------
		    0001_1000  ▶ 24 */
		
		int result2 = num1 | num2;
		/* 1111_1000
                 | (두 비트 중 하나만  1이어도 연산 결과가 1)
            0001_1111
         -------------------
            1111_1111  ▶ 255 */
		
		int result3 = num1 ^ num2;
		/* 1111_1000
                  ^ (두 비트가 서로 달라야 연산 결과가 1)
            0001_1111
          -------------------
            1110_0111  ▶ 231 */
		
		System.out.println("result1 = "+result1+" , "+"result2 = "+result2+" , "+"result3 = "+result3);
	}

}
