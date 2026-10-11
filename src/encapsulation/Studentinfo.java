package encapsulation;

public class Studentinfo {
    private String name;
    private String cgpa;
    private int age;
    private String matric;
    private String lvl;

    public void setInfo(String newName, String newCgpa, String newMatric, String newLvl, int newAge) {
        this.name = newName;
        this.cgpa = newCgpa;
        this.age = newAge;
        this.matric = newMatric;
        this.lvl = newLvl;
    }

    public void getInfo() {
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Matric: " + matric);
        System.out.println("Level: " + lvl);
        System.out.println("Age: " + age);
    }

}
