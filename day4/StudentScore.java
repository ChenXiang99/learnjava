package cn.zlxy;
import java.util.Scanner;

public class StudentScore {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������ѧ��������");
		String name = input.next();
		
		System.out.print("������Java�ɼ���");
		float score = input.nextFloat();
		
		System.out.print("������Oracle�ɼ���");
		float score1 = input.nextFloat();
		
		System.out.println("������ѧ���Ա�");
		char gender = input.next().charAt(0);
		input.close();
		System.out.println("������"+name+"\tjava�ɼ���"+score+"\toracle�ɼ���"+score1+"\t�Ա�"+gender);

	}
}
