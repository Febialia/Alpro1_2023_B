package RECORD;

import java.util.Scanner;

public class KelolaJam {

	public static void main(String[] args) {
		Jam T= new Jam();
		
		
		Scanner sc=new Scanner (System.in);
		// TODO Auto-generated method stub
		System.out.println("jam=");T.J =sc.nextInt();
		System.out.println("menit=");T.M =sc.nextInt();
		System.out.println("detik=");T.D =sc.nextInt();
		
		System.out.println("Waktu= "+T.J+":"+T.M+":"+T.D);
		
		do {
			System.out.println("jam= ");
			T.J=sc.nextInt();
		}while (T.J>=0 && T.J<24);
		
		do {
		System.out.println("menit= ");
		T.M=sc.nextInt();
		}while (T.M>=0 && T.M<60);
		
		do {
		System.out.println("menit= ");
		T.D=sc.nextInt();
		} while (T.M>=0 && T.M<60);
		
		do {
			System.out.println("jam= ");
			T.J=sc.nextInt();
		}while (T.J<0 || T.J>=24);
		
		do {
		System.out.println("menit= ");
		T.M=sc.nextInt();
		}while (T.M<0 || T.M>=60);
		
		do {
		System.out.println("menit= ");
		T.D=sc.nextInt();
		} while (T.M<0 || T.M>=60);
	
	}

}
