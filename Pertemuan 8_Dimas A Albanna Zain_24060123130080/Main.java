public class Main {
    public static void main(String[] args) {
        Anabul kucing1 = new Kucing("Akmal", "Tabby");
        Anabul anjing1 = new Anjing("Ellio", "Malamute");
        Anabul burung1 = new Burung("Kat", "Love Bird");
        Anabul kucing2 = new Kucing("Abi", "Void");
        Anabul anjing2 = new Anjing("Baron", "German Shepherd");
        Anabul burung2 = new Burung("Spencer", "Beo");
        
        Koleksi AnabulList = new Koleksi(10);
        AnabulList.add(kucing1);
        AnabulList.add(anjing1);
        AnabulList.add(burung1);
        AnabulList.add(kucing2);
        AnabulList.add(anjing2);
        AnabulList.add(burung2);

        System.out.println("Print All:");
        AnabulList.showAll();
        
        System.out.println("");
        AnabulList.delete("Kat");

        System.out.println("\nPrint All:");
        AnabulList.showAll();
    }
}
