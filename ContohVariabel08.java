public class ContohVariabel08 {
    public static void main(String[] args) {
        //Syntax
    String salahSatuHobySayaAdalah = "Bermain petak umpet";
    boolean isPandai = true;
    char jenisKelamin = 'L';
    byte umurSayaSekarang = 20;
    double ipk = 3.24d, tinggi = 1.78d;

    //Output
    System.out.printf(salahSatuHobySayaAdalah);
    System.out.println("Apakah Pandai? " + isPandai);
    System.out.println("Jenis Kelamin : " + jenisKelamin);
    System.out.println("Umurku Saat Ini : " + umurSayaSekarang);
    System.out.println(String.format("Saya ber-IPK %s, dengan tinggi badan %s", ipk, tinggi));
    }
}
