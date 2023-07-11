
public class OverflowUnderflowExample {

	public static void main(String[] args) {

		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		// int 타입의 최댓값과 최소값을 구해주는 메소드, 다른 타입들도 이 메소드를 갖고 있음
		
		System.out.println(max);
		System.out.println(min);
		
		System.out.println("max + 1 = "+(max+1));   //overflow
		System.out.println("min - 1 = "+(min-1));     //underflow

	}

}
