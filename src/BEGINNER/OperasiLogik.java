package BEGINNER;
import java.util.Scanner;
public class OperasiLogik {
public static void main (String[] args) {

	boolean x=true,y=false,z=true,hasil;
	
	Scanner sc=new Scanner (System.in);
	
	hasil=(x && y) ||z;
	System.out.println("(x && y) || z= "+hasil);
	hasil=x && (y ||z);
	System.out.println("x &&  (y|| z= "+hasil);
	hasil=!(x && z);
	System.out.println("! |(x && z) = "+hasil);
	hasil=(x ^ y) && y;
	System.out.println("(x ^ z) && y= "+hasil);
}
}
