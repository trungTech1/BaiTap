package BaiTap14;

public class Student {
    int id;
    String name;
    double score;
    public Student() {
    }
    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getScore() {
        return score;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setScore(double score) {
        this.score = score;
    }
}
