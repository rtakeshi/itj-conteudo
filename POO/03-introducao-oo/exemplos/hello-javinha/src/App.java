import com.testing.entidades.User;

public class App {
    public static void main(String[] args) throws Exception {
        User user1 = new User(1, "Alice", "alice@abc.com");
        System.out.println(user1);
    }
}
