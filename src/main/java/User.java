public class User {
    private int id;
    private String username;
    private String email;
    private String password;
    private Role role;

    public enum Role{
        ADMIN, EMPLOYEE;
    }
}
