public class User {
    private String username;
    private String email;
    private String password;
    private boolean isLoggedIn;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.isLoggedIn = false;
    }

    public void login(String enteredPassword) {
        if (enteredPassword.equals(password)) {
            isLoggedIn = true;
            System.out.println("Login successful!");
        } else {
            System.out.println("Incorrect password. Please try again.");
        }
    }

    public void logout() {
        isLoggedIn = false;
        System.out.println("Logged out successfully.");
    }

    public void changePassword(String newPassword) {
        password = newPassword;
        System.out.println("Password changed successfully.");
    }

    public static void main(String[] args) {
        User user1 = new User("john_doe", "john@example.com", "password123");
        System.out.println("User: " + user1.username);
        System.out.println("Email: " + user1.email);
        user1.login("password123");
        user1.changePassword("newpassword456");
        user1.logout();
    }
}
