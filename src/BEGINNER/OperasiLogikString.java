package BEGINNER;
import java.util.Scanner;
public class OperasiLogikString {
public static void main (String[] args) {

	
	String pass="S123", S0="";
	boolean hasil;
	
	
	System.out.println("'Password ="+ pass);//  'A'
	System.out.println("S0= "+ S0);// +
	
	hasil= pass.equals("s123");
	System.out.println("a==b equals="+hasil );
	hasil=pass.equalsIgnoreCase("s123");
	System.out.println("a==b equalsIgnorecase="+hasil );
	
	
	
	//gabungan
	hasil= pass.equals("S123");
	System.out.println("cek login 1 ="+hasil );
	int ulang=2;
	hasil= pass.equals("S123") && (ulang<3);
	System.out.println("cek login 2 ="+hasil );
}
}
