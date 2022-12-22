package dat.backend.model.entities;

public class Item
{
    int stykList_id;
    int ordre_id;
    Materialer materialer;
    int quantity;
    int item_price;
    String description;
    int length;


    public Item(int stykList_id, int ordre_id, Materialer materialer, int quantity, int item_price, String description) {
        this.stykList_id = stykList_id;
        this.ordre_id = ordre_id;
        this.materialer = materialer;
        this.quantity = quantity;
        this.item_price = item_price;
        this.description = description;
    }

    public Item(int quantity, int length) {
        this.quantity = quantity;
        this.length = length;
    }

    public int getStykList_id() {
        return stykList_id;
    }

    public void setStykList_id(int stykList_id) {
        this.stykList_id = stykList_id;
    }

    public int getOrdre_id() {
        return ordre_id;
    }

    public void setOrdre_id(int ordre_id) {
        this.ordre_id = ordre_id;
    }

    public Materialer getMaterialer() {
        return materialer;
    }

    public void setMaterialer(Materialer materialer) {
        this.materialer = materialer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getItem_price() {
        return item_price;
    }

    public void setItem_price(int item_price) {
        this.item_price = item_price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
