public class HospitalStaffMain {
    public static void main(String[] args) {
        Employee[] staff = {
            new Doctor("Dr. Sana", 40, 2001, 85000, "Pediatrics"),
            new Pharmacist("Amit Jain", 31, 2002, 42000, "PH-221")
        };
        new StaffManager().displayStaff(staff);
        System.out.println("Total employee objects: " + Employee.getEmployeeCount());
    }
}
class Person {
    protected String name; protected int age;
    Person(String name,int age){this.name=name;this.age=age;}
}
class Employee extends Person {
    private int employeeId; private double salary;
    private static int employeeCount=0;
    Employee(String name,int age,int employeeId,double salary){super(name,age);this.employeeId=employeeId;setSalary(salary);employeeCount++;}
    public int getEmployeeId(){return employeeId;} public double getSalary(){return salary;} public void setSalary(double salary){if(salary>=0)this.salary=salary;}
    public String getName(){return name;} public int getAge(){return age;} public static int getEmployeeCount(){return employeeCount;}
    void displayEmployee(){System.out.println("ID: "+employeeId+", Name: "+name+", Age: "+age+", Salary: Rs."+salary);}
}
class Doctor extends Employee {
    private String specialization;
    Doctor(String name,int age,int employeeId,double salary,String specialization){super(name,age,employeeId,salary);this.specialization=specialization;}
    void displayRole(){displayEmployee();System.out.println("Role: Doctor, Specialization: "+specialization);}
}
class Pharmacist extends Employee {
    private String licenseNo;
    Pharmacist(String name,int age,int employeeId,double salary,String licenseNo){super(name,age,employeeId,salary);this.licenseNo=licenseNo;}
    void displayRole(){displayEmployee();System.out.println("Role: Pharmacist, License: "+licenseNo);}
}
class StaffManager {
    void displayStaff(Employee[] staff){for(int i=0;i<staff.length;i++){if(staff[i] instanceof Doctor)((Doctor)staff[i]).displayRole();else if(staff[i] instanceof Pharmacist)((Pharmacist)staff[i]).displayRole();}}
}
