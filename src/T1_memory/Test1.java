package T1_memory;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0; // 1:계속 2:그만
		int cnt = 0;
		while(true)
		{
			System.out.println(cnt);
			cnt++;
			System.out.print("작업 계속하실거임?(1.계속, 2.그만):");
			ans = sc.nextInt();
			if(ans == 0) break;
			else if(ans == 1) continue;
			else System.out.println("입력이 잘못되었습니다 계속합니다.");
		}
		System.out.println("작업끝~");
		sc.close();
	}
}
