package SELECTION;
import java.util.Scanner;
public class CekTemp {
public static void main (String[] args) {

	int bilangan;
	
	Scanner sc=new Scanner (System.in);
	
	System.out.print("Ketikkan bilangan : ");bilangan=sc.nextInt();
	if (bilangan >0)
	System.out.println("Positif");
	else if (bilangan <0)
	System.out.println("Negatif");
	else
	System.out.println("NoL");
}
}
