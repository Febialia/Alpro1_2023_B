package SELECTION;
import java.util.Scanner;
public class Cese1_4 {
public static void main (String[] args) {

int bilangan;
	
	Scanner sc=new Scanner (System.in);
	
	System.out.print("Ketikkan bilangan : ");bilangan=sc.nextInt();
	switch (bilangan) {
	case 1:System.out.print("satu"); break;
	case 2:System.out.print("dua"); break;
	case 3:System.out.print("tiga"); break;
	case 4:System.out.print("empat"); break;
	default:System.out.print("Bukan 1-4");
	}
}
}


