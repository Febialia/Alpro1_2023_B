package RECORD;

import java.util.*;

public class kelolatitik {

	public static void main(String[] args) {
		Titik T= new Titik();
		Titik T2= new Titik();
		
		Scanner sc=new Scanner (System.in);
		// TODO Auto-generated method stub
		System.out.println("x=");T.x=sc.nextInt();
		System.out.println("y=");T.y=sc.nextInt();
		
		System.out.println("x="+T.x+","+T.y);T.x=sc.nextInt();
		System.out.println("y=");T.y=sc.nextInt();
		
	}

}
