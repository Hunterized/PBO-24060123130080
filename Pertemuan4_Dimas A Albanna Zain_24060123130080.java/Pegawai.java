/*  Nama: Dimas A Albanna Zain
 *  NIM : 24060123130080
 *  File: Pegawai.java
 *  Desc: Definisi Superclass Pegawai
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pegawai {
    /* Atribut: */
    protected String NIP;
    protected String Nama;
    protected LocalDate Tgl_Lahir;
    protected LocalDate TMT;
    protected int Gaji;

    /* Method: */
        // Konstruktor
    public Pegawai(){
        this.NIP = "#";
        this.Nama = "#";
        this.Tgl_Lahir = LocalDate.now();
        this.TMT = LocalDate.now();
        this.Gaji = 0;
    }

    public Pegawai(String NIP, String Nama, LocalDate Tgl_Lahir, LocalDate TMT, int Gaji){
        this.NIP = NIP;
        this.Nama = Nama;
        this.Tgl_Lahir = Tgl_Lahir;
        this.TMT = TMT;
        this.Gaji = Gaji;
    }

        //Selector
    public String getNIP(){
        return this.NIP;
    }
    public String getNamaPegawai(){
        return this.Nama;
    }
    public LocalDate getTglLahir(){
        return this.Tgl_Lahir;
    }
    public LocalDate getTMT(){
        return this.TMT;
    }
    public int getGaji(){
        return this.Gaji;
    }

        //Mutator
    public void setNIP(String Nomor){
        this.NIP = Nomor;
    }
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public void setTglLahir(LocalDate Tgl){
        this.Tgl_Lahir = Tgl;
    }
    public void setTMT(LocalDate Date){
        this.TMT = Date;
    }
    public void setGaji(int Nominal){
        this.Gaji = Nominal;
    }
    
    public String dateInformat(LocalDate Date){
        String printMon = "Januari";
        int monthPrint = Date.getMonthValue();
        switch (monthPrint) {
            case 2:  printMon = "Februari"; break;
            case 3:  printMon = "Maret"; break;
            case 4:  printMon = "April"; break;
            case 5:  printMon = "Mei"; break;
            case 6:  printMon = "Juni"; break;
            case 7:  printMon = "Juli"; break;
            case 8:  printMon = "Agustus"; break;
            case 9:  printMon = "September"; break;
            case 10: printMon = "Oktober"; break;
            case 11: printMon = "November"; break;
            case 12: printMon = "Desember"; break;
        }
        String yearInformat = Date.format(DateTimeFormatter.ofPattern("yyyy"));

        return Date.getDayOfMonth() + " " + printMon + " " + yearInformat;
    }
}

