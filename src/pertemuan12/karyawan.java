package pertemuan12;

import java.util.*;

class karyawan {
	//adanya penambahan filed nama dan kehadiran
	// ada perubahan perhitungan gaji total
	// dg menambahkan kehadiran*uang makan harian yaitu 50000
	// perubahan besar tunjangan per golongan
	
	int gol;
	double gapok, tunjangan, bonus, GT;
	
	// 1. Menambahkan kode pegawai
	String kodeP;
	
	
	// 2. Menambahkan Kehadiran
	int hadir;
	
	
	void BacaKaryawan() {
		Scanner sc=new Scanner (System.in);
		
		// input golongan
		System.out.println("Gol: "); 
		gol=sc.nextInt();
		
	// 3. input kode pegawai
		System.out.println("Kode Pegawai: "); 
		kodeP=sc.next();
	
	// 4.input hadir
		System.out.println("hadir: "); 
		hadir=sc.nextInt();
	}
	
	
	 void SetGapokBonus() {
		switch(gol) {
		case 1 : gapok = 2000000 ; bonus = 0; 
				tunjangan=0.05*gapok;	
				break;
		case 2 : gapok = 2500000 ; bonus = 100000; 
				tunjangan=0.05*gapok;
				break;
		case 3 : gapok = 3000000 ; bonus = 200000; 
				tunjangan=0.03*gapok;
				break;
		case 4 : gapok = 3500000 ; bonus = 300000; 
				tunjangan=0.02*gapok;
				break;
		default:
			System.out.println("Kode golongan salah");
		}
	}
		
		double HitungTunjangan() {
			// 1,2; 5%  3:3% 4:2%
			tunjangan=0.2*gapok;
			return tunjangan;
		}
		
		
		double HitungGT() {
			// menambahkan gaji total dengan uang makan
			double gajitotal;
			// gaji total = gapok + tunjangan + bonus + uang makan (50.000)
			// gaji total = gapok + bonus + tunjangan + (uang makan + hadir)
			gajiTotal = gapok + bonus + tunjangan + (50000 + hadir );
		}
		
		
		void TampilKaryawan() {
			System.out.println("Gol= "+gol+", g=" +gapok+
					", t"+tunjangan+", b"+bonus+" GT= "+GT);
		}
		
	

	public static void main(String[] args) {
		karyawan K=new karyawan ();
		
		K.BacaKaryawan();
		// K.SetGapokBonus();
		// K.HitungTunjangan();
		K.HitungGT();
		K.TampilKaryawan();
		
	}
}
