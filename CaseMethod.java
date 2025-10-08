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

        
         scanner.close();
    }
} 