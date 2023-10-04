import java.util.Scanner;

public class HargaBayar08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String merkBuku;
        int harga, jumlah,jmlHalBuku;
        double disc = 0.1 , total, bayar, jmlDisc;

        System.out.print("Masukkan Merk Buku Anda = ");
        merkBuku = input.nextLine();
        System.out.print("jumlah halaman buku = ");
        jmlHalBuku = input.nextInt();
        System.out.print("Masukkan Harga Buku Anda = ");
        harga = input.nextInt();
        System.out.print("Masukkan berapa banyak buku yang dibeli = ");
        jumlah = input.nextInt();

        total = harga * jumlah;
        jmlDisc = total * disc;
        bayar = total - jmlDisc;

        System.out.println("Merk buku " + merkBuku);
        System.out.println("Jumlah halaman buku " + jmlHalBuku);
        System.out.println("Jumlah yang anda beli " + jumlah);
        System.out.println("Jumlah diskon anda = " + jmlDisc);
        System.out.println("Total yang dibayar setelah diskon = " + bayar + "rupiah");
    }
}
