public class whileLoop {
    public static void main(String[] args) {
        System.out.println("Belajar whileLoop");

        int a = 1;
        boolean kondisi = true;

        while (kondisi) {
            System.out.println("While loop ke- " + a);

            if (a == 20) {
                kondisi = false;
            }
            a++;
        }
        System.out.println("===================");
    }
}
