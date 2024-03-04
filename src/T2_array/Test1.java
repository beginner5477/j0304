package T2_array;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] mbc = new int [5];
		for(int i = 0; i < 5; i++)
		{
			System.out.print((i + 1)+"번째 값을 입력하셈:");
			mbc[i] = sc.nextInt();
		}
		for(int i = 0; i < 5; i++)
		{
			System.out.println((i + 1)+"번째 값:" + mbc[i]);
		}
		
		sc.close();
	}
}
