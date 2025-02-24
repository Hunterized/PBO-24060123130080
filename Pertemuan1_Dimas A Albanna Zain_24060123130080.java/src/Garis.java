/* Nama File : Garis.java
 * Pembuat : 24060123130080 | Dimas A Albanna Zain
 * Deskripsi : Definisi class garis serta Atribut dan Methodnya
 * Tanggal : Kamis, 20 Feb 2025
 */

public class Garis {
    /* ATRIBUT */
    Titik initPoint;
    Titik endPoint;
    static int counterGaris;

    /* BEHAVIOR */
    
    //Konstruktur
    Garis(){
        initPoint = new Titik(0.0,0.0);
        endPoint = new Titik(1.0,1.0);
        counterGaris++;
    }

    Garis(Titik T1, Titik T2){
        this.initPoint = T1;
        this.endPoint = T2;
        counterGaris++;
    }

    //Selector

    int getCounterGaris(){
        return counterGaris;
    }

    Titik getInitialPoint(){
        return initPoint;
    }

    Titik getEndingPoint(){
        return endPoint;
    }

    //Mutator

    void setInitPoint(Titik T){
        initPoint = T;
    }

    void setEndPoint(Titik T){
        endPoint = T;
    }

    //Method Lain

    double panjangGaris(){
        return Math.sqrt(
            Math.pow(initPoint.absis - endPoint.absis,2) + 
            Math.pow(initPoint.ordinat - endPoint.ordinat,2));
    }

    double gradien(){ 
        if (initPoint.absis == endPoint.absis){
            return Double.POSITIVE_INFINITY; // Perumpamaan Gradien Vertikal
        } else { // Tidak membagi 0
            return  (endPoint.ordinat - initPoint.ordinat) / (endPoint.absis - initPoint.absis);
        }
    }

    Titik midTitik(){
        return new Titik(
            (endPoint.getAbsis() + initPoint.getAbsis())/2, 
            (endPoint.getOrdinat() + initPoint.getOrdinat())/2);
    }

    boolean isSejajar(Garis G){
        return this.gradien() == G.gradien();
    }

    boolean isTegakLurus(Garis G){
        if (
            (this.gradien() == 0 && G.gradien() == Double.POSITIVE_INFINITY) ||
            (this.gradien() == Double.POSITIVE_INFINITY && G.gradien() == 0)){
                return true;
        } else {
            return this.gradien() * G.gradien() == -1;
        }
    }

    void printGaris(){
        System.out.println("Initial Point: (" + initPoint.getAbsis() + ", " + initPoint.getOrdinat() + ") | End Point: (" + endPoint.getAbsis() + ", " + endPoint.getOrdinat() + ")");
    }

    void printPersGaris(){
        double m = this.gradien();
        if (m == Double.POSITIVE_INFINITY){
            System.out.println("x = " + endPoint.getAbsis());
        } else {
            double c = endPoint.getOrdinat() + m * endPoint.getAbsis();
            System.out.println("y = " + m + "x + (" + c + ")");
        }
    }
}
