// Main.java
public class Main {
    public static void main(String[] args) {
        // Membuat dua objek Mobil
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2020, "Hitam");
        Mobil mobil2 = new Mobil("Honda", "Civic", 2022, "Putih");

        // Menampilkan info kedua mobil
        System.out.println("=== Info Mobil 1 ===");
        mobil1.displayInfo();
        mobil1.startEngine();

        System.out.println("\n=== Info Mobil 2 ===");
        mobil2.displayInfo();
        mobil2.startEngine();

        // Mengubah warna mobil1
        System.out.println("\n=== Mengubah Warna Mobil 1 ===");
        mobil1.ubahWarna("Merah");
        mobil1.displayInfo();
    }
}
