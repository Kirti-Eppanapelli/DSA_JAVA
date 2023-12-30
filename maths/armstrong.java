import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int n,arm=0,rem=0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int c=n;
		while(n>0)
		{
			rem=n % 10;
			arm= (rem* rem* rem) + arm;
			n = n/10;
		}
		if(c==arm)
		{
			System.out.println("true");
		}
		else{
		System.out.println("false");
		}
	}
}