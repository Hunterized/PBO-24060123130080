public class MataKuliah {
    /* ATRIBUT */
    private String idMatKul;
    private String NamaMK;
    private int SKS;

    /* BEHAVIOR */

    //Konstruktor
    public MataKuliah(){
        idMatKul = "";
        NamaMK = "";
        SKS = 0;
    }

    public MataKuliah(String ID, String Nama, int SKS){
        idMatKul = ID;
        NamaMK = Nama;
        this.SKS = SKS;
    }

    //Selektor
    public String getIDMatKul(){
        return idMatKul;
    }

    public String getNamaMK(){
        return NamaMK;
    }

    public int getSKS(){
        return SKS;
    }

    //Mutator
    public void setIDMatKul(String ID){
        idMatKul = ID;
    }

    public void setNamaMK(String Nama){
        NamaMK = Nama;
    }

    public void setSKS(int SKS){
        this.SKS = SKS;
    }
}
