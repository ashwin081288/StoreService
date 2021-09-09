package com.durvisha.service.impl;

import com.durvisha.model.Item;
import com.durvisha.model.Product;
import com.durvisha.model.Store;
import com.durvisha.service.StoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class StoreServiceImpl implements StoreService {
    @Override
    public List<Store> getStoreDetails() {
        return Arrays.asList(Store.builder().invoice("Store12345").item(Item.builder().itemName("Watch").build()).product(Product.builder().productName("Accessories").build()).build());

    }
}
