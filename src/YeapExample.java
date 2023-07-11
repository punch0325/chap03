
public class YeapExample {

	public static void main(String[] args) {

//		double oneYear = 365.2422;
//		double fourYear = oneYear * 4;
//		System.out.println(fourYear);
//		
//		System.out.println(365*4);
		
//		double oneYear = 365.2422;
//		double tenyear = oneYear * 100;
//		System.out.println(tenyear);
//		
//		System.out.println(366*25 + 365*75);
		// 4년 마다 한번씩 윤년이 돌아오기 때문에 100년 동안 25년은 윤년(366일), 75년은 평년(365일)이기 때문에 100년의 총 일수는 36525일
		
		
		int year = (int)(Math.random()*5000+1);
		
		System.out.println(year);
		
		String yeap = (year%4==0 && year%100 != 0) || year%400==0 ? "윤년" : "평년";
		
		System.out.println(yeap);

		
	
	}

}
