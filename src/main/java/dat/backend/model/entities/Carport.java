package dat.backend.model.entities;

public class Carport {

    private int width;
    private int lenght;
    private int r_width;
    private int r_lenght;

    public Carport(int width, int lenght, int r_width, int r_lenght) {
        this.width = width;
        this.lenght = lenght;
        this.r_width = r_width;
        this.r_lenght = r_lenght;
    }

    public int getWidth() {
        return width;
    }

    public int getLenght() {
        return lenght;
    }

    public int getR_width() {
        return r_width;
    }

    public int getR_lenght() {
        return r_lenght;
    }
}

