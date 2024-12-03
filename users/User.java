// users/User.java
package users;

public class User {
    private String username;
    private String password;
    protected String role;

    public User() {
        this.username = "guest";
        this.password = "guest";
        this.role = "guest";
    }

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }
}