public class KevSynrgy {
    public static void main(String[] args) {
        System.out.println("Hello folks, i'm Kevin. Glad to see y'all");

        // Tipe Data Integer
        byte testByte = 100;
        short testShort = 2000;
        int testInt = 30000;
        long testLong = 4000000;

        // Tipe Data Floating Point
        float testFloat = 30.18f; // <-- harus ada f di belakang angkanya
        double testDouble = 30.18;

        // Tipe Data Boolean
        boolean trueBoolean = true;
        boolean falseBoolean = false;
        System.out.println(trueBoolean);

        // Tipe Data Character
        char a = 'A';
        char b = 'B';
        char c = 'C';

        System.out.print(a);
        System.out.print(b);
        System.out.print(c);

        // Variable String
        String namaDepan; // Sring pakai petik dua " "

        namaDepan = "Kevin";

        String namaBelakang = "Rimbun";

        String namaLengkap = namaDepan + " " + namaBelakang;
        System.out.println(namaLengkap);

        // String paragraf menggunakan petik dua namun 3 pasang """"""
        String paragraf = """
                Halo nama saya kevin, saya  sedang mencoba pargraf dengan 
                menggunakan petik dua namun 3 pasang di Java
                """;
        System.out.print(paragraf);

    }
}
