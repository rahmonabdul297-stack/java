package encapsulation;

public class Main {
    public static void main(String[] args) {
        Studentinfo s1Info = new Studentinfo();
        s1Info.setInfo("Abdulrahmon", "3.98", "F/ND/25/3210076", "ND2", 20);
        Studentinfo s2Info = new Studentinfo();
        s2Info.setInfo("Toheeb", "3.98", "F/ND/25/3210096", "ND2", 20);

        s1Info.getInfo();
        s2Info.getInfo();
    }
}
