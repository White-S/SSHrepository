package syl.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import syl.dao.ItemDao;
import syl.domain.Items;
import syl.service.Itemservice;

import java.util.List;

@Service
public class ItemserviceImpl implements Itemservice {
    @Autowired
    private ItemDao itemDao;
    @Override
    public List<Items> findAll() {
        return itemDao.finAll();
    }

    @Override
    public void updateItems(Items items) {
         itemDao.updateItems(items);
    }

    @Override
    public Items findByid(String id) {
        return itemDao.findByid(id);
    }
}
