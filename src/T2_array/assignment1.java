package T2_array;

import java.util.Scanner;

//1~100중에 369게임 프로그램
public class assignment1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int phase = 0;
		String str = "";
		int jud = 0;
		char c = 0;
		int cnt = 0;
		String[] arr = new String[100];
		
		for(i = 1; i <= 100; i++)
		{
			str = Integer.toString(i);
			if(i < 10) phase = 1;
			else if(i < 100) phase = 2;
			else phase = 3;
			for(int j = 0; j < phase; j++)
			{
				c = str.charAt(j);
				if(c == '3') 
				{
					System.out.print("짝");
					jud++;
				}
				else if(c == '6') 
				{
					System.out.print("짝");
					jud++;
				}
				else if(c == '9')
				{
					System.out.print("짝");
					jud++;
				}
			}
			if(jud == 0)
			{
				System.out.print(i + " ");
				arr[i - 1] = Integer.toString(i);
			}
			else if(jud == 1) arr[i - 1] = "짝";
			else if(jud == 2) arr[i - 1] = "짝짝";
			jud = 0;
			cnt++;
			System.out.print("\t");
			if(cnt % 10 == 0) System.out.println();
		}
		System.out.println("===========================");
		while(true)
		{
			System.out.print("1~100중에 확인할 숫자를 입력하세요(종료는 999입력):");
			i = sc.nextInt();
			if(i == 999) break;
			else if(i > 100 || i < 1) System.out.println("입력이 잘못되었습니다 다시입력하세요");
			else System.out.println(i + ":" + arr[i - 1]);
		}
		System.out.println("프로그램이 종료되었습니다.");
		sc.close();
	}
}
