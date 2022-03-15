public class doWhileLoop {
    public static void main(String[] args) {
        System.out.println("doWhileLoop");

        int a = 1;
        boolean kondisi = true; //deklarasi

        do { //aksi
            a++;
            System.out.println("doWhileLoop ke- " + a);
            if (a == 10) {
                kondisi = false;
            }
        } while (kondisi);
        System.out.println("=============");
    }
}
