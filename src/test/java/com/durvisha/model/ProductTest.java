package com.durvisha.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = Product.class)
@ActiveProfiles(value = "test")
@AutoConfigureMockMvc
@DisplayName("Product")
public class ProductTest {

    @MockBean
    private Product product;

    @BeforeEach
    public void setup() {
        this.product = Product.builder().build();
    }

    @Test
    public void testToString() {
        assertTrue(product.toString().equals( product.toString()));

    }
}
