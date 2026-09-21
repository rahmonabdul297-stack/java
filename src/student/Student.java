package student;
public class Student {
    String name;
    String matric;
    String department;
    String lvl;
    double cgpa;
    Student(String name, String matric, String department, String lvl, double cgpa) {
        this.name = name;
        this.matric = matric;
        this.department = department;
        this.lvl = lvl;
        this.cgpa = cgpa;
    }
    // display student info
    public void displayStudentInfo() {
        System.out.println("\n\n\tStudent with Matric number " + matric + " Information");
        System.out.println("Name: " + name);
        System.out.println("Matric: " + matric);
        System.out.println("Department: " + department);
        System.out.println("Level: " + lvl);
        System.out.println("CGPA: " + cgpa);
    }
   

}
