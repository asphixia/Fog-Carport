package dat.backend.model.entities;

import java.util.Objects;

public class User
{
    private String username;
    private String password;
    private String role;
    private String name;
    private String adresse;
    private String email;
    private int tlfNmr;



    public User(String username, String password, String role, String name, String adresse,String email, int tlfNmr)
    {
        this.username = username;
        this.password = password;
        this.role = role;
        this.name = name;
        this.adresse = adresse;
        this.email = email;
        this.tlfNmr = tlfNmr;

    }


    public String getUsername()
    {
        return username;
    }

    public void setUsername(String email)
    {
        this.username = email;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse(){
        return adresse;
    }

    public void setAddress(String adresse){
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        return getUsername().equals(user.getUsername()) && getPassword().equals(user.getPassword()) &&
                getRole().equals(user.getRole());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getUsername(), getPassword(), getRole(), getName(), getAdresse(), getEmail(), getTlfNmr());
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", address='" + adresse + '\'' +
                ", email='" + email + '\'' +
                ", tlfNmr=" + tlfNmr +
                '}';
    }
}
