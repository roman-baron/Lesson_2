package lesson_1;


public class Lesson {
	public static void main(String[] args) {

		int a = 0;
		long b = 1;
		char c = '2';
		float e = 3;

		System.out.println("int=" + a);
		System.out.println("long=" + b);
		System.out.println("char=" + c);
		System.out.println("float=" + e);
		System.out.println();

		int f = 5;
		int k = 10;
		
		System.out.println("����������� ����� - " + Math.max(f, k));
		System.out.println("�������� ����� - " + Math.min(f, k));
		System.out.println();
		System.out.println("����������� ����� - " + Integer.max(f, k));
		System.out.println("�������� ����� - " + Integer.min(f, k));
		System.out.println();

		
		int[] C = {22,3,9,18,10,6,7,12,15,8};	

		for (int i = 0; i < 10; i++) {
			if (C[i] > C[0]) {
				C[0] = C[i];				
			}
		}
		System.out.println("��x. �������� ������ - " + C[0]);			
				
		
		for (int i = 0; i < 10; i++) {
			if (C[i] < C[0]) {
				C[0] = C[i];				
			}
		};
		System.out.println("�in. �������� ������ - " + C[0]);
		
	}
}
