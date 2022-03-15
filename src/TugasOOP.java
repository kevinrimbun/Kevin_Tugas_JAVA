// Contoh Pertama

// class without construtor
class OnlineShop {
    String namaPembeli;
    String namaBarang;
    String alamatPengiriman;
    int hargaBarang;
}


public class TugasOOP {
    public static void main(String[] args) {
        OnlineShop pengiriman1 = new OnlineShop();
        pengiriman1.namaPembeli = "Kevin Ganteng";
        pengiriman1.namaBarang = "Kemeja";
        pengiriman1.alamatPengiriman = "Tanjung Duren";
        pengiriman1.hargaBarang = 300000;

        System.out.println("Pesanan atas nama: " + pengiriman1.namaPembeli);
        System.out.println("Barang yang dipesan: " + pengiriman1.namaBarang);
        System.out.println("Alamatnya di: " + pengiriman1.alamatPengiriman);
        System.out.println("Harga barangnya adalah: Rp. " + pengiriman1.hargaBarang);

        System.out.println("================================");

        OnlineShop pengiriman2 = new OnlineShop();
        pengiriman2.namaPembeli = "Akram yang katanya Ganteng";
        pengiriman2.namaBarang = "Celana Chino";
        pengiriman2.alamatPengiriman = "Depok";
        pengiriman2.hargaBarang = 250000;

        System.out.println("Pesanan atas nama: " + pengiriman2.namaPembeli);
        System.out.println("Barang yang dipesan: " + pengiriman2.namaBarang);
        System.out.println("Alamatnya di: " + pengiriman2.alamatPengiriman);
        System.out.println("Harga barangnya adalah: Rp. " + pengiriman2.hargaBarang);
    }
}
