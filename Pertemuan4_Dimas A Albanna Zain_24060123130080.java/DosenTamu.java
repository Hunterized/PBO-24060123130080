import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class DosenTamu extends Dosen{
    
    /* Atribut */
    private String NIDK;
    private LocalDate TglAkhirKontrak;

    /* Method */
        // Konstruktor
    public DosenTamu(){
        this.NIDK = "#";
        this.TglAkhirKontrak = LocalDate.now();
    }

    public DosenTamu(String NIP, String Nama, LocalDate Tgl_Lahir, LocalDate TMT, int Gaji, String Fakultas, String NIDN, LocalDate TglAkhir){
        this.NIP = NIP;
        this.Nama = Nama;
        this.Tgl_Lahir = Tgl_Lahir;
        this.TMT = TMT;
        this.Gaji = Gaji;
        this.Fakultas = Fakultas;
        this.NIDK = NIDN;
        this.TglAkhirKontrak = TglAkhir;
    }
       //Selektor
    public String getNIDK(){
        return NIDK;
    }
    public LocalDate getTglAkhirKontrak(){
        return TglAkhirKontrak;
    }

        //Mutator
    public void setNIDN(String NIDK){
        this.NIDK = NIDK;
    }
    public void setBUP(LocalDate TglAkhir){
        this.TglAkhirKontrak = TglAkhir;
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
        double Tunjangan = 0.025 * Gaji;
            //Format Nominal 
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        String gajiInformat = currencyFormat.format(Gaji);
        String tunjanganInformat = currencyFormat.format(Tunjangan);

        System.out.printf("%-20s: %s%n", "NIP", NIP);
        System.out.printf("%-20s: %s%n", "NIDK", NIDK);
        System.out.printf("%-20s: %s%n", "Nama", Nama);
        System.out.printf("%-20s: %s%n", "Tanggal Lahir", dateInformat(Tgl_Lahir));
        System.out.printf("%-20s: %s%n", "TMT", dateInformat(TMT));
        System.out.printf("%-20s: %s%n", "Jabatan", "Dosen Tamu");
        System.out.printf("%-20s: %s%n", "Fakultas", Fakultas);
        System.out.printf("%-20s: %s%n", "Masa Kerja", printMasaKerja());
        System.out.printf("%-20s: %s%n", "Akhir Kontrak", dateInformat(TglAkhirKontrak));
        System.out.printf("%-20s: %s%n", "Gaji Pokok", gajiInformat);
        System.out.printf("%-20s: %s%n", "Tunjangan", tunjanganInformat);
    }
}
