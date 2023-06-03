package default package;
import java.util.Scanner;
public class HitungPersegipanjang {
public static void main (String[] args) {
	float panjang, lebar, luas;
	
	Scanner sc=new Scanner (System.in);
	
	System.out.print("Ketikkan panjang : ");panjang=sc.nextFloat();
	System.out.print("Ketikkan lebar : ");lebar=sc.nextFloat();
	luas=panjang*lebar;
	System.out.println("Luasnya "+luas);
	}

}
