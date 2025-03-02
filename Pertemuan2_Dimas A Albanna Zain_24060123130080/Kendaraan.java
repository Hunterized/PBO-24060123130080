public class Kendaraan {
    /* ATRIBUT */
    private String noPlat;
    private String Jenis;

    /* BEHAVIOR */
    
    //Konstruktor
    public Kendaraan(){
        noPlat = "#";
        Jenis = "#";
    }

    public Kendaraan(String NOP, String Jenis){
        noPlat = NOP;
        this.Jenis = Jenis; 
    }

    //Selektor
    public String getNoPlat(){
        return noPlat;
    }

    public String getJenis(){
        return Jenis;
    }

    //Mutator
    public void setNoPlat(String NOP){
        noPlat = NOP;
    }

    public void setJenis(String Jenis){
        this.Jenis = Jenis;
    }
}
