package T1_memory;

import java.util.Scanner;

public class Test1_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ans = " ";
		int cnt = 0;
		while(true)
		{
			System.out.println(cnt);
			cnt++;
			System.out.print("작업 계속하실거임?(Y.계속, N.그만):");
			ans = sc.next();
			if(ans == "Y") break;
			else if(ans == "N") continue;
			else System.out.println("입력이 잘못되었습니다 계속합니다.");
		}
		System.out.println("작업끝~");
		sc.close();
	}
}
