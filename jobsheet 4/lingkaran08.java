import java.util.Scanner;

public class lingkaran08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int r;
        double keliling, luas, phi = 3.14;

        System.out.print("Masukkan jari-jari lingkaran = ");
        r = input.nextInt();

        keliling = 2 * phi * r;
        luas = phi * r * r;
        System.out.println("Keliling Lingkaran = " + keliling);
        System.out.println("Luas lingkaran = " + luas);
    }
}