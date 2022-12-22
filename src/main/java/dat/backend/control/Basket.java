package dat.backend.control;

public class Basket
{
    public Object add;
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
    int width;
    int lengthe;
    int r_width;
    int r_length;

    public Basket(int width, int lengthe, int r_width, int r_length) {
        this.width = width;
        this.lengthe = lengthe;
        this.r_width = r_width;
        this.r_length = r_length;
    }

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

    public void add(Basket basket1) {
    }
}
