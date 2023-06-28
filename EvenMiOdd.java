import java.util.*;
class EvenMiOdd{
	static void getDiff(int n)
	{
		int sumOdd = 0, sumEven = 0, a = 1;
		while (n != 0) {
			if (a % 2 == 0)
				sumEven += n % 10;
			else
				sumOdd += n % 10;
			n /= 10;
			a++;
		}
		System.out.println(Math.abs(sumEven - sumOdd));
		
	}
	public static void main(String args[])
	{
		int n = 1234;
		getDiff(n);
	}
}


