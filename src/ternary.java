import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        System.out.println("Belajar ternary");

        int cobaInput, x;

        Scanner menginput = new Scanner(System.in);

        System.out.print("Masukkan nilainya: ");
        cobaInput = menginput.nextInt();

        x = (cobaInput == 10) ? (cobaInput*cobaInput) : (cobaInput-2);

        System.out.println("Maka nilai x adalah: " + x);

        System.out.println("=======================");

        int a = 10;
        if (a == 10) {
            a += 5; //aksi 1
        } else {
            a -= 2; //aksi 2
        }
        System.out.println("Maka nilai adalah: " + a);
    }
}
