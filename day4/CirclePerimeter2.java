package cn.zlxy;
import java.util.Scanner;

public class CirclePerimeter2 {
	public static void main(String[] args) {
		final float Pi = 3.14F;
		System.out.println("������Բ�İ뾶��");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		float perimeter = 2 * Pi * r;
		float area =  Pi * r * r;
		sc.close();
		
		System.out.println("Բ�İ뾶��"+r);
		System.out.println("Բ���ܳ���"+perimeter);
		System.out.println("Բ�������"+area);
	}
}
