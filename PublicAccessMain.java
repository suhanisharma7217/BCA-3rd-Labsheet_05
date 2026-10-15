public class PublicAccessMain {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.hospitalName = "City Hospital"; // Public members are accessible directly
        hospital.hospitalCode = "CH101";
        hospital.displayHospital();
    }
}
class Hospital {
    public String hospitalName, hospitalCode;
    public Hospital() { hospitalName="General Hospital"; hospitalCode="GH001"; }
    public void displayHospital(){System.out.println("Hospital: "+hospitalName+", Code: "+hospitalCode);}
}
