package cn.zlxy;
import java.util.Scanner;

public class TestScore {
	public static void main(String[] args) {
		double javaScore;
		double sqlScore;
		double mathScore;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���������java�ɼ�");
		javaScore = sc.nextDouble();
		
		System.out.println("���������sql�ɼ�");
		sqlScore = sc.nextDouble();
		
		System.out.println("���������math�ɼ�");
		mathScore = sc.nextDouble();
		
		double diff = (javaScore>=sqlScore) ? (javaScore-sqlScore):(sqlScore-javaScore);
		double averageScore = (javaScore+sqlScore+mathScore)/3;
		sc.close();
		
		System.out.println("java�ɼ���"+javaScore);
		System.out.println("sql�ɼ���"+sqlScore);
		System.out.println("math�ɼ���"+mathScore);
		System.out.println("java�ɼ���sql�ɼ���"+diff+"��");
		System.out.printf("���ſε�ƽ���ɼ���%.2f",averageScore);
	}
}
