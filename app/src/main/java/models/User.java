package models;

import java.util.HashMap;
import java.util.Map;

public class User {
    private String username, password;

    public User() {}

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("username", this.username);
        map.put("password", this.password);
        return map;
    }

    public boolean isValidUser() {
        return !this.username.isEmpty() && !this.password.isEmpty();
    }

    public boolean isEqual(User user) {
        boolean usernameEqual = user.getUsername().compareTo(this.getUsername()) == 0;
        boolean passwordEqual = user.getPassword().compareTo(this.getPassword()) == 0;
        return usernameEqual && passwordEqual;
    }
}
