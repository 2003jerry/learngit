package Mission4;

public class Student {
    private String name;
    private String id;
    private float comScore;
    private float score;

    public Student(String name, String id, float comScore, float score) {
        this.name = name;
        this.id = id;
        this.comScore = comScore;
        this.score = score;
    }

    public float getComScore() {
        return comScore;
    }

    public float getScore() {
        return score;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", comScore=" + comScore +
                ", score=" + score
                ;
    }
    public void print(){
        System.out.println(this.toString());
    }

   /* public static void main(String[] args) {
        Student student = new Student("wang","123",2,2);
        student.print();
    }*/

}
