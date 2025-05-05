/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihantestmedium;

/**
 *
 * @author zahid
 */
public class Senjata {
    private String bunyi;
    private int peluru;
    private boolean menusuk;
    
    public Senjata(String bunyi){
        this.bunyi = bunyi;
    }
    
    public String getBunyi(){
        return this.bunyi;
    }
    
    public int getPeluru(){
        return this.peluru;
    }
    
    public boolean isMenusuk(){
        return this.menusuk;
    }
    
    public void menembak(){
        this.peluru-=1;
        System.out.println(this.bunyi);
        System.out.println("Sisa peluru : " + this.peluru);
    }
    
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    
    public void setMenusuk(boolean menusuk){
        this.menusuk = menusuk;
    }
    
    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
}
