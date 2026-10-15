public class PatientMain_Q7 {
    public static void main(String[] args) {
        Patient patient = new Patient("Anaya", 25, 58.5);
        patient.setAge(26); patient.setAge(-4); // Invalid age is rejected
        patient.setWeight(60.0); patient.setWeight(0); // Invalid weight is rejected
        patient.setPatientName("Anaya Sharma");
        patient.displayPatient();
    }
}
class Patient {
    private String patientName; private int age; private double weight;
    Patient(String patientName, int age, double weight) { this.patientName=patientName; setAge(age); setWeight(weight); }
    public String getPatientName(){return patientName;} public int getAge(){return age;} public double getWeight(){return weight;}
    public void setPatientName(String patientName){this.patientName=patientName;}
    public void setAge(int age){if(age>=0)this.age=age;else System.out.println("Rejected invalid age: "+age);}
    public void setWeight(double weight){if(weight>0)this.weight=weight;else System.out.println("Rejected invalid weight: "+weight);}
    void displayPatient(){System.out.println("Name: "+patientName+", Age: "+age+", Weight: "+weight+" kg");}
}
