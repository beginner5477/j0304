package T2_array;

public class Test2 {
	public static void main(String[] args) {
		String name;
		int kor, eng, mat, soc, sci;
		int tot;
		double avg;
		char grade;
		
		name = "김도완";
		kor = 95;
		eng = 90;
		mat = 100;
		soc = 85;
		sci = 95;
		tot = kor + eng + mat + soc + sci;
		avg = tot / 5.0;
		if(avg >= 90) grade = 'A';
		else if(avg >= 90) grade = 'B';
		else if(avg >= 80) grade = 'C';
		else if(avg >= 70) grade = 'D';
		else grade = 'F';
		
		System.out.println("성명: " + name);
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + mat);
		System.out.println("사회: " + soc);
		System.out.println("과학: " + sci);
		System.out.println("총점: " + tot);
		System.out.println("평균: " + avg);
		System.out.println("학점: " + grade);
		System.out.println("The end");
	}
}
