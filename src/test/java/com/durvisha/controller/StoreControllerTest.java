package com.durvisha.controller;

import com.durvisha.model.Item;
import com.durvisha.model.Product;
import com.durvisha.model.Store;
import com.durvisha.service.StoreService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = StoreController.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@ActiveProfiles(value = "test")
@AutoConfigureMockMvc
@DisplayName("Store Controller")
public class StoreControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private StoreService storeService;
    @Autowired
    private StoreController storeController;

    @BeforeEach
    public void setup() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(this.storeController).build();
    }

    @Test
    @DisplayName("Get Store Details")
    public void testGetStoreList() throws Exception {

        when(this.storeService.getStoreDetails()).thenReturn(Arrays.asList(Store.builder().invoice("Store12345").item(Item.builder().itemName("Watch").build()).product(Product.builder().productName("Accessories").build()).build()));
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/store");
        ResultActions perform = this.mockMvc.perform(requestBuilder);
        MvcResult mvcResult = perform.andDo(print()).andExpect(status().isOk()).andReturn();

       // MockHttpServletResponse response = mvcResult.getResponse();


    }
}
