//4-12

import java.util.Scanner;

class CurencyConverter{
	
	private static double rate;
	
	public static double toDollar(double won) {
		return won/rate;
	}
	public static double toKWR(double dollar) {
		return dollar * rate;
	}
	public static void setRate(double r) {
		rate = r;
	}
}
public class StaticMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("환율(1달러)>> ");
		double rate = scanner.nextDouble();
		CurencyConverter.setRate(rate);
		System.out.println("백만원은 $"+ CurencyConverter.toDollar(1000000)+"입니다");
		System.out.println("$100은 "+ CurencyConverter.toKWR(100)+"원 입니다");
		scanner.close();
	}

}
