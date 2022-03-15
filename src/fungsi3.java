import java.util.Scanner;

public class fungsi3 {
    public static void main(String[] args) {
        //fungsi hitung

        Scanner userInput = new Scanner(System.in);
        System.out.print("Panjang: ");
        int inputPanjang = userInput.nextInt();
        System.out.print("Lebar: ");
        int inputLebar = userInput.nextInt();

        gambar(inputPanjang,inputLebar);

        System.out.println("Luas = " + luas(inputPanjang,inputLebar));
        System.out.println("Keliling = " + keliling(inputPanjang,inputLebar));

        nilai(inputPanjang,inputLebar);
    }

    //funngsi menampilkan nilai

    public static void nilai(int panjang, int lebar){
        System.out.println("====Menghitung Luas dan Keliling====");
        System.out.println("Luas = " + luas(panjang,lebar));
        System.out.println("Keliling = " + keliling(panjang,lebar));
    }

    //fungsi luas

    public static int luas(int panjang, int lebar){
        int hasil = panjang * lebar;
        return hasil;
    }

    //fungsi keliling

    public static int keliling(int panjang, int lebar){
        int hasil = 2 * (panjang * lebar);
        return hasil;
    }

    //fungsi

    public static void gambar(int panjang, int lebar){
        for (int i=0; i<lebar; i++){
            for (int x=0; x<panjang; x++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

}
