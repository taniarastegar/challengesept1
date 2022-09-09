package com.example.challengesept.dao;
import com.example.challengesept.model.Item;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

//@Repository
//public interface ItemDao extends JpaRepository<Item,Integer> {
//     Item getAllById();
//     List<Item> findAll();
//
//}
public class ItemDao  {
     public List<Item> items;
     public void addItems(){
          items.add(new Item(String.valueOf(1),"tania","china",20));
          items.add( new Item(String.valueOf(2), "dress","Australia",25));
          items.add(new Item(String.valueOf(3),"hat","USA",30));
     }
     public void addItem(Item item){
          items.add(item);
     }
     public List<Item> getAllItems() {return items;}
public void deleteItem(Item item)
     {          
     items.remove(Integer.parseInt(item.getId())-1);

     }

     public Item getItem (int id){
          return items.get(id);
     }
     public void updateItem (int id, Item item)
     {
        items.set(id,item);
     }
}
