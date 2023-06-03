package Modular;

import java.util.Scanner;

public class SegitigaDenganParameter {
	
	static double HitungluasSegitiga2(double alas, double tinggi) {
		double luas;
		
		luas=(double)1/2*alas*tinggi;
		return luas;
	}
	
	static void HitungluasSegitiga(double alas, double tinggi) {
		double luas;
		System.out.println(": segitiga ");
		System.out.println("luas ="+luas);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("alas =");double a=sc.nextDouble();
		System.out.println("tinggi =");double t=sc.nextDouble();
		HitungluasSegitiga(a,t);
		double L=HitungluasSegitiga2(a,t);
		System.out.println(": segitiga 2");
		System.out.println("Luas ="+L);
		

	}

}
