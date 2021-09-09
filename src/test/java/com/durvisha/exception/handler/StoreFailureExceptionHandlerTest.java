package com.durvisha.exception.handler;

import com.durvisha.exception.AimException;
import com.durvisha.exception.StoreFailureException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = StoreFailureExceptionHandler.class)
@ActiveProfiles(value = "test")
@AutoConfigureMockMvc
@DisplayName("Store Failure Exception Handler")
public class StoreFailureExceptionHandlerTest {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private StoreFailureExceptionHandler storeFailureExceptionHandler;
    @MockBean
    private WebRequest request;
    @MockBean
    private Exception exception;

    @BeforeEach
    public void setup() {
    }

    @Test
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void testStoreNotFoundException() throws Exception {
        ResponseEntity<AimException> aimExceptionResponseEntity = storeFailureExceptionHandler.storeNotFoundException(new StoreFailureException("abc"), request);
        AimException aimException = AimException.builder().statusCode(HttpStatus.NOT_FOUND.value())
                .message("abc").build();
        this.mockMvc.perform(MockMvcRequestBuilders.get("/store",
                AimException.builder().statusCode(HttpStatus.NOT_FOUND.value()).build())
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isNotFound());
    }

    @Test
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public void testGlobalExceptionHandler() throws Exception {
        ResponseEntity<AimException> aimExceptionResponseEntity = storeFailureExceptionHandler.globalExceptionHandler(exception, request);
        AimException aimException = AimException.builder().statusCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .message("abc").description("abc").build();


    }

}
