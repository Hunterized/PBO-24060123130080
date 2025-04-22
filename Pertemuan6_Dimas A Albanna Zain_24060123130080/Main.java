import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Anabul kucing1 = new Kucing("Akmal", "Tabby");
        Anabul anjing1 = new Anjing("Ellio", "Malamute");
        Anabul burung1 = new Burung("Kat", "Love Bird");
        Anabul kucing2 = new Kucing("Abi", "Void");
        Anabul anjing2 = new Anjing("Baron", "German Shepherd");
        Anabul burung2 = new Burung("Spencer", "Beo");

        ArrayList<Anabul> Hewan = new ArrayList<>();
        Hewan.add(burung2);     
        Hewan.add(anjing2);
        Hewan.add(kucing2);
        Hewan.add(burung1);
        Hewan.add(anjing1);
        Hewan.add(kucing1);

        for (Anabul h : Hewan){
            h.gerak();
            h.bersuara();
            System.out.println("");
        }
    }
}
