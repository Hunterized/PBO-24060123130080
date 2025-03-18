import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class DosenTetap extends Dosen{
    
    /* Atribut */
    private String NIDN;
    private LocalDate BUP;

    /* Method */
        // Konstruktor
    public DosenTetap(){
        this.NIDN = "#";
        this.BUP = LocalDate.now();
    }

    public DosenTetap(String NIP, String Nama, LocalDate Tgl_Lahir, LocalDate TMT, int Gaji, String Fakultas, String NIDN){
        this.NIP = NIP;
        this.Nama = Nama;
        this.Tgl_Lahir = Tgl_Lahir;
        this.TMT = TMT;
        this.Gaji = Gaji;
        this.Fakultas = Fakultas;
        this.NIDN = NIDN;
        int BUPMonth = Tgl_Lahir.getMonthValue() + 1;
        int BUPYear = Tgl_Lahir.getYear() + 65;
        if (BUPMonth > 12){
            BUPMonth = 1;
            BUPYear += 1;
        }
        this.BUP = LocalDate.of(BUPYear, BUPMonth, 1);
    }
       //Selektor
    public String getNIDN(){
        return NIDN;
    }
    public LocalDate getBUP(){
        return BUP;
    }

        //Mutator
    public void setNIDN(String NIDN){
        this.NIDN = NIDN;
    }
    public void setBUP(LocalDate BUP){
        this.BUP = BUP;
    }

        //Method Lain
    public String printMasaKerja(){
        int MKYear = LocalDate.now().getYear() - TMT.getYear();
        int MKMonth = LocalDate.now().getMonthValue() - TMT.getMonthValue();
        if (MKMonth < 0){
            MKMonth += 12;
            MKYear -= 1;
        }
        return MKYear + " Tahun " + MKMonth + " Bulan";
    }

    public void infoPrint(){
            //Hitung Tunjangan
        int MKYear = LocalDate.now().getYear() - TMT.getYear();
        int MKMonth = LocalDate.now().getMonthValue() - TMT.getMonthValue();
        if (MKMonth < 0){
            MKYear -= 1;
        }
        double Tunjangan = 0.02 * MKYear * Gaji;
            //Format Nominal 
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        String gajiInformat = currencyFormat.format(Gaji);
        String tunjanganInformat = currencyFormat.format(Tunjangan);

        System.out.printf("%-20s: %s%n", "NIP", NIP);
        System.out.printf("%-20s: %s%n", "NIDN", NIDN);
        System.out.printf("%-20s: %s%n", "Nama", Nama);
        System.out.printf("%-20s: %s%n", "Tanggal Lahir", dateInformat(Tgl_Lahir));
        System.out.printf("%-20s: %s%n", "TMT", dateInformat(TMT));
        System.out.printf("%-20s: %s%n", "Jabatan", "Dosen Tetap");
        System.out.printf("%-20s: %s%n", "Fakultas", Fakultas);
        System.out.printf("%-20s: %s%n", "Masa Kerja", printMasaKerja());
        System.out.printf("%-20s: %s%n", "BUP", dateInformat(BUP));
        System.out.printf("%-20s: %s%n", "Gaji Pokok", gajiInformat);
        System.out.printf("%-20s: %s%n", "Tunjangan", tunjanganInformat);
    }
}

