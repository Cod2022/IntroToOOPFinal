package models;

public class User {
    private Role role;
    private int balance; 
    private byte films;
    private String name;
    // balance < cost -> фильм не выдаётся
    // можно брать не более 5 фильмов одновременно

    

    

    public User(String name, Role role, int balance, byte films) {
        this.name = name;
        this.role = role;
        this.balance = balance;
        this.films = films;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public int getBalance() {
        return balance;
    }

    public byte getFilms() {
        return films;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setFilms(byte films) {
        this.films = films;
    }

    

}
