public class MedicineMain {
    public static void main(String[] args) {
        Medicine m1 = new Medicine("Paracetamol", "PCM101", 25.50);
        Medicine m2 = new Medicine("Cetirizine", "CTZ202", 18.00);
        m1.displayMedicine();
        m2.displayMedicine();
    }
}
class Medicine {
    String medicineName, batchNo;
    double price;
    Medicine(String medicineName, String batchNo, double price) {
        this.medicineName = medicineName; this.batchNo = batchNo; this.price = price;
    }
    void displayMedicine() { System.out.println(medicineName + " | Batch: " + batchNo + " | Price: Rs." + price); }
}
