package T2_array;

//배열의 복사(깊은 복사, 얕은 복사)
public class Test12 {
	public static void main(String[] args) {
		int[] n1 = {13, 11, 233, 4, 5};
		int[] n2 = new int[n1.length];
		int[] n3 = new int[n1.length];
		
		//배열의 깊은 복사
		for(int i = 0; i < n1.length; i++)
		{
			n2[i] = n1[i];
		}
		for(int i = 0; i < n1.length; i++)
		{
			System.out.print(n1[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < n2.length; i++)
		{
			System.out.print(n2[i] + " ");
		}
		System.out.println();
		
		//배열의 얕은 복사
		//배열의 이름은 c언어의 포인터마냥 배열 저장되는 메모리 주소시작값을 나타냄
		//but 포인터와 배열의 이름은 다른거임!!!
		n3 = n1;
		for(int i = 0; i < n3.length; i++)
		{
			System.out.print(n3[i] + " ");
		}
		System.out.println();
		n1[4] = 500;
		for(int i = 0; i < n1.length; i++)
		{
			System.out.print(n1[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < n3.length; i++)
		{
			System.out.print(n3[i] + " ");
		}
	}
}
