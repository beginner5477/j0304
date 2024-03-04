package T2_array;

import java.util.Scanner;

//가위 바위 보 게임 컴퓨터에게 랜덤하게 가위바위보중 하나를 기억시키고 사용자가 가위바위보중 하나를 
// 입력하면 누가 이겼는지를 출력해준다 단, 그만을 입력하면 프로그램을 종료시킨다.
public class assignment2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		String str = "", user = "";
		while(true)
		{
			n1 = ((int) Math.random() * 3) + 1;
			switch(n1)
			{
				case 1:
					str = "가위";
					break;
				case 2:
					str = "바위";
					break;
				case 3:
					str = "보";
					break;
			}
			System.out.print("입력하세용:");
			user = sc.next();
			if(str.equals("가위"))
			{
				if(user.equals("가위"))
				{
					System.out.println("비겼습니다.");
				}
				else if(user.equals("바위"))
				{
					System.out.println("이겼습니다.");
				}
				else System.out.println("졌습니다. ㅜㅜ");
			}
		}
	}
}
