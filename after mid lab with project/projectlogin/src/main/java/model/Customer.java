package model;


public class Customer {

//    private int id;
//    private String fullName;
//    private int age;
    private String username;
    private String password;

    public Customer(){

    }
    public Customer(String username, String password){
        this.username=username;
        this.password=password;
    }

//    public Customer(int id,String fullName, int age, String username, String password) {
//        this.id=id;
//        this.fullName = fullName;
//        this.age=age;
//        this.username = username;
//        this.password = password;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getFullName() {
//        return fullName;
//    }
//
//    public void setFullName(String fullName) {
//        this.fullName = fullName;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age=age;
//    }

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
