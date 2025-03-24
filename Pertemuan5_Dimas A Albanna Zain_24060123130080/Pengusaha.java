
import java.time.LocalDate;

public class Pengusaha extends Manusia implements Pajak {
    private String NPWP;
    private static int counterPengusaha;

    /* Methods */
    public Pengusaha(){
        super();
        this.NPWP = "";
        counterPengusaha++;
    }

    public Pengusaha(String name, LocalDate TGL, String alamat, double Nominal, String npwp){
        super(name, TGL, alamat, Nominal);
        this.NPWP = npwp;
        counterPengusaha++;
    }

        //Selektor & Mutator
    public String getNPWP(){
        return this.NPWP;
    }
    public void setNPWP(String npwp){
        this.NPWP = npwp;
    }
    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

        //Overides
    @Override
    public int hitungMasaKerja(){
        // NIM: 080 -> Digit B = 8
        return super.hitungMasaKerja() + 8;
    }

    @Override
    public double hitungPajak(){
        return 0.15 * this.Pendapatan;
    } 
}