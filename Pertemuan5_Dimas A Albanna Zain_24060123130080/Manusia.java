/*  Nama: Dimas A Albanna Zain
 *  NIM : 24060123130080
 *  File: Pegawai.java
 *  Desc: Definisi Superclass Pegawai
 */

import java.time.LocalDate;
import java.time.Period;
 
public abstract class Manusia {
    /* Atribut */
    protected String Nama;
    protected LocalDate Tgl_Mulai_Kerja;
    protected String Alamat;
    protected double Pendapatan;
    protected static int counterMns;

    /* Methods */
    public Manusia(){
        this.Nama = "";
        this.Tgl_Mulai_Kerja = LocalDate.now();
        this.Alamat = "";
        this.Pendapatan = 0.0;
        counterMns++;
    }

    public Manusia(String name, LocalDate TGL, String alamat, double Nominal){
        this.Nama = name;
        this.Tgl_Mulai_Kerja = TGL;
        this.Alamat = alamat;
        this.Pendapatan = Nominal;
        counterMns++;
    }

        // Selector 
    public String getNama(){
        return this.Nama;
    }

    public LocalDate getTglMulaiKerja(){
        return this.Tgl_Mulai_Kerja;
    }

    public String getAlamat(){
        return this.Alamat;
    }

    public double getPendapatan(){
        return this.Pendapatan;
    }

    public static int getCounterMns(){
        return counterMns;
    }

        //Mutator
    public void setNama(String name){
        this.Nama = name;
    }

    public void setTglMulaiKerja(LocalDate TGL){
        this.Tgl_Mulai_Kerja = TGL;
    }

    public void setAlamat(String alamat){
        this.Alamat = alamat;
    }

    public void setPendapatan(double Nominal){
        this.Pendapatan = Nominal;
    }

        //Method Lain        
    public void cetakInfo(){
        System.out.printf("%-20s: %s%n", "Nama", getNama());
        System.out.printf("%-20s: %s%n", "Alamat", getAlamat());
        System.out.printf("%-20s: %s%n", "Pendapatan", getPendapatan());
        System.out.printf("%-20s: %s%n", "Tgl Mulai Kerja", getTglMulaiKerja());
    }

    public int hitungMasaKerja(){
        // Diasumsikan int yang di-output adalah tahun dan bukan hari.
        LocalDate Now = LocalDate.now();
        Period masaKerja = Period.between(Tgl_Mulai_Kerja, Now);
        return masaKerja.getYears();
    }    
}
