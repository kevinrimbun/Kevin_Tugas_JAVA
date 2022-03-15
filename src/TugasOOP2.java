// Contoh Kedua

//class with Constructor
class Toko {
    String barang;
    int jumlah;
    int harga;


    Toko(String inputBarang, int jumlahBarang, int hargaBrang) {
        barang = inputBarang;
        jumlah = jumlahBarang;
        harga = hargaBrang;

        System.out.println("Barang yang dibeli: " + barang);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Rp. " + harga);
        System.out.println("==============");
    }
}


public class TugasOOP2 {
    public static void main(String[] args) {
        Toko toko1 = new Toko("Krimer", 2, 22000);
        Toko toko2 = new Toko("Tepung Terigu", 3, 33000);
        Toko toko3 = new Toko("Keju", 1, 13000);
    }
}
