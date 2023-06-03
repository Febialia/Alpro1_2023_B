package SELECTION;
import java.util.Scanner;
public class Cek1_4 {
public static void main (String[] args) {

int bilangan;
	
	Scanner sc=new Scanner (System.in);
	
	System.out.print("Ketikkan bilangan : ");bilangan=sc.nextInt();
	if (bilangan ==1)
	System.out.print("satu ");
	else if (bilangan ==2)
	System.out.println("dua");
	else if (bilangan ==3)
		System.out.println("tiga");
	else if (bilangan ==4)
		System.out.println("empat");
	else
		System.out.println("bukan 1 - 4");
	
}
}
