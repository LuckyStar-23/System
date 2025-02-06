//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Leyla", "1233", 142.99, 523.2, "1163" );
        Teacher teacher = new Teacher(2, "Ali", "5665", 3000, "IT");
        Personal personal = new Personal(3, "Ayten", "6363", "guard", 8);

        User[] users = { student,teacher,personal};
        UserService userService = new UserService();

        for(User user : users ) { userService.add(user); }
        userService.update(student, "Leyla Updated", "9999");
        userService.delete(teacher);
    }
}