import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class Tendik extends Pegawai {
    
    /* Atribut */
    private LocalDate BUP;
    private String Bidang;

    /* Method */
        // Konstruktor
    public Tendik(){
        this.BUP = LocalDate.now();
        this.Bidang = "#";
    }

    public Tendik(String NIP, String Nama, LocalDate Tgl_Lahir, LocalDate TMT, int Gaji, String Bidang){
        this.NIP = NIP;
        this.Nama = Nama;
        this.Tgl_Lahir = Tgl_Lahir;
        this.TMT = TMT;
        this.Gaji = Gaji;
        this.Bidang = Bidang;
        int BUPMonth = Tgl_Lahir.getMonthValue() + 1;
        int BUPYear = Tgl_Lahir.getYear() + 55;
        if (BUPMonth > 12){
            BUPMonth = 1;
            BUPYear += 1;
        }
        this.BUP = LocalDate.of(BUPYear, BUPMonth, 1);
    }
       //Selektor
    public LocalDate getBUP(){
        return BUP;
    }
    public String getBidang(){
        return Bidang;
    }

        //Mutator
    public void setBUP(LocalDate BUP){
        this.BUP = BUP;
    }
    public void setBidang(String Bidang){
        this.Bidang = Bidang;
    }

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
        double Tunjangan = 0.01 * MKYear * Gaji;
            //Format Nominal 
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        String gajiInformat = currencyFormat.format(Gaji);
        String tunjanganInformat = currencyFormat.format(Tunjangan);

        System.out.printf("%-20s: %s%n", "NIP", NIP);
        System.out.printf("%-20s: %s%n", "Nama", Nama);
        System.out.printf("%-20s: %s%n", "Tanggal Lahir", dateInformat(Tgl_Lahir));
        System.out.printf("%-20s: %s%n", "TMT", dateInformat(TMT));
        System.out.printf("%-20s: %s%n", "Jabatan", "Tenaga Pendidikan");
        System.out.printf("%-20s: %s%n", "Bidang", Bidang);
        System.out.printf("%-20s: %s%n", "Masa Kerja", printMasaKerja());
        System.out.printf("%-20s: %s%n", "BUP", dateInformat(BUP));
        System.out.printf("%-20s: %s%n", "Gaji Pokok", gajiInformat);
        System.out.printf("%-20s: %s%n", "Tunjangan", tunjanganInformat);
    }

}
