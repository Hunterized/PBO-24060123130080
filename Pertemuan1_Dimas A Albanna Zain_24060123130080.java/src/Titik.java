/* Nama File : MTitik.java
 * Pembuat : 24060123130080 | Dimas A Albanna Zain
 * Deskripsi : Definisi class titik serta Atribut dan Methodnya
 * Tanggal : Selasa, 18 Feb 2025
 */

public class Titik {
    /* ATRIBUT */
    double absis;
    double ordinat;
    static int counterTitik;

    /* BEHAVIOR */

    //Konstruktor
    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    Titik(double x, double y){
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    //Selector
    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    //Mutator
    void setAbsis(double x){
        this.absis = x;
    }

    void setOrdinat(double y){
        this.ordinat = y;
    }

    //Method Lain
    void geser(double x, double y){
        absis += x;
        ordinat += y;
    }

    int getKuadran(){
        if (absis > 0){
            if (ordinat > 0){
                return 1;
            } else { //Ordinat Negatif
                return 4;
            }
        } if (absis < 0) {
            if (ordinat > 0){
                return 2;
            } else { //Ordinat Negatif
                return 3;
            }
        } else {
            return 0;
        }
    }

    double getJarakPusat(){
        return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    double getJarak(Titik T){
        return Math.sqrt(Math.pow(absis - T.getAbsis(), 2) + Math.pow(ordinat - T.getOrdinat(), 2));
    }

    void refleksiX(){
        ordinat *= -1;
    }

    void refleksiY(){
        absis *= -1;
    }

    Titik getRefleksiX(){
        return new Titik(absis, ordinat * -1);
    }

    Titik getRefleksiY(){
        return new Titik(absis * -1, ordinat);
    }

    //Pencetak
    void printTitik(){
        System.out.println("Titik (" + absis + ", " + ordinat +")");
    }

    void printCounterTitik(){
        System.err.println("Jumlah Titik: "+ Titik.counterTitik +"");
    }
}
