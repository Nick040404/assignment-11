// users/Admin.java
package users;

public class Admin extends User {

    public Admin() {
        super("admin", "admin123", "admin");
    }

    public Admin(String username, String password) {
        super(username, password, "admin");
    }

    public void manageSystem() {
        System.out.println("Admin managing system.");
    }
}
