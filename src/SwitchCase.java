import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Belajar switch case");

        String inputNama;
        Scanner cobaInput = new Scanner(System.in);

        System.out.print("Nama: ");
        inputNama = cobaInput.next(); // next biasa kalau string dan nextInt kalau integer

        // switch bisa dipakai di string,long,byte,int,short

        switch (inputNama) {
            case "kevin":
                System.out.println("Kevin hadir");
                break;
            case "Bill":
                System.out.println("Bill juga hadir");
                break;
            case "Koko":
                System.out.println("Koko hadir donggg");
                break;
            default:
                System.out.println("Momo tidak hadir");
        }

    }
}
