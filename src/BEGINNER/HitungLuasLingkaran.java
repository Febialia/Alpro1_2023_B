package BEGINNER;
import java.util.Scanner;
public class HitungLuasLingkaran {
public static void main (String[] args) {

	double phi=3.14;
	double jari2, luas;
	
	Scanner sc=new Scanner (System.in);
	
	System.out.print("Ketikkan jari-jari : ");jari2=sc.nextDouble();
	luas=(double) 22/7*jari2*jari2;
	System.out.println("Luasnya "+luas);
	

}
}
