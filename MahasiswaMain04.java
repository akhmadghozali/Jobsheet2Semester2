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
        Mahasiswa04 mhs2 = new Mahasiswa04("Ghozzzz", "244107060112", "SIB 1F", 3.8);
        mhs2.updateIpk(3.9);
        mhs2.tampilkanInformasi();
        Mahasiswa04 mhs3 = new Mahasiswa04("Godzila", "244107060113", "SIB 1F", 3.6);
        mhs3.tampilkanInformasi();
    }   
}
