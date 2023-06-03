package Modular;

import java.util.Scanner;

public class LuasSegitiga2 {
	void HitungluasSegitiga() {
		double alas, tinggi, luas;
		Scanner sc=new Scanner (System.in);
		// TODO Auto-generated method stub
		System.out.println("alas =");alas=sc.nextDouble();
		System.out.println("tinggi =");tinggi=sc.nextDouble();
		luas=(double)1/2*alas*tinggi;
		System.out.println("luas ="+luas);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
