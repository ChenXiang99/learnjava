package cn.zlxy;
import java.util.Scanner;

public class CalSalary {
	public static void main(String[] args){
		int baseSalary;
		double ga;
		double hra;
		double salary;
		
		System.out.println("���������Ļ������ʣ�");
		Scanner sc = new Scanner(System.in);
		baseSalary = sc.nextInt();			//��������
		ga = baseSalary*40/100;				//��۽���
		hra = baseSalary*25/100;			//�������
		salary = baseSalary + ga + hra;		//нˮ
		sc.close();
		
		System.out.println("���Ĺ���ϸĿ��");
		System.out.println("�������ʣ�"+baseSalary);
		System.out.println("��۽�����"+ga);
		System.out.println("���������"+hra);
		System.out.println("����нˮ��"+salary);
	}
}
