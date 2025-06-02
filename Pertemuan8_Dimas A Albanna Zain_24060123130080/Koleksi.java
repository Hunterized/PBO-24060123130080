public class Koleksi {
    private int nbElmt;
    private Anabul[] wadah;

    // Knnstruktor
    public Koleksi(int i) {
        wadah = new Anabul[i];
        nbElmt = 0;
    }

    // Initialization
    public Anabul[] getWadah() {
        return wadah;
    }

    public void setWadah(Anabul[] wadah) {
        this.wadah = wadah;
    }

    // Method
    public Anabul getIsi(int i){
        return wadah[i];
    }
    
    public int getSize() {
        return nbElmt;
    }

    public void setIsi(int i, Anabul Hewan){
        wadah[i] = Hewan;
    }

    public void setSize(int size){
        nbElmt = size;
    }

    public void add(Anabul Isi){
        if (getSize() <= wadah.length) {
            setIsi(getSize(), Isi);
            setSize(getSize() + 1);
        }
    }

    public void delete(String Nama){
        int index = -1;
        for (int i = 0; i < getSize(); i++) {
            if (wadah[i] == null ? Nama == null : wadah[i].getNama().equals(Nama)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < getSize() - 1; i++) {
                wadah[i] = wadah[i + 1];
            }
            System.out.println("Anabul Deleted: " + Nama);
            setSize(getSize() - 1);
        } else {
            System.out.println("Failed!");
        }
    }

    public void showAll() {
        for (int i = 0; i < getSize(); i++) {
            Anabul A = wadah[i];
            A.gerak();
            A.bersuara();
        }
    }
}