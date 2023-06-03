package Repetiton;
import java.util.Scanner;
public class whileCekPassword_Mak3x {
public static void main (String[] args) {
		String password ;
		
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Password anda: ");password=sc.next();
        int i=1;
            while ((!password.contentEquals("$$$")) && (i<3)) {
                System.out.print("Password anda: ");password=sc.next();
                i=i+1;
            } 
            if (password.contentEquals("$$$"))
                System.out.println("Login Sukses");
            else
            	  System.out.println("Login Tidak Sukses");
            }

    }

