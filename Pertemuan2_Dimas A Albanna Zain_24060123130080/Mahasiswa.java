
import java.util.ArrayList;

public class Mahasiswa {
    /* ATRIBUT */
    private String NIM;
    private String Nama;
    private String Prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen DosenWali;
    private Kendaraan Kendaraan;

    /* BEHAVIOR */

    //Konstruktor
    public Mahasiswa(){
        this.listMatKul = new ArrayList<>();
        NIM = "";
        Nama = "";
        Prodi = "";
        DosenWali = new Dosen("", "", "");
        this.Kendaraan = new Kendaraan("","");
    }

    public Mahasiswa(String Nama, String NIM, String Prodi){
        this.listMatKul = new ArrayList<>();
        this.Nama = Nama;
        this.NIM = NIM;
        this.Prodi = Prodi;
        DosenWali = new Dosen("", "", "");
        this.Kendaraan = new Kendaraan("","");
    }

    //Selektor
    public String getNamaMHS(){
        return this.Nama;
    }

    public String getNIM(){
        return this.NIM;
    }

    public String getProdiMHS(){
        return this.Prodi;
    }

    public MataKuliah[] getListMatKul(){
        return listMatKul.toArray(new MataKuliah[0]);
    }

    public Dosen getDosen(){
        return DosenWali;
    }

    public Kendaraan getKendaraan(){
        return this.Kendaraan;
    }

    //Mutator
    public void setNamaMHS(String MNama){
        this.Nama = MNama;
    }

    public void setNIM(String NIM){
        this.NIM = NIM;
    }

    public void setProdi(String Prodi){
        this.Prodi = Prodi;
    }

    public void setDosenWali(Dosen MDosen){
        this.DosenWali = MDosen;
    }

    public void setKendaraan(Kendaraan MKendaraan){
        this.Kendaraan = MKendaraan;
    }

    //Method Lain
    public void addMatKul(MataKuliah MatKul){
        this.listMatKul.add(MatKul);
    }

    public int getJumlahSKS(){
        int SKStotal = 0;
        for (MataKuliah MatKul : listMatKul){
            SKStotal += MatKul.getSKS();
        }
        return SKStotal;
    }

    public int getJumlahMatKul(){
        int MKCounter = 0;
        for (int i = 0; i < listMatKul.size(); i++) {
            MKCounter += 1;
        }
        return MKCounter;
    }

    public void printMHS(){
        System.out.printf("%-25s: %s%n", "NIM Mahasiswa", NIM);
        System.out.printf("%-25s: %s%n", "Nama Mahasiswa", Nama);
        System.out.printf("%-25s: %s%n", "Program Studi Mahasiswa", Prodi + "\n");
        
    }

    public void printDetailMHS(){
        this.printMHS();
        System.out.println("Mata Kuliah Dipilih: ");
        for(MataKuliah MatKul : listMatKul){
            System.out.println("   | " + MatKul.getNamaMK());
        }
        System.out.println(
            "Nama Dosen: " + DosenWali.getNamaDosen() + 
            " | NIP: " + DosenWali.getNIP() + 
            " | Prodi Dosen: " + DosenWali.getProdiDosen());
        System.out.println(
            "Plat Kendaraan: " + Kendaraan.getNoPlat() +
            " | Jenis: " + Kendaraan.getJenis());
    }
}
