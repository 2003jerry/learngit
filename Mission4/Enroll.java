package Mission4;

public class Enroll {
    public static void main(String[] args) {
        School.setScoreLine(350);
        Enroll Enroll = new Enroll();
        Student huh = new Student("huh", "123", 100, 22);
        if(isEnroll(huh)){
            System.out.println("被录取");
        }else{
            System.out.println("很抱歉没有被录取");
        }
    }
    static  boolean isEnroll(Student s){

        float line=School.getScoreLine();
        if(!((s.getScore()>96&&s.getComScore()>300)||s.getComScore()>line)){
            return false;
        }
        return true;
    };
}
