public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.displayDetails();
    }
}

class Student {
    String name;
    int rollNo;
    double marks;

    Student() { name = "Aarav"; rollNo = 101; marks = 87.5; }
    void displayDetails() {
        System.out.println("Name: " + name + "\nRoll No: " + rollNo + "\nMarks: " + marks);
    }
}
