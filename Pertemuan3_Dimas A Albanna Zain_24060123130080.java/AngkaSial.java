/*  DIMAS A ALBANNA ZAIN
    24060123130080
    4 Maret 2025
*/

public class AngkaSial{
    
    public void cobaAngka(int Angka) throws AngkaSialException{
        if (Angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(Angka+" bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
                System.out.println(ase.getMessage());
                System.out.println("Hati-hati memasukan Angka!!!");
        }
    }
}

/*
    Ketika terjadi eksepsi,
    1. Apakah baris ke 12 pada kode diatas dijalankan?

    Tidak. Line 12 akan tidak dijalankan. Setelah exception buatan mendeteksi Angka sial (13), program 
    akan di throw ke main dan masuk ke bagian 'catch' serta menjalankan pesan eksepsi.

    2. Apakah baris ke 21 pada kode diatas dijalankan?

    Iya. Saat eksepsi buatan mendeteksi angka 13, kendali langsung dilempar ke 'catch' pada main

    { 
        Jaga-jaga jika yang ditanya adalah Line 20 bukan Line 21.
     
        Tidak. Line 20 tidak akan dijalankan saat eksepsi terjadi. Karena pada Line 19, program cobaAngka 
        mendeteksi Angka berupa angka sial, sehingga program langsung break dan menjalankan apa yang ada
        di block catch tanpa melanjutkan Line 19.
    }
 */
