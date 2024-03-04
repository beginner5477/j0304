package T2_array;


//1~100중에 369게임 프로그램
public class assignment1 {
	public static void main(String[] args) {
		int i = 0;
		int phase = 0;
		String str = "";
		int jud = 0;
		char c = 0;
		int cnt = 0;
		
		for(i = 1; i <= 100; i++)
		{
			str = Integer.toString(i);
			if(i < 10) phase = 1;
			else if(i < 100) phase = 2;
			else phase = 3;
			for(int j = 0; j < phase; j++)
			{
				c = str.charAt(j);
				if(c == '3') 
				{
					System.out.print("짝");
					jud++;
				}
				else if(c == '6') 
				{
					System.out.print("짝");
					jud++;
				}
				else if(c == '9')
				{
					System.out.print("짝");
					jud++;
				}
			}
			if(jud == 0)
			{
				System.out.print(i + " ");
			}
			jud = 0;
			cnt++;
			System.out.print("\t");
			if(cnt % 10 == 0) System.out.println();
		}
	}
}
