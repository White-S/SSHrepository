package syl.service;

import syl.domain.Items;

import java.util.List;

public interface Itemservice {
    List<Items> findAll();

    void updateItems(Items items);

    Items findByid(String id);
}
