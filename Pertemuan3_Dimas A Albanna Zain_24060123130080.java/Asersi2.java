/*  DIMAS A ALBANNA ZAIN
    24060123130080
    4 Maret 2025
*/

class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double Keliling = 2*Math.PI*jariJari;
        return Keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args){
        double jariJari = -1;
        assert(jariJari > 0): "Jari Jari tidak boleh nol!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling Lingkaran = " + kelilingLingkaran);
    }
}

/*  
    Secara Konsep, apa yang kurang tepat dari kode asersi diatas?

    

 */