public class MahasiswaMain04 {
    public static void main(String[] args) {
        Mahasiswa04 mhs1 = new Mahasiswa04();
        mhs1.nama = "Ghozali";
        mhs1.nim = "244107060111";
        mhs1.kelas = "SIB 1F";
        mhs1.ipk = 3.5;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SIB 1G");
        mhs1.updateIpk(3.7);
        mhs1.tampilkanInformasi();
    }
}
