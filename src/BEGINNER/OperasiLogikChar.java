package BEGINNER;
import java.util.Scanner;
public class OperasiLogikChar {
public static void main (String[] args) {
	char a='a', b='b', c='0', d='^', A='A';
	boolean hasil;
	int H;
	
	H=a;
	System.out.println(" 'a' = "+ a+ " "+H );// kode ascii 'a'
	
	H=b;
	System.out.println(" 'b' =" + b+ " "+H );// kode ascii 'b'
	
	H=A;
	System.out.println(" 'A' =" + A+ " "+H );// kode ascii 'A'
	System.out.println(" a+b = "+ (a+b));// +
	
	hasil= a==b;
	System.out.println("a==b ="+hasil );
	hasil=a!=b;
	System.out.println("a!=b ="+hasil );
	hasil= a<b;
	System.out.println("a<b ="+hasil );
	hasil=a>=b;
	System.out.println("a>=b ="+hasil );
	//gabungan
	hasil=a+10>=b;
	System.out.println("a+10>=b ="+hasil );
	hasil=a+10>=b && a<100;
	System.out.println("a+10>=b=&& a<100="+hasil );
}
}
