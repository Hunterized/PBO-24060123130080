import java.time.LocalDate;

public class PNS extends Manusia implements Pajak{
    /* Atribut */
    private String NIP;
    private static int counterPNS;

    /* Methods */
    public PNS(){
        super();
        this.NIP = "";
        counterPNS++;
    }

    public PNS(String name, LocalDate TGL, String alamat, double Nominal, String NIP){
        super(name, TGL, alamat, Nominal);
        this.NIP = NIP;
        counterPNS++;
    }

        //Selektor & Mutator
    public String getNIP(){
        return this.NIP;
    }
    public void setNIP(String NIP){
        this.NIP = NIP;
    }
    public static int getCounterPNS(){
        return counterPNS;
    }

        //Overides
    @Override
    public int hitungMasaKerja(){
        // NIM: 080 -> Digit A = 0
        return super.hitungMasaKerja() + 0;
    }

    @Override
    public double hitungPajak(){
        return 0.1 * this.Pendapatan;
    } 
}
