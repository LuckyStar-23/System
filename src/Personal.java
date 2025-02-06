public class Personal extends User {
private String job;
private int workinghours;

public Personal(int id, String username, String password, String job, int workinghours) {
    super (id, username, password);
    this.job=job;
    this.workinghours=workinghours;
}
public String getJob() { return job; }
public void setJob(String job) { this.job=job; }
public int getWorkinghours() { return workinghours; }
public void setWorkinghours(int workinghours) { this.workinghours=workinghours; }
}
