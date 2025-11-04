import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);

    System.out.println("masukkan nilai StrukturD= ");
    double StrukturD = newScanner.nextDouble();

    System.out.println("masukkan nilai PBO= ");
    double PBO = newScanner.nextDouble();

     System.out.println("masukkan nilai algoritm dan pemrograman= ");
     double algoritm = newScanner.nextDouble();

     System.out.println("masukkan nilai RPL=");
    double RPL = newScanner.nextDouble();

    double ratarata = (StrukturD + PBO + algoritm + RPL)/5;String predikat;

     if (ratarata >= 3.75) {
                  System.out.println("predikat = A (sangat baik)");
               } else if (ratarata >= 3.50) {
                  System.out.println("predikat = AB (baik sekali)");
               } else if (ratarata >=3.00)  {
                  System.out.println("predikat = B (baik)");
               } else if (ratarata >= 2.50) {
                  System.out.println("predikat = BC (cukup)");
               } else if (ratarata <=2.50) {
                  System.out.println("predikat = C (kurang)");
               } 

                if (predikat.toLowerCase().equals("A (sangat baik)/AB (baik sekali)")) {
                System.out.println("memenuhi syarat mendaftar Asisten Dosen");
                System.out.println("pilih matkul yang diajukan");
                System.out.println("1. StrukturD");
                System.out.println("2. PBO");
                System.out.println("3. BasisD");
                System.out.println("4. Algoritm dan pemrograman");
                System.out.println("5. RPL");
                


    

    }

    }