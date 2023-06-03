package SELECTION;
import java.util.Scanner;
public class CekGanjilGenap {
public static void main (String[] args) {

	int suhu;
	
	Scanner sc=new Scanner (System.in);
	System.out.print("masukan suhu : ");suhu=sc.nextInt();
	if (suhu <=0)
	System.out.println("Padat");
	else if (suhu >100)
	System.out.println("Gas");
	else
	System.out.println("Cair");
}
}
