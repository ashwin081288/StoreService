package com.durvisha.controller;

import com.durvisha.model.Store;
import com.durvisha.service.StoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Validated
@Slf4j
public class StoreController {

    @Autowired
    private StoreService storeService;

    @GetMapping(value = "/store")
//, consumes = MediaType.APPLICATION_JSON_VALUE
    public ResponseEntity<List<Store>> getStoreList() {

        List<Store> stores = storeService.getStoreDetails();
        return ResponseEntity.ok(stores);
    }
}
