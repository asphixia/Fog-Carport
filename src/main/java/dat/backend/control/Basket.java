package dat.backend.control;

public class Basket
{
    int carportwidth;
    int carportlenght;
    int shedwidth;
    int shedlenght;
    String firstname;
    String Lastname;
    String adresse;
    int postcode;
    String city;
    int phone;
    String email;

    public Basket(int carportwidth, int carportlenght, int shedwidth, int shedlenght, String firstname, String lastname, String adresse, int postcode, String city, int phone, String email) {
        this.carportwidth = carportwidth;
        this.carportlenght = carportlenght;
        this.shedwidth = shedwidth;
        this.shedlenght = shedlenght;
        this.firstname = firstname;
        Lastname = lastname;
        this.adresse = adresse;
        this.postcode = postcode;
        this.city = city;
        this.phone = phone;
        this.email = email;
    }

    public int getCarportwidth() {
        return carportwidth;
    }

    public int getCarportlenght() {
        return carportlenght;
    }

    public int getShedwidth() {
        return shedwidth;
    }

    public int getShedlenght() {
        return shedlenght;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getPostcode() {
        return postcode;
    }

    public String getCity() {
        return city;
    }

    public int getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "carportwidth=" + carportwidth +
                ", carportlenght=" + carportlenght +
                ", shedwidth=" + shedwidth +
                ", shedlenght=" + shedlenght +
                ", firstname='" + firstname + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", adresse='" + adresse + '\'' +
                ", postcode=" + postcode +
                ", city='" + city + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}
