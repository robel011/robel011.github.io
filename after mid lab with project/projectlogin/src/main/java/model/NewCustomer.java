package model;

public class NewCustomer {
    private String fullName;
    private int age;
    private String username;
    private String password;

    public NewCustomer() {
    }

    public NewCustomer(String fullName, int age, String username, String password) {
        this.fullName = fullName;
        this.age = age;
        this.username = username;
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
