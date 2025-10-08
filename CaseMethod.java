package bertolomeusz.PraktikDaspro;
import java.util.Scanner;
public class  CaseMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double RataRata = 0;
        String NilaiHuruf = "C", Status = "TIDAK LULUS"; 
        
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
        double nilaiAkhir1 = (0.3 * nilaiUTS) + (0.4 * nilaiUAS) + (0.3 * nilaiTugas);
        double nilaiAkhir2 = (0.3 * nilaiUTS2) + (0.4 * nilaiUAS2) + (0.3 * nilaiTugas2);
        double NilaiAkhir = (nilaiAkhir1 + nilaiAkhir2) / 2;

        if (NilaiAkhir >= 80 && NilaiAkhir <= 100) {
    NilaiHuruf = "A";
} else {
    if (NilaiAkhir >= 73 && NilaiAkhir <= 79) {
        NilaiHuruf = "B+";
    } else {
        if (NilaiAkhir >= 65 && NilaiAkhir <= 72) {
            NilaiHuruf = "B";
        } else {
            if (NilaiAkhir >= 60 && NilaiAkhir <= 64) {
                NilaiHuruf = "C+";
            } else {
                if (NilaiAkhir >= 50 && NilaiAkhir <= 59) {
                    NilaiHuruf = "C";
                } else {
                    if (NilaiAkhir >= 39 && NilaiAkhir <= 49) {
                        NilaiHuruf = "D";
                    } else if (NilaiAkhir < 39 && NilaiAkhir >= 0) {
                        NilaiHuruf = "E";
                    } else {
                        NilaiHuruf = "-";
                    }
                }
            }
        }
    }
}
        if (NilaiAkhir >= 70) {
            Status = "LULUS";
        } else {
            Status = "TIDAK LULUS";
        }
        System.out.println("-----HASIL PENILITIAN AKADEMIK------");
        System.out.println("Nama :" + nama);
        System.out.println("NIM :" + nim);
        System.out.println("Mata Kuliah\t\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus" );
        System.out.println("------------------------------------------------------------------------------------------");
         
        System.out.println("Algoritma Pemrograman\t\t" + nilaiUTS + "\t" + nilaiUAS + "\t" + nilaiTugas + "\t" + nilaiAkhir1 + "\t\t" + NilaiHuruf+ "\t\t" + Status);
        System.out.println("Struktur Data\t\t\t" + nilaiUTS2 + "\t" + nilaiUAS2 + "\t" + nilaiTugas2 + "\t" + nilaiAkhir2 + "\t\t" + NilaiHuruf + "\t\t" + Status);
        
        RataRata = (nilaiAkhir1 + nilaiAkhir2) / 2;
        System.out.println("Rata-Rata Nilai Akhir: " + RataRata);
        System.out.println("Status Semester: " + Status);
         scanner.close();
    }
} 