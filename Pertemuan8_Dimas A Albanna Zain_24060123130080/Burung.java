public class Burung extends Anabul {
    private String Species;

    //Konstruktor
    public Burung(String Nama){
        super(Nama);
        this.Species = "";
    }

    public Burung(String Nama, String Species){ 
        super(Nama);
        this.Species = Species;
    }

    //Method
    public String getSpecies(){
        return Species;
    }

    @Override
    public void gerak(){
        System.out.println("Burung " + getSpecies() + " Terbang");
    }

    @Override
    public void bersuara(){
        System.out.println("cuit~ cuit~");
    }
}
