package SELECTION;
import java.util.Scanner;
public class CekPassword {
public static void main (String[] args) {

String pass;
	
	Scanner sc=new Scanner (System.in);
	
	System.out.print("Ketikkan password : ");pass=sc.next();
	if (pass.contentEquals("febi"))
	System.out.print("Login sukses");
	else 
	System.out.println("Password anda salah");
	
}
}
