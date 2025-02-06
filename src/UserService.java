public class UserService {
    public void add(User user) {
        System.out.println(user.getUsername()+" elave edildi");
    }
    public void update(User user, String newUsername, String newPassword) {
        user.setUsername(newUsername);
        user.setPassword(newPassword);
        System.out.println("User yenilendi: " + newUsername);
    }

    public void delete(User user) {
        System.out.println("User silindi: " + user.getUsername());
    }
}
