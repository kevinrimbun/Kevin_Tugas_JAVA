// Contoh Ketiga

class Hobi {
    String namaOrang;
    String namaHobi;

    Hobi (String namaOrang, String namaHobi) {
        this.namaOrang = namaOrang;
        this.namaHobi = namaHobi;
    }

    void show() {
        System.out.println("Nama: " + namaOrang);
        System.out.println("Hobinya: " + namaHobi);
        System.out.println("=======================");
    }
}

public class TugasOOP3 {
    public static void main(String[] args) {

        Hobi hobi1 = new Hobi("Kevin", "Berkebun");
        Hobi hobi2 = new Hobi("Akram", "Bermain Game");
        Hobi hobi3 = new Hobi("Cindy", "Kerja");
        Hobi hobi4 = new Hobi("Dei", "Menggambar");

        hobi1.show();
        hobi2.show();
        hobi3.show();
        hobi4.show();
    }
}
