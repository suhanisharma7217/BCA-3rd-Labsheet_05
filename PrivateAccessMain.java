public class PrivateAccessMain {
    public static void main(String[] args) {
        Employee employee = new Employee(501, "Neha Verma", 42000);
        employee.displayEmployee();
        System.out.println("Salary via getter: Rs." + employee.getSalary());
        // System.out.println(employee.salary); // Not allowed: salary is private.
    }
}
class Employee {
    private int employeeId; private String employeeName; private double salary;
    Employee(int employeeId, String employeeName, double salary){this.employeeId=employeeId;this.employeeName=employeeName;this.salary=salary;}
    public int getEmployeeId(){return employeeId;} public String getEmployeeName(){return employeeName;} public double getSalary(){return salary;}
    public void displayEmployee(){System.out.println("ID: "+getEmployeeId()+", Name: "+getEmployeeName()+", Salary: Rs."+getSalary());}
}
