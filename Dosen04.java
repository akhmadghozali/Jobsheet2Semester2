public class Dosen04 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;
    public Dosen04() {
    }
    public Dosen04(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
    void tampilkanInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status Aktif: " + statusAktif);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }
    void setStatusAktif(boolean statusAktif) {
        this.statusAktif = statusAktif;
    }
    void hitungMasaKerja() {
        int masaKerja = 2025 - tahunBergabung;
        System.out.println("Masa Kerja: " + masaKerja + " tahun");
    }
    void ubahBidangKeahlian(String bidangKeahlian) {
        this.bidangKeahlian = bidangKeahlian;
    }
    public static void main(String[] args) {
        Dosen04 dosen1 = new Dosen04("D01", "Ghozali", true, 2010, "Dasar Pemrograman");
        dosen1.tampilkanInformasi();
        dosen1.setStatusAktif(false);
        dosen1.hitungMasaKerja();
        dosen1.ubahBidangKeahlian("Matematika Dasar");
        dosen1.tampilkanInformasi();
        Dosen04 dosen2 = new Dosen04("D02", "Ghozzzzz", true, 2010, "Dasar Pemrograman");
        dosen2.tampilkanInformasi();
        dosen2.setStatusAktif(false);
        dosen2.hitungMasaKerja();
        dosen2.ubahBidangKeahlian("Matematika Dasar");
        dosen2.tampilkanInformasi();
    }
}
