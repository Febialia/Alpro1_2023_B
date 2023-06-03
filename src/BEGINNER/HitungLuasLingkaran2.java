package BEGINNER;
import java.util.Scanner;
public class HitungLuasLingkaran2 {
public static void main (String[] args) {

	double Phi=3.14;
	double jari2, luas, cek;
	
	Scanner sc=new Scanner (System.in);
	
	System.out.print("Ketikkan jari-jari : ");jari2=sc.nextDouble();
	luas=(double) 22/7*jari2*jari2;
	System.out.println("Luasnya "+luas);
	
	cek=(double) 22/7;// contoh cascading
	System.out.println(cek);
	}

}
