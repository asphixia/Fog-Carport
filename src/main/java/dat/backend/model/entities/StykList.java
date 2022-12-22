package dat.backend.model.entities;

import dat.backend.control.MaterialeMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StykList {
    List<Item> stykListe = new ArrayList<>();

    public void addItem(Item item) {
        stykListe.add(item);
    }


}
