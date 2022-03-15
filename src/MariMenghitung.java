import java.util.Scanner;

public class MariMenghitung {
    public static void main(String[] args) {
        System.out.println("Mari menghitung keliling Persegi Panjang");

        Scanner inputAngka = new Scanner(System.in);
        int panjang, lebar, keliling;
        System.out.print("Masukkan panjang: ");
        panjang = inputAngka.nextInt();
        System.out.print("Masukkan lebar: ");
        lebar = inputAngka.nextInt();

        System.out.println("Panjangnya adalah: " + panjang);
        System.out.println("Lebarnya adalah: " + lebar);

        keliling = 2 * (panjang + lebar);
        System.out.println("Kelilingnya adalah: 2 * (p + l) =" + keliling);


    }
}
