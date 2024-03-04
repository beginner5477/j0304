package T2_array;

import java.util.Scanner;
//2차원배열
//	13  2  6  4 
//	5  11  
//	39 10 11 
//값 입력받아 저장하기
//배열명.length는 행의 크기
//배열명[0].length는 열의 크기
public class Test11_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = {{13, 2, 6, 4}, {5, 11}, {39, 10, 11}};
		
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
