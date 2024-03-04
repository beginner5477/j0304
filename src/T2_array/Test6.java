package T2_array;

public class Test6 {
	public static void main(String[] args) {
		char[] strArray = {'k', 'o', 'r', 'e', 'a'}; //char 배열은 문자열이므로 그냥 이름 써도 다 출력함
		
		for(int i = 0; i < strArray.length; i++)
		{
			System.out.print(strArray[i]);
		}
		System.out.println();
		System.out.println(strArray);
	}
}
