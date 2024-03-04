package T3_example;

import java.util.Scanner;

//10개 정수 입력받아서 최대 최소값 구하기~
//2자리 이하의 정수가 입력된다.
public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int i;
		int max,  min;
		for(i = 0; i < 5; i++)
		{
			System.out.print((i+1)+"번째 정수를 입력하쇼:");
			arr[i] = sc.nextInt();
		}
		max = min = arr[0];
		for(i = 0; i < 5; i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
			if(min > arr[i])
			{
				min = arr[i];
			}
		}
		for(i = 0; i < 5; i++)
		{
			System.out.println((i + 1) +"번째 값은 " + arr[i]);
		}
		System.out.println("최댓값은 " + max);
		System.out.println("최솟값은 " + min);
	}
}
