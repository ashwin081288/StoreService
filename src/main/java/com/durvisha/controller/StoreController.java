package com.durvisha.controller;

import com.durvisha.model.Item;
import com.durvisha.model.Product;
import com.durvisha.model.Store;
import com.durvisha.service.StoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@Slf4j
public class StoreController {

    @Autowired
    private StoreService storeService;
    @GetMapping(value = "/store")
//, consumes = MediaType.APPLICATION_JSON_VALUE
    public ResponseEntity<List<Store>> getStoreList() {

       // List<Store> stores = Arrays.asList(Store.builder().invoice("Store12345").item(Item.builder().itemName("Watch").build()).product(Product.builder().productName("Accessories").build()).build());
        List<Store> stores =storeService.getStoreDetails();
        return ResponseEntity.ok(stores);
    }
}
