public class SingleInheritanceMain {
    public static void main(String[] args) {
        Pharmacist pharmacist = new Pharmacist(801, "Karan Shah", 38000, "PH-9981");
        pharmacist.displayPharmacist();
    }
}
class Employee { // Super class
    protected int employeeId; protected String employeeName; protected double salary;
    Employee(int employeeId, String employeeName, double salary){this.employeeId=employeeId;this.employeeName=employeeName;this.salary=salary;}
    void displayEmployee(){System.out.println("Employee ID: "+employeeId+", Name: "+employeeName+", Salary: Rs."+salary);}
}
class Pharmacist extends Employee { // Child class
    private String licenseNo;
    Pharmacist(int employeeId,String employeeName,double salary,String licenseNo){super(employeeId,employeeName,salary);this.licenseNo=licenseNo;}
    void displayPharmacist(){displayEmployee();System.out.println("License No: "+licenseNo);}
}
