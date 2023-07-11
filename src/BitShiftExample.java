
public class BitShiftExample {

	public static void main(String[] args) {

		int num1 = 0b0000_0001;
		
		int result1 = num1 << 1;
		/* 0000_0001 
	            << 1 (왼쪽으로 1번 밀어내는 것)
	       ----------------
	       0000_0010 */
		
		int result2 = num1 << 2;
		/* 0000_0001 
	           << 2 (왼쪽으로 2번 밀어내는 것)
	      ----------------
	       0000_0100 */
		
		int result3 = num1 << 4;
		/* 0000_0001 
              << 4 (왼쪽으로 4번 밀어내는 것)
          ----------------
           0001_0000 */
		
		System.out.println("result1 = "+result1+" , "+"result2 = "+result2+" , "+"result3 = "+result3);
		
	
		
	}

}
