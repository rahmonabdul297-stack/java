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
        System.out.println("Student with Matric number " + matric + " Information");
        System.out.println("Name: " + name);
        System.out.println("Matric: " + matric);
        System.out.println("Department: " + department);
        System.out.println("Level: " + lvl);
        System.out.println("CGPA: " + cgpa);
    }
    public static void main(String[] args) {
        Student student1 = new Student("Abdulrahmon",
                "F/ND/25/3210076",
                "Computer Science",
                "ND1",
                3.98);
        Student student2 = new Student("Abdullah",
                "F/ND/25/3210158",
                "Computer Science",
                "ND1",
                3.98);
        Student student3 = new Student("Toheeb",
                "F/ND/25/3210096",
                "Computer Science",
                "ND1",
                3.98);

        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();
    }

}
