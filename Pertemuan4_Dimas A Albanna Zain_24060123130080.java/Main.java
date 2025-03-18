import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {
        DosenTetap D1 = new DosenTetap("00123", "Dimas Aqsho", LocalDate.of(1980, 4, 2), LocalDate.of(2010, 3, 14), 5000000, "Fakultas Teknik Kimia", "36881");
        
        DosenTamu D2 = new DosenTamu("00412", "Fatimah Annati", LocalDate.of(1980, 4, 2), LocalDate.of(2020, 1, 23), 4500000, "Fakultas Sains dan Matematika", "33411", LocalDate.of(2026, 9, 1));
    
        Tendik T1 = new Tendik("00145", "Bima Satria", LocalDate.of(1977, 8, 18), LocalDate.of(2009, 12, 11), 6250000, "Kemahasiswaan");

        D1.infoPrint();
        System.out.println("\n");
        D2.infoPrint();
        System.out.println("\n");
        T1.infoPrint();
    }
}
