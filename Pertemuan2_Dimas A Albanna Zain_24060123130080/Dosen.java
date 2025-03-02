public class Dosen {
    /* ATRIBUT */
    private String NIP;
    private String DNama;
    private String Prodi;

    /* BEHAVIOR */
    //Konstruktor
    public Dosen(){
        NIP = "";
        DNama = "";
        Prodi = "";
    }
    
    public Dosen(String NIP, String DNama, String Prodi){
        this.NIP = NIP;
        this.DNama = DNama;
        this.Prodi = Prodi;
    }

    //Selektor

    public String getNIP(){
        return NIP;
    }

    public String getNamaDosen(){
        return DNama;
    }

    public String getProdiDosen(){
        return Prodi;
    }

    //Mutator
    
    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    public void setNamaDosen(String Nama){
        this.DNama = Nama;
    }

    public void setProdiDosen(String Prodi){
        this.Prodi = Prodi;
    }
}
