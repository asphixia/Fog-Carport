package dat.backend.model.entities;

import java.util.Objects;

public class User
{
    private String email;
    private String password;
    private String role;
    private int balance;
    private String address;
    private int tlfNmr;



    public User(String email, String password, String role, int balance, String address, int tlfNmr)
    {
        this.email = email;
        this.password = password;
        this.role = role;
        this.balance = balance;
        this.address = address;
        this.tlfNmr = tlfNmr;

    }


    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getRole()
    {
        return role;
    }

    public void setRole(String role)
    {
        this.role = role;
    }

    public int getBalance(){
        return balance;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public int getTlfNmr(){
        return tlfNmr;
    }
    public void setTlfNmr(int tlfNmr){
        this.tlfNmr = tlfNmr;
    }


    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getEmail().equals(user.getEmail()) && getPassword().equals(user.getPassword()) &&
                getRole().equals(user.getRole());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getEmail(), getPassword(), getRole(), getBalance(), getAddress(), getTlfNmr());
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", balance=" + balance +
                ", address='" + address + '\'' +
                ", tlfNmr=" + tlfNmr +
                '}';
    }
}
