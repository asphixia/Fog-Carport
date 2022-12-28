package dat.backend.model.entities;

import java.sql.Timestamp;

public class Carport {

    public double price;
    private int width;
    private int lenghte;
    private int r_width;
    private int r_lenght;

    public Carport(double price) {
        this.price = price;
    }

    public Carport(int width, int lenghte, int r_width, int r_lenght) {

        this.width = width;
        this.lenghte = lenghte;
        this.r_width = r_width;
        this.r_lenght = r_lenght;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLenghte() {
        return lenghte;
    }

    public void setLenghte(int lenghte) {
        this.lenghte = lenghte;
    }

    public int getR_width() {
        return r_width;
    }

    public void setR_width(int r_width) {
        this.r_width = r_width;
    }

    public int getR_lenght() {
        return r_lenght;
    }

    public void setR_lenght(int r_lenght) {
        this.r_lenght = r_lenght;
    }

    @Override
    public String toString() {
        return "Carport{" +
                "price=" + price +
                ", width=" + width +
                ", lenghte=" + lenghte +
                ", r_width=" + r_width +
                ", r_lenght=" + r_lenght +
                '}';
    }
}
