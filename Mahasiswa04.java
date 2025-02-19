public class Mahasiswa04 {
        String nama;
        String nim;
        String kelas;
        double ipk;
     void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
            }
    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
            }
    void updateIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0){
            ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }
    String nilaiKinerja(){
        if (ipk >= 3.5){
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0){
            return "Kinerja baik";
        } else if (ipk >= 2.5){
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }
        
        public static void main(String[] args) {
            Mahasiswa04 mhs1 = new Mahasiswa04();
            mhs1.nama = "Akhmad";
            mhs1.nim = "244107060112";
            mhs1.kelas = "SIB 1F";
            mhs1.ipk = 3.8;

            System.out.println("Data sebelum diubah");
            mhs1.tampilkanInformasi();
            mhs1.ubahKelas("SIB 1G");
            mhs1.updateIpk(3.9);
            System.out.println("Data setelah diubah");
            mhs1.tampilkanInformasi();
            System.out.println("Nilai kinerja: " + mhs1.nilaiKinerja());
        }
    }
