public class DefaultAccessMain {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();
        pharmacy.medicineName = "Amoxicillin"; // Default/package-private member
        pharmacy.price = 65.0;
        pharmacy.displayMedicine();
    }
}
class Pharmacy {
    String medicineName; // Default/package-private access
    double price;        // Default/package-private access
    Pharmacy(){medicineName="Basic Medicine";price=10.0;} // Default constructor
    void displayMedicine(){System.out.println("Medicine: "+medicineName+", Price: Rs."+price);} // Default method
}
