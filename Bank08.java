import java.util.Scanner;

public class Bank08 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int jml_tabungan_awal, lama_menabung;
        double jml_tabungan_akhir, persentase_bunga = 0.02, bunga;

        System.out.print("Masukkan jumlah tabungan awal anda = ");
        jml_tabungan_awal = userInput.nextInt();
        System.out.print("Berapa lama menabung = ");
        lama_menabung = userInput.nextInt();

        bunga = lama_menabung * persentase_bunga * jml_tabungan_awal;
        System.out.println("Bunga adalah = " + bunga);
        jml_tabungan_akhir = bunga + jml_tabungan_awal;
        System.out.println("Jumlah tabungan total anda = " + jml_tabungan_akhir);
    }
}
 