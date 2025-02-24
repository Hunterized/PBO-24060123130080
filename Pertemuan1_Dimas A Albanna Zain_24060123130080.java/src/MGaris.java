/* Nama File : MGaris.java
 * Pembuat : 24060123130080 | Dimas A Albanna Zain
 * Deskripsi : Aplikasi Method class garis
 * Tanggal : Kamis, 20 Feb 2025
 */

public class MGaris {
    public static void main(String[] args) {
        System.out.println("==========Membuat Objek Garis==========");

        Garis G1 = new Garis(); 
        Garis G2 = new Garis(new Titik(3,1), new Titik(9,1));

        Titik T2 = new Titik(3,5);
        G1.printGaris(); 
        G1.setInitPoint(new Titik(3, 10)); 
        G1.printGaris(); 
        G1.setEndPoint(T2);
        G1.printGaris(); 

        G2.printGaris();

        System.out.println("Panjang garis G1: " + G1.panjangGaris()); 
        System.out.println("Panjang garis G2: " + G2.panjangGaris()); 
        
        System.out.println("Gradien garis G1: " + G1.gradien()); 
        System.out.println("Gradien garis G2: " + G2.gradien()); 

        Titik T3 = G1.midTitik();
        T3.printTitik();
        System.out.println("Apakah garis G1 dan G2 sejajar? : " + G1.isSejajar(G2));
        System.out.println("Apakah garis G1 dan G2 saling Tegak Lurus? : " + G1.isTegakLurus(G2)); 
        G1.printPersGaris();
        System.out.println("Jumlah total Garis: " + G1.getCounterGaris());
    }
}
