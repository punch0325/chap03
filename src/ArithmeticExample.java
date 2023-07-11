
public class ArithmeticExample {

	public static void main(String[] args) {

		long time = System.currentTimeMillis()/1000; //나누기 1000을 하면 초로 변환 
		
		System.out.println(time);
		
//		System.currentTimeMillis()은 epoch time으로 나타난다.
//			- epoch time(unix time) : 1970.01.01 00:00:00 ~ 경과시간 (한국 시간이 아니라 GMT, 즉 국제 표준 시간)
	
		
		long hour = 0, min = 0, sec = 0;
		
		hour = time/60/60%24 + 9; //국제 표준 시간과 한국의 시차는 9시간 차이나기 때문에 한국 시간을 구하고싶으면 9를 더해줌
		min = time/60%60;
		sec = time%60;
		
		System.out.printf("%02d:%02d:%02d",hour,min,sec);
		
	
		
		
		
		
		
		
	}

}
