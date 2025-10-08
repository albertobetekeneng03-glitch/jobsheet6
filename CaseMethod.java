package bertolomeusz.PraktikDaspro;
import java.util.Scanner;
public class  CaseMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        
        System.out.println("======INPUT DATA MAHASISWA=====");
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("NIM: ");
        String nim = scanner.nextLine();

         System.out.println("-----MATA KULIAH 1 Algoritma dan Pemrograman-----");
        System.out.print("Nilai UTS: ");
        double nilaiUTS = scanner.nextDouble();
        System.out.print("Nilai UAS: ");
        double nilaiUAS = scanner.nextDouble();
        System.out.print("Nilai Tugas: ");
        double nilaiTugas = scanner.nextDouble();

        System.out.println("-----MATA KULIAH 2 Struktur Data-----");
        System.out.print("Nilai UTS: ");
        double nilaiUTS2 = scanner.nextDouble();
        System.out.print("Nilai UAS: ");
        double nilaiUAS2= scanner.nextDouble();
        System.out.print("Nilai Tugas: ");
        double nilaiTugas2 = scanner.nextDouble();
         scanner.close();
    }
} 