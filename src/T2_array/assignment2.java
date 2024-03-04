package T2_array;

import java.util.Scanner;

//가위 바위 보 게임 컴퓨터에게 랜덤하게 가위바위보중 하나를 기억시키고 사용자가 가위바위보중 하나를 
// 입력하면 누가 이겼는지를 출력해준다 단, 그만을 입력하면 프로그램을 종료시킨다.
public class assignment2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		String str = "", user = "";
		int jud = 0;
		exit:while(true)
		{
			n1 = ((int) (Math.random() * 3)) + 1;
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
			System.out.print("(가위,바위,보)중 하나를 입력하세용(그만:종료):");
			user = sc.next();
			if(user.equals("그만")) break exit;
			else if(user.equals("가위"))
			{
				if(str.equals("가위")) jud = 0;
				else if(str.equals("바위")) jud = 2;
				else jud = 1;
			}
			else if(user.equals("바위"))
			{
				if(str.equals("바위")) jud = 0;
				else if(str.equals("보")) jud = 2;
				else jud = 1;
			}
			else if(user.equals("보"))
			{
				if(str.equals("보")) jud = 0;
				else if(str.equals("가위")) jud = 2;
				else jud = 1;
			}
			else jud = 3;
			switch(jud)
			{
				case 0:
					System.out.println("비겼습니다.");
					break;
				case 1:
					System.out.println("이겼습니다.");
					break;
				case 2:
					System.out.println("졌습니다.");
					break;
				case 3:
					System.out.println("잘못 입력하셨습니다, 다시시작합니다.");
					break;
			}
			System.out.println("컴퓨가 낸 것은 " + str + "입니다.");
			System.out.println("================================");
		}
		System.out.println("게임이 종료되었습니다 ㅂㅂ");
		sc.close();
	}
}
