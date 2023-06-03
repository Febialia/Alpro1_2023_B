package SELECTION;
import java.util.Scanner;
public class CekPosNegNol {
public static void main (String[] args) {

int bilangan;
	
	Scanner sc=new Scanner (System.in);
	
	System.out.print("Ketikkan bilangan : ");bilangan=sc.nextInt();
	if (bilangan % 2==1)
	System.out.println("Bilangan Ganjil");
	else
	System.out.println("Bilangan Genap");
	
}
}
