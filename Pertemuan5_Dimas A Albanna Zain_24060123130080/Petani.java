
import java.time.LocalDate;

public class Petani extends Manusia implements Pajak{
    private String asal_kota;
    private static int counterPetani;

    /* Methods */
    public Petani(){
        super();
        this.asal_kota = "";
        counterPetani++;
    }

    public Petani(String name, LocalDate TGL, String alamat, double Nominal, String Kota){
        super(name, TGL, alamat, Nominal);
        this.asal_kota = Kota;
        counterPetani++;
    }

        //Selektor & Mutator
    public String getAsalKota(){
        return this.asal_kota;
    }
    public void setAsalKota(String Kota){
        this.asal_kota = Kota;
    }
    public static int getCounterPetani(){
        return counterPetani;
    }

        //Overides
    @Override
    public int hitungMasaKerja(){
        // NIM: 080 -> Digit C = 0
        return super.hitungMasaKerja() + 0;
    }

    @Override
    public double hitungPajak(){
        return 0.0;
    } 
}