package T2_array;

//향상된 for문(객체안의 내용을 반복처리)
public class Test3 {
	public static void main(String[] args) {
		int[] score = {100, 13, 34, 34, 31};
		System.out.println("일반적인 for문 출력");
		for(int i = 0; i < score.length; i++)
		{
			System.out.print(score[i] + " ");
		}
		System.out.println();
		//향상된 for 문: for(변수타입 배열안의 값을 담을 변수: 객체명(또는 배열명))
		for(int s: score)
		{
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("향상된 for문을 번지수와 함께 출력하자");
		int sell = 0;
		for(int s: score)
		{
			System.out.print(sell+"번지는 " +s);
			System.out.println();
			sell++;
		}
		System.out.println();
	}
}
