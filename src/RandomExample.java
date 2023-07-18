
public class RandomExample {

	public static void main(String[] args) {

		// 1~6까지 랜덤으로 출력되는 랜덤 주사위를 만들어보자 !
		
		int dice = (int) (Math.random()*6 +1);
		                                     // 곱한 숫자는 0을 포함해 차례대로 6개의 정수가 나온다 즉, 0~5까지 따라서 주사위 처럼 1부터 6까지 나오도록 하고 싶으면 1을 더해줌
											 // 1을 더해주면 1~6까지가 됨 (시작 숫자랑 마지막 숫자에 1이 더해진다고 생각하자 !!!
		System.out.println(dice);
		
		
		// char 타입도 가능하다
		char ch = (char) (Math.random()*26+'A');
		System.out.println(ch);
	}

}
