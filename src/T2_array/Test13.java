package T2_array;

import java.util.Scanner;

//2차원 배열에 입력된 값 주입하기
//입력자료 : 3명 학생의 번호, 국어, 영어, 수학 점수가 입력된다. 입력된 값들을 모두 출력하쇼.
public class Test13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("번호 입력하세요(종료:999):");
		System.out.println("국어 입력하세요(종료:999):");
		System.out.println("영어 입력하세요(종료:999):");
		System.out.println("수학 입력하세요(종료:999):");
		
		sc.close();
	}
}
