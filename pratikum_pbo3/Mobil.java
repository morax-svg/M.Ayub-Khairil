// Mobil.java
public class Mobil {
    private String merk;
    private String model;
    private int tahun;
    private String warna;

    // Constructor
    public Mobil(String merk, String model, int tahun, String warna) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
    }

    // Getter
    public String getMerk() {
        return merk;
    }

    public String getModel() {
        return model;
    }

    public int getTahun() {
        return tahun;
    }

    public String getWarna() {
        return warna;
    }

    // Setter
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Method displayInfo
    public void displayInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
        System.out.println("Tahun: " + tahun);
        System.out.println("Warna: " + warna);
    }

    // Method startEngine
    public void startEngine() {
        System.out.println("Mesin mobil " + merk + " menyala");
    }

    // Method untuk mengubah warna
    public void ubahWarna(String warnaBaru) {
        this.warna = warnaBaru;
        System.out.println("Warna mobil diubah menjadi " + warnaBaru);
    }
}
