package org.example.service;

import org.example.Item.Item;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    private final List<Item> items = new ArrayList<>();
    private long nextId = 1;

    // Add new item
    public Item addItem(Item item) {
        item.setId(nextId++);
        items.add(item);
        return item;
    }

    // Get item by ID
    public Optional<Item> getItemById(Long id) {
        return items.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst();
    }
}
