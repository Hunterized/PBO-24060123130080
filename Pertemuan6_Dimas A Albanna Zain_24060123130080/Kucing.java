public class Kucing extends Anabul {
    private String WarnaBulu;

    //Konstruktor
    public Kucing(String Nama){
        super(Nama);
        this.WarnaBulu = "";
    }

    public Kucing(String Nama, String Bulu){
        super(Nama);
        this.WarnaBulu = Bulu;
    }

    //Method
    public String getWarna(){
        return WarnaBulu;
    }

    @Override
    public void gerak(){
        System.out.println("Kucing " + getWarna() + " Melata");
    }

    @Override
    public void bersuara(){
        if(super.getNama() != "Akmal"){
            System.out.println("Meong~");
        } else {
            System.out.println("OIIAIOUIIAI");
        }
    }
}
