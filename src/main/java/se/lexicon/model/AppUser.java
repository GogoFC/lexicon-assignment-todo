package se.lexicon.model;

public class AppUser {

    private String username;

    private String password;

    private AppRole role;

    public AppUser(String username, String password, AppRole role) {
        setUsername(username);
        setPassword(password);
        setRole(role);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username.isBlank()) throw new IllegalArgumentException("Username can not be empty");
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.isBlank()) throw new IllegalArgumentException("Password can not be empty");
        this.password = password;
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        if (role == null) throw new IllegalArgumentException("Role can not be null");
        this.role = role;
    }
}
