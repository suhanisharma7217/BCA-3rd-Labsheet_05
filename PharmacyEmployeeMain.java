public class PharmacyEmployeeMain {
    public static void main(String[] args) {
        Employee[] employees = {
            new Pharmacist(301, "Nisha Gupta", 38000, "LIC-901"),
            new StoreManager(302, "Rahul Mehta", 52000, 4),
            new Pharmacist(303, "Farhan Ali", 40000, "LIC-902")
        };
        PharmacyEmployeeManager manager = new PharmacyEmployeeManager();
        manager.processEmployees(employees);
        System.out.println("Employee count: " + Employee.getEmployeeCount());
    }
}
class Employee {
    private int employeeId; private String employeeName; private double salary;
    static int employeeCount=0; // Default-access class variable
    protected String department; // Protected member shared with child classes
    Employee(int employeeId,String employeeName,double salary){this.employeeId=employeeId;this.employeeName=employeeName;setSalary(salary);employeeCount++;department="Pharmacy";}
    public int getEmployeeId(){return employeeId;} public String getEmployeeName(){return employeeName;} public double getSalary(){return salary;} public static int getEmployeeCount(){return employeeCount;}
    public void setEmployeeId(int employeeId){this.employeeId=employeeId;} public void setEmployeeName(String employeeName){this.employeeName=employeeName;}
    public void setSalary(double salary){if(salary>=0)this.salary=salary;else System.out.println("Rejected negative salary for "+employeeName);}
    void displayBasic(){System.out.println("ID: "+employeeId+", Name: "+employeeName+", Salary: Rs."+salary+", Department: "+department);}
    String role(){return "Employee";}
}
class Pharmacist extends Employee {
    private String licenseNo;
    Pharmacist(int employeeId,String employeeName,double salary,String licenseNo){super(employeeId,employeeName,salary);this.licenseNo=licenseNo;}
    void displayDetails(){displayBasic();System.out.println("Role: Pharmacist, License: "+licenseNo);}
    @Override String role(){return "Pharmacist";}
}
class StoreManager extends Employee {
    private int storeSection;
    StoreManager(int employeeId,String employeeName,double salary,int storeSection){super(employeeId,employeeName,salary);this.storeSection=storeSection;}
    void displayDetails(){displayBasic();System.out.println("Role: Store Manager, Section: "+storeSection);}
    @Override String role(){return "Store Manager";}
}
class PharmacyEmployeeManager {
    void processEmployees(Employee[] employees){
        double totalSalary=0; // Local variable for processing
        int i;
        for(i=0;i<employees.length;i++){
            if(employees[i].getSalary()>=0){
                if(employees[i] instanceof Pharmacist)((Pharmacist)employees[i]).displayDetails();
                else if(employees[i] instanceof StoreManager)((StoreManager)employees[i]).displayDetails();
                totalSalary+=employees[i].getSalary();
            }
        }
        System.out.println("Total salary: Rs."+totalSalary);
    }
}
