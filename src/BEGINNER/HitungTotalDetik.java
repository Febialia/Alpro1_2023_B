package BEGINNER;
import java.util.Scanner;
public class HitungTotalDetik {
public static void main (String[] args) {
	int jam, menit, detik, totaldetik;
	
	Scanner sc=new Scanner (System.in);
	
	System.out.print("Ketikkan jam : ");jam=sc.nextInt();
	System.out.print("Ketikkan menit : ");menit=sc.nextInt();
	System.out.print("Ketikkan detik : ");detik=sc.nextInt();
	totaldetik=jam*3600+menit*60+detik;
	System.out.println("TotalDetik = "+totaldetik);
	}

}
