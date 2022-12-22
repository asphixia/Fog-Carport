package dat.backend.model.entities;

public class Materialer {

    private int materialeId;
    private String name;
    private String unit;
    private int price_per_unit;

    public Materialer(int materialeId, String name, String unit, int price_per_unit) {
        this.materialeId = materialeId;
        this.name = name;
        this.unit = unit;
        this.price_per_unit = price_per_unit;
    }

    public Materialer(String name, String unit, int price_per_unit) {
        this.name = name;
        this.unit = unit;
        this.price_per_unit = price_per_unit;
    }

    public Materialer() {

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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getPrice_per_unit() {
        return price_per_unit;
    }

    public void setPrice_per_unit(int price_per_unit) {
        this.price_per_unit = price_per_unit;
    }

    @Override
    public String toString() {
        return "Materialer{" +
                "materialeId=" + materialeId +
                ", name='" + name + '\'' +
                ", unit='" + unit + '\'' +
                ", price_per_unit=" + price_per_unit +
                '}';
    }
}
