public class MedicineProductMain {
    public static void main(String[] args) {
        MedicineProduct product = new MedicineProduct("Paracetamol", "PCM001", 30.0);
        product.setPrice(32.5);
        System.out.println("Name via getter: " + product.getMedicineName());
        product.displayProduct();
    }
}
class MedicineProduct {
    private String medicineName, batchNo; private double price;
    MedicineProduct(String medicineName, String batchNo, double price) { this.medicineName=medicineName; this.batchNo=batchNo; this.price=price; }
    public String getMedicineName(){return medicineName;} public String getBatchNo(){return batchNo;} public double getPrice(){return price;}
    public void setMedicineName(String medicineName){this.medicineName=medicineName;} public void setBatchNo(String batchNo){this.batchNo=batchNo;} public void setPrice(double price){this.price=price;}
    void displayProduct(){System.out.println("Medicine: "+medicineName+", Batch: "+batchNo+", Price: Rs."+price);}
}
