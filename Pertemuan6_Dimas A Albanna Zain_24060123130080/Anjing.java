public class Anjing extends Anabul {
    private String Breed;

    //Konstruktor
    public Anjing(String Nama){
        super(Nama);
        this.Breed = "";
    }

    public Anjing(String Nama, String Jenis){
        super(Nama);
        this.Breed = Jenis;
    }

    //Method
    public String getBreed(){
        return Breed;
    }

    @Override
    public void gerak(){
        System.out.println("Anjing " + getBreed() + " Melata");
    }

    @Override
    public void bersuara(){
        System.out.println("Guk-Gukk!");
    }
}
