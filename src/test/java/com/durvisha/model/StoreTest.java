package com.durvisha.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = Store.class)
@ActiveProfiles(value = "test")
@AutoConfigureMockMvc
@DisplayName("Store")
public class StoreTest {

    @MockBean
    private Store store;

    @BeforeEach
    public void setup() {
        this.store = Store.builder().build();
    }

    @Test
    public void testToString() {
        assertTrue(store.toString().equals( store.toString()));

    }
}
