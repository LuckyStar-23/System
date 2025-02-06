public class Student extends User {
    private double scholarship;
    private double score;
    private String group;

    public Student(int id, String username, String password, double scholarship, double score, String group) {
        super(id, username, password);
        this.scholarship = scholarship;
        this.score = score;
        this.group = group;
    }
    public double getScholarship(){ return scholarship; }
    public void setScholarship( double scholarship) { this.scholarship=scholarship; }
    public double getScore() { return score; }
    public void setScore(double score) { this.score=score; }
    public String getGroup() { return group; }
    public void setGroup(String group) { this.group=group; }
}
