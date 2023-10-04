import java.util.Scanner;

public class Gaji08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jmlMasuk, jmlTdkMasuk, TotGaji;
        int gaji = 40000, potGaji = 25000;

        System.out.print("Masukkan jumlah hari masuk kerja anda = ");
        jmlMasuk = input.nextInt();
        System.out.print("Masukkan jumlah hari anda tidak masuk kerja = ");
        jmlTdkMasuk = input.nextInt();

        TotGaji = (jmlMasuk * gaji) - (jmlTdkMasuk * potGaji);
        System.out.println("Gaji yang anda terima adalah = " + TotGaji);
    }
}
