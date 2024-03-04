package T3_example;

import java.util.Scanner;

//원하는 갯수의 정수 입력받아서 최대 최소값 구하기~, 단 모든 숫자를 다입력받은 후에 최댓값과 최소값을 구하시오.
public class Test1_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = -99, min = 99, n1, cnt = 0;
		int[] arr = new int[200];
		
		while(true)
		{
			System.out.print("정수를 입력하세요(종료:999입력):");
			n1 = sc.nextInt();
			if(n1 == 999) break;
			arr[cnt] = n1;
			cnt++;
		}
		for(int i = 0; i < cnt; i++)
		{
			System.out.println(arr[i]);
		}
		while(cnt > 0)
		{
			if(arr[cnt] > max) max = arr[cnt];
			if(arr[cnt] < min) min = arr[cnt];
			cnt--;
		}
		System.out.println("최댓값은 " +max);
		System.out.println("최솟값은 " +min);
		sc.close();
	}
}
