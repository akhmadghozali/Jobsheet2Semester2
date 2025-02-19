public class MataKuliah04 {
    String kodeMK;
    String namaMK;
    int sks;
    int jumlahJam;
    public MataKuliah04() {
        
    }
    public MataKuliah04(String kodeMK, String namaMK, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    void tampilkanInformasi() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama MK: " + namaMK);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }
    void ubahSKS(int sksBaru) {
        sks = sksBaru;
    }
    void tambahJam(int jumlahJamBaru) {
        jumlahJam += jumlahJamBaru;
    }
    void kurangiJam(int jumlahJamBaru) {
        if (jumlahJamBaru > jumlahJam) {
            System.out.println("Jumlah jam tidak valid. Harus kurang dari jumlah jam sebelumnya.");
            return;
        }
        jumlahJam -= jumlahJamBaru;
    }
    public static void main(String[] args) {
        MataKuliah04 mk1 = new MataKuliah04("MK01", "ALSD", 2, 120);
        mk1.tampilkanInformasi();
        mk1.ubahSKS(3);
        mk1.tambahJam(20);
        mk1.tampilkanInformasi();
        mk1.kurangiJam(30);
        mk1.tampilkanInformasi();
        MataKuliah04 mk2 = new MataKuliah04("MK02", "Basis Data", 2, 120);
        mk2.tampilkanInformasi();
        mk2.ubahSKS(3);
        mk2.tambahJam(20);
        mk2.tampilkanInformasi();
        mk2.kurangiJam(30);
        mk2.tampilkanInformasi();
    }
}
