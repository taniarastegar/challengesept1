package com.example.challengesept.controller;

import com.example.challengesept.dao.ItemDao;
import com.example.challengesept.model.Item;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller("item")
public class itemcontroller {
    ItemDao itemDao;

    @GetMapping("item{id}")
    public Item getItem(@PathVariable int id) {
        itemDao = new ItemDao();
        itemDao.addItems();
        return itemDao.getItem(id);
    }

    @GetMapping("item")
    public List<Item> getAllItems() {
        itemDao = new ItemDao();
        itemDao.addItems();
        return itemDao.getAllItems();
    }

    @PostMapping("item")
    public void createItem(@RequestBody Item item) {
        itemDao = new ItemDao();
        itemDao.addItems();
        itemDao.addItem(item);
    }
    @DeleteMapping("item")
    public void deleteItem(@RequestBody Item item) {
        itemDao = new ItemDao();
        itemDao.addItems();
        itemDao.deleteItem(item);
    }
    @PutMapping("item")
    public void updateItem(@RequestBody Item item) {
        itemDao = new ItemDao();
        itemDao.addItems();
        itemDao.updateItem(item.getId(), item);
    }
}
