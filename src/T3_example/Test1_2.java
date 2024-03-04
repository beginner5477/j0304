//package T3_example;
//
//import java.util.Scanner;
//
////원하는 갯수의 정수 입력받아서 최대 최소값 구하기~
//public class Test1_2 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("몇개의 정수를 입력할지 입력하세요:");
//		int n1 = sc.nextInt();
//		int[] arr = new int[n1];
//		int i;
//		int max,  min;
//		for(i = 0; i < arr.length; i++)
//		{
//			System.out.print((i+1)+"번째 정수를 입력하쇼:");
//			arr[i] = sc.nextInt();
//		}
//		max = min = arr[0];
//		for(i = 0; i < arr.length; i++)
//		{
//			if(max < arr[i]) max = arr[i];
//			if(min > arr[i]) min = arr[i];
//		}
//		for(i = 0; i < arr.length; i++)
//		{
//			System.out.println((i + 1) +"번째 값은 " + arr[i]);
//		}
//		System.out.println("최댓값은 " + max);
//		System.out.println("최솟값은 " + min);
//		sc.close();
//	}
//}
