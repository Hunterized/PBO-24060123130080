/* Nama File : MTitik.java
 * Pembuat : 24060123130080 | Dimas A Albanna Zain
 * Deskripsi : Aplikasi Method class titik
 * Tanggal : Selasa, 18 Feb 2025
 */

public class MTitik {
    public static void main(String[] args) {
        System.out.println("==========Membuat Objek Titik==========");

        // Membuat titik T1
        System.out.println("Titik T1:");
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 2);
        T1.printTitik();

        //Membuat Titik T2
        Titik T2 = new Titik(-7, -8);
        T2.printTitik();

        //Aplikasi Method Lain
        System.out.println("Kuadran Titik 1: " + T1.getKuadran());
        System.out.println("Kuadran Titik 2: " + T2.getKuadran());

        System.out.println("Jarak titik 1 ke origin: " + T1.getJarakPusat());
        System.out.println("Jarak Titik 1 ke Titik 2: " + T1.getJarak(T2));

        T1.refleksiX();
        T2.refleksiY();
        System.out.println("Titik 1: ");
        T1.printTitik();
        System.out.println("Titik 2: ");
        T2.printTitik();

        Titik T3;
        T3 = T1.getRefleksiY();
        System.out.println("Titik 3: ");
        T3.printTitik();

        Titik T4;
        T4 = T2.getRefleksiX();
        System.out.println("Titik 4: ");
        T4.printTitik();
        T4.printCounterTitik();
    }
}
