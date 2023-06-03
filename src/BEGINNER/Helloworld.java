package BEGINNER;
import java.util.Scanner;
public class Helloworld {
public static void main (String[] args) {
	String nama;
	
	Scanner sc=new Scanner (System.in);
	
	System.out.print("Ketikkan nama anda : ");nama=sc.next();
	System.out.println("Hello "+nama);
	}

}
