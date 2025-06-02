public class Anabul {
    private String Nama;

    //KOnstruktor
    public Anabul(){
        this.Nama = "";
    } 

    public Anabul(String Nama){
        this.Nama = Nama;
    }

    //Method
    public String getNama(){
        return Nama;
    }
    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public void gerak() { }

    public void bersuara() { }
}
