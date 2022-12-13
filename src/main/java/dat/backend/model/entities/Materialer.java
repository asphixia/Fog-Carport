package dat.backend.model.entities;

public class Materialer {
    private int materialeId;
    private String name;
    private int length;
    private int height;
    private int width;
    private int price;
    private int quantity;
    private int typeId;

    public Materialer(int materialeId, String name, int length, int height, int width, int price, int quantity, int typeId) {
        this.materialeId = materialeId;
        this.name = name;
        this.length = length;
        this.height = height;
        this.width = width;
        this.price = price;
        this.quantity = quantity;
        this.typeId = typeId;
    }

    public int getMaterialeId() {
        return materialeId;
    }

    public void setMaterialeId(int materialeId) {
        this.materialeId = materialeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    @Override
    public String toString() {
        return "Materialer{" +
                "materialeId=" + materialeId +
                ", name='" + name + '\'' +
                ", length=" + length +
                ", height=" + height +
                ", width=" + width +
                ", price=" + price +
                ", quantity=" + quantity +
                ", typeId=" + typeId +
                '}';
    }
}
