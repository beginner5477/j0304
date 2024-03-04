package T1_memory;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name1 = "김도완", name2 = "김도완";
		if(name1.equals(name2)) System.out.println("name1과 name2는 같습니다.");
		else System.out.println("name1과 name2는 다릅니다.");
		if(name1.equals("홍길동")) System.out.println("name1과 홍길동과 같습니다.");
		else System.out.println("name1과 홍길동과 다릅니다.");
		sc.close();
	}
}
