package dat.backend.model;

import java.time.LocalDateTime;

public class Order {
    private int ordre_id;
    private String username;
    private int total_price;
    private int produkt_id;
    private LocalDateTime ordredate;
    private int længde;
    private int bredde;
    private int skur_længde;
    private int skur_bredde;
    private int status_id;

    public Order(int ordre_id, String username, int total_price, int produkt_id, LocalDateTime ordredate, int længde, int bredde, int skur_længde, int skur_bredde, int status_id) {
        this.ordre_id = ordre_id;
        this.username = username;
        this.total_price = total_price;
        this.produkt_id = produkt_id;
        this.ordredate = ordredate;
        this.længde = længde;
        this.bredde = bredde;
        this.skur_længde = skur_længde;
        this.skur_bredde = skur_bredde;
        this.status_id = status_id;
    }

    public int getOrdre_id() {
        return ordre_id;
    }

    public void setOrdre_id(int ordre_id) {
        this.ordre_id = ordre_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getTotal_price() {
        return total_price;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }

    public int getProdukt_id() {
        return produkt_id;
    }

    public void setProdukt_id(int produkt_id) {
        this.produkt_id = produkt_id;
    }

    public LocalDateTime getOrdredate() {
        return ordredate;
    }

    public void setOrdredate(LocalDateTime ordredate) {
        this.ordredate = ordredate;
    }

    public int getLængde() {
        return længde;
    }

    public void setLængde(int længde) {
        this.længde = længde;
    }

    public int getBredde() {
        return bredde;
    }

    public void setBredde(int bredde) {
        this.bredde = bredde;
    }

    public int getSkur_længde() {
        return skur_længde;
    }

    public void setSkur_længde(int skur_længde) {
        this.skur_længde = skur_længde;
    }

    public int getSkur_bredde() {
        return skur_bredde;
    }

    public void setSkur_bredde(int skur_bredde) {
        this.skur_bredde = skur_bredde;
    }

    public int getStatus_id() {
        return status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }
}


