package pertemuan12;

import java.util.*;

public class gajipokok {

	public static void main(String[] args) {
		double gapok=0, tunjangan, bonus=0, GT;
		Scanner sc=new Scanner (System.in);
		System.out.println("Gol: ");int Gol=sc.nextInt();
		switch(Gol) {
		case 1 : gapok = 2000000 ; bonus = 0; break;
		case 2 : gapok = 2500000 ; bonus = 100000; break;
		case 3 : gapok = 3000000 ; bonus = 200000; break;
		case 4 : gapok = 4000000 ; bonus = 300000; break;
		default:
			System.out.println("Kode golongan salah");

		}
		tunjangan=0.2*gapok;
		GT=gapok+tunjangan+bonus;
		System.out.println("Gol= "+Gol+", g=" +gapok+
				", t"+tunjangan+", b"+bonus+" GT= "+GT);
	}
}
