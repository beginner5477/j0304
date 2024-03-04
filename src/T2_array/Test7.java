package T2_array;

//2차원배열
public class Test7 {
	public static void main(String[] args) {
		int[][] arr = new int[3][4];
		arr[0][1] = 10;
		arr[1][2] = 20;
		arr[2][0] = 30;
		
		for(int i = 0; i < 4; i++)
		{
			System.out.print(arr[0][i] + " ");
		}
		System.out.println();
		for(int i = 0; i < 4; i++)
		{
			System.out.print(arr[1][i] + " ");
		}
		System.out.println();
		for(int i = 0; i < 4; i++)
		{
			System.out.print(arr[2][i] + " ");
		}
		System.out.println();
		System.out.println("=============================");
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
