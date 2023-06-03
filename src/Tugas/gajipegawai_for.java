package Tugas;
import java.util.Scanner;
public class gajipegawai_for {
public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
 // Daftar golongan gaji
    int[] golonganGaji = {700000, 1000000, 1400000, 1600000};
    
    // Perulangan sebanyak 50 kali
    for (int i = 0; i < 50; i++) {
        // Input golongan gaji, jumlah hari kerja, dan upah harian
        System.out.print("Masukkan golongan gaji (1-4): ");
        int golongan = input.nextInt();
        System.out.print("Masukkan jumlah hari kerja: ");
        int jumlahHari = input.nextInt();
        System.out.print("Masukkan upah harian: ");
        int upahHarian = input.nextInt();
        
        // Memastikan golongan gaji valid
        if (golongan < 1 || golongan > 4) {
            System.out.println("Golongan gaji tidak valid.");
            continue;
        }
        
        // Menghitung gaji pokok berdasarkan golongan
        int gajiPokok = golonganGaji[golongan - 1];
        
        // Perhitungan gaji total
        int gajiTotal = gajiPokok + (jumlahHari * upahHarian);
        
        // Output gaji pegawai
        System.out.println("Golongan gaji: " + golongan);
        System.out.println("Gaji pokok: " + gajiPokok);
        System.out.println("Gaji total: " + gajiTotal);
       }


}
}
