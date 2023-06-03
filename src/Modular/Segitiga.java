package Modular;

import java.util.Scanner;

public class Segitiga {
	
	static double HitungluasSegitiga2() {
		double alas, tinggi, luas;
		Scanner sc=new Scanner (System.in);
		System.out.println("alas =");alas=sc.nextDouble();
		System.out.println("tinggi =");tinggi=sc.nextDouble();
		luas=(double)1/2*alas*tinggi;
		return luas;
	}
	
	static void HitungluasSegitiga() {
		double alas, tinggi, luas;
		Scanner sc=new Scanner (System.in);
		System.out.println("alas =");alas=sc.nextDouble();
		System.out.println("tinggi =");tinggi=sc.nextDouble();
		luas=(double)1/2*alas*tinggi;
		System.out.println(": segitiga ");
		System.out.println("luas ="+luas);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HitungluasSegitiga();
		double L=HitungluasSegitiga2();
		System.out.println(": segitiga 2");
		System.out.println("Luas ="+L);
		

	}

}
