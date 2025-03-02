

public class MMahasiswa {
    public static void main(String[] args) {
        System.out.println("==========Membuat Objek Titik==========");
        
        MataKuliah CALC2 = new MataKuliah("0025","Kalkulus 2",2);
        MataKuliah PBO = new MataKuliah("0421", "Pemrogramman Berbasis Objek", 3);
        MataKuliah DTB = new MataKuliah("0418", "Basis Data", 4);
        MataKuliah RPL = new MataKuliah("0430","Rekayasa Perangkat Lunak",3);
        MataKuliah IOT = new MataKuliah("0011","Internet of Things",2);

        Dosen D1 = new Dosen("193040019","Tunarti Widjoatmu","Informatika");

        Kendaraan K1 = new Kendaraan("H 3102 JTQ", "Motor");

        Mahasiswa M1 = new Mahasiswa("", "", "");
        M1.setNamaMHS("Dimas A Albanna Zain");
        M1.setNIM("23040133");
        M1.setProdi("Informatika");

        M1.printMHS();

        Mahasiswa M2 = new Mahasiswa("Bima Satria Pinandita", "24030091", "Statistika");
        M2.printMHS();

        M2.addMatKul(IOT);
        M2.addMatKul(CALC2);
        MataKuliah[] MatKulM2 = M2.getListMatKul();
        for(MataKuliah matkul : MatKulM2){
            System.out.println(" | " + matkul.getNamaMK());
        }
        System.out.println("\n\n");

        M1.addMatKul(PBO);
        M1.addMatKul(CALC2);
        M1.addMatKul(RPL);
        M1.addMatKul(DTB);
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        
        M1.printDetailMHS();
    }
}
