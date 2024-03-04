package T1_memory;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 10, n2 = 20, n3 = 10;
		if(n1 == n2) System.out.println("n1과 n2는 같습니다.");
		else System.out.println("n1과 n2는 다릅니다.");
		if(n1 == n3) System.out.println("n1과 n3는 같습니다.");
		else System.out.println("n1과 n3는 다릅니다.");
		if(n2 == n3) System.out.println("n2과 n3는 같습니다.");
		else System.out.println("n2과 n3는 다릅니다.");
		
		sc.close();
	}
}
