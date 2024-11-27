package hw03.ex01;

public abstract class User {
    private String id;
    private String firstName;
    private String lastName;

    public User(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public abstract void login();
}

