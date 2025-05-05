/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihantestmedium;

/**
 *
 * @author zahid
 */
public class KontrolSenjata{
    private Senjata Senjata;
    
    public KontrolSenjata(Senjata s){
        this.Senjata = s;
    }
    
    public boolean isAdaPeluru(){
        if (Senjata.getPeluru() <= 0){
            System.out.println("Peluru habis");
            return false;
        } else {
            Senjata.setPeluru(Senjata.getPeluru()- 1);
            return true;
        }
    }
    
    public int isiPeluru(int jumPeluru){
        int total = Senjata.getPeluru() + jumPeluru;
        Senjata.setPeluru(total);
        System.out.println("Peluru berhasil ditambah " + jumPeluru);
        return total;
    }
    
    public int menembak(int jumlah){
        int total = Senjata.getPeluru() - jumlah;
        System.out.println("Siap, menembak " + jumlah + " kali");
        for (int i = 0; i < jumlah; i++) {
            if (isAdaPeluru()) {
                System.out.println(Senjata.getBunyi());
            } else {
                break;
            }
        }
        return total;
    }
    
    public void menusuk(){
        if (Senjata.isMenusuk()){
            System.out.println("Aku tusuk nih");
        } else {
            System.out.println("Aduh tumpul, gabisa tusuk");
        }
    }
    
    public void pasangBayonet(){
        Senjata.setMenusuk(true);
    }
}

