package pertemuan12;

import java.util.*;

class karyawan2 {
	String KodeP;
	int gol;
	double gapok, tunjangan, bonus, GT;
	
	void BacaKaryawan() {
		Scanner sc=new Scanner (System.in);
		System.out.println("Gol: "); gol=sc.nextInt();
	}
	
	
	void SetGapokBonus() {
		switch(gol) {
		case 1 : gapok = 2000000 ; bonus = 0; break;
		case 2 : gapok = 2500000 ; bonus = 100000; break;
		case 3 : gapok = 3000000 ; bonus = 200000; break;
		case 4 : gapok = 4000000 ; bonus = 300000; break;
		default:
			System.out.println("Kode golongan salah");
		}
	}
		
		double HitungTunjangan() {
			tunjangan=0.2*gapok;
			return tunjangan;
		}
		
		
		double HitungGT() {
			GT=gapok+tunjangan+bonus;
			return GT;
		}
		
		
		void TampilKaryawan() {
			System.out.println("Gol= "+gol+", g=" +gapok+
					", t"+tunjangan+", b"+bonus+" GT= "+GT);
		}
		
	

	public static void main(String[] args) {
		karyawan2 K=new karyawan2 ();
		
		K.BacaKaryawan();
		K.SetGapokBonus();
		K.HitungTunjangan();
		K.HitungGT();
		K.TampilKaryawan();
		
	}
}
