import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);

    System.out.println("masukkan nilai StrukturD= ");
    double StrukturD = newScanner.nextDouble();

    System.out.println("masukkan nilai PBO= ");
    double PBO = newScanner.nextDouble();

     System.out.println("masukkan nilai BasisD= ");
    double BasisD = newScanner.nextDouble();


     System.out.println("masukkan nilai algoritm dan pemrograman= ");
     double algoritm = newScanner.nextDouble();

     System.out.println("masukkan nilai RPL=");
    double RPL = newScanner.nextDouble();

    double ratarata = (StrukturD + PBO + BasisD + algoritm + RPL)/5;String predikat;

                if (ratarata >= 3.75) {
                predikat = "A (sangat baik)";
               } else if (ratarata >= 3.50) {
                predikat = "AB (baik sekali)";
               } else if (ratarata >=3.00)  {
                predikat = "B (baik)";
               } else if (ratarata >= 2.50) {
                predikat = "BC (cukup)";
               } else { 
                predikat = "C(kurang)";
               } 
               
               System.out.printf("Rata-rata nilai: %.2f\n", ratarata);
               System.out.println("Predikat = " + predikat);

             if (predikat.equalsIgnoreCase("A (sangat baik)") || predikat.equalsIgnoreCase("AB (baik sekali)")) {

                System.out.println("memenuhi syarat mendaftar Asisten Dosen");
                System.out.println("pilih matkul yang diajukan");
                System.out.println("1. StrukturD");
                System.out.println("2. PBO");
                System.out.println("3. BasisD");
                System.out.println("4. algoritm dan pemrograman");
                System.out.println("5. RPL");

                  int pilihan = newScanner.nextInt();
                  double nilaipilihan = 0;
                switch (pilihan) {
                    case 1:
                    nilaipilihan = StrukturD;
                    break;

                    case 2:
                    nilaipilihan = PBO;
                    break;

                    case 3:
                    nilaipilihan =  BasisD;
                    break;

                    case 4:
                    nilaipilihan = algoritm;
                    break;

                     case 5:
                    nilaipilihan = RPL;
                    break;
                    default:

                    System.out.println("pilihan tidak valid");
                    newScanner.close();
                    return;
                }
                
                   if (nilaipilihan >= 75) {
                System.out.println("congratss!Mahasiswa (nama) eligible untuk menjadi Asisten Dosen pada matkul yang di pilih.");
            } else {
                System.out.println("jangan pantang semangat, Mahasiswa (nama) belum memenuhi syarat untuk posisi tersebut.");
            }
        } else {
            System.out.println("Belum memenuhi syarat untuk mendaftar Asisten Dosen.");
        }

        newScanner.close();
    }
}





