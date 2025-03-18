import java.time.LocalDate;

public class Dosen extends Pegawai{
    
    /* Atribut: */
    protected String Fakultas;

    /* Method: */
        //Konstruktor
    public Dosen(){
        this.Fakultas = "#";
    }

    public Dosen(String NIP, String Nama, LocalDate Tgl_Lahir, LocalDate TMT, int Gaji, String Fakultas){
        this.NIP = NIP;
        this.Nama = Nama;
        this.Tgl_Lahir = Tgl_Lahir;
        this.TMT = TMT;
        this.Gaji = Gaji;
        this.Fakultas = Fakultas;
    }

        //Selector
    public String getFakultas(){
        return this.Fakultas;
    }

        //Mutator
    public void setFakultas(String Fakultas){
        this.Fakultas = Fakultas;
    }
}
