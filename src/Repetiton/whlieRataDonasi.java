package Repetiton;
import java.util.Scanner;
public class whlieRataDonasi {
public static void main (String[] args) {
	int i=1,JmlhMhs,k=0, Donasi;
	float R;
	
	Scanner sc = new Scanner(System.in);
    System.out.print("Jumlah Mahsiswa: ");JmlhMhs=sc.nextInt();
    
	while (i<=JmlhMhs) {
		System.out.print("Besar donasi"+i+":");Donasi=sc.nextInt();
		k=k+Donasi;
		i=i+1;
	}
	R=k/JmlhMhs;
	System.out.println("Total Donasi="+ k);
	System.out.println("Rata-rata Donasi="+ R);
}
}
