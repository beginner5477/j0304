package T2_array;

import java.util.Scanner;

//2차원배열
//	1  2  3  4 
//	5  6  7  8
//	9 10 11 12
//값 기억시키기
public class Test9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][4];
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				System.out.print("arr["+i+"]["+j+"]를 입력해주세요:" );
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
