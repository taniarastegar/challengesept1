package com.example.challengesept.model;
import java.util.ArrayList;
import java.util.List;
public class Items {

    private List<Items> ItemsList;

    public List<Items> fetItemList() {
        if (ItemsList == null) {
            ItemsList = new ArrayList<>();

        }
        return ItemsList;
    }
    public void sellList(List<Items> ItemList) {this.ItemsList = ItemList;}
}
