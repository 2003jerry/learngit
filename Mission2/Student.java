package Mission2;

public class Student {
    private String sNO;
    private String sName;
    private String sSex;
    private String sAge;
    private String sJava;

    public Student(String sNO, String sName, String sSex, String sAge, String sJava) {
        this.sNO = sNO;
        this.sName = sName;
        this.sSex = sSex;
        this.sAge = sAge;
        this.sJava = sJava;
    }

    public String getsNO() {
        return sNO;
    }

    public String getsName() {
        return sName;
    }

    public String getsSex() {
        return sSex;
    }

    public String getsAge() {
        return sAge;
    }

    public String getsJava() {
        return sJava;
    }
}
