package Repetiton;
import java.util.Scanner;
public class whilePasswordBebas {
public static void main (String[] args) {
		String password ;
		
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Password anda: ");password=sc.next();
            while (!password.contentEquals("$$$")) {
                System.out.print("Password anda: ");password=sc.next();
            } 
                System.out.println("Login Sukses");
            }

    }

