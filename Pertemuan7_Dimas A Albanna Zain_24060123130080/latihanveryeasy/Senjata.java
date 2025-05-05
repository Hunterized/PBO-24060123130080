/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanveryeasy;
/* Nama     : Dimas A Albanna Zain
 * NIM      : 24060123130080
 * File     : Senjata.java
 * Tanggal  : 6 Mei 2025
 */

/**
 *
 * @author zahid
 */
public class Senjata{
    private String bunyi;
    private int peluru;
    
    public Senjata(String bunyi){
        this.bunyi = bunyi;
    }
    
    public String getBunyi(){
        return this.bunyi;
    }
    
    public int getPeluru(){
        return this.peluru;
    }
    
    public void menembak(){
        this.peluru-=1;
        System.out.println(this.bunyi);
        System.out.println("Sisa peluru: " + this.peluru);
    }
    
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    
    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
}