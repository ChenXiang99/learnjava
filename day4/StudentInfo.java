package cn.zlxy;
import java.util.Scanner;

public class StudentInfo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//����ѧ������
		System.out.println("����ѧ������:");
		String name = sc.next();
		//����ѧ���Ա�
		System.out.println("����ѧ���Ա�");
		//Scanner input1 = new Scanner(System.in);
		char gender = sc.next().charAt(0);
		//����ѧ������
		System.out.println("����ѧ������:");
		int age = sc.nextInt();
		//����ѧ��java�ɼ�
		System.out.println("����ѧ��java�ɼ�:");
		float score = sc.nextFloat();
		sc.close();
		
		
		System.out.println("--------ѧ����Ϣ��-------");
		System.out.println("ѧ��������"+name);
		System.out.println("ѧ���Ա�"+gender);
		System.out.println("ѧ�����䣺"+age);
		System.out.println("ѧ��java�ɼ���"+score);
	}
}
