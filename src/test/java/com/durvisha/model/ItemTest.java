package com.durvisha.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = Item.class)
@ActiveProfiles(value = "test")
@AutoConfigureMockMvc
@DisplayName("Item")
public class ItemTest {

    @MockBean
    private Item item;

    @BeforeEach
    public void setup() {
        this.item = Item.builder().build();
    }

    @Test
    public void testToString() {
        assertTrue(item.toString().equals( item.toString()));

    }
}
