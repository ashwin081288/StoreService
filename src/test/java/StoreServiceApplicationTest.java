import com.durvisha.controller.StoreController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = StoreServiceApplication.class)
@AutoConfigureMockMvc
@DisplayName("Store Service Application")
@ActiveProfiles(value = "test")
//sss@ContextConfiguration

//@WebMvcTest
/*@TestPropertySource(
        locations = "classpath:application-integrationtest.properties")*/
public class StoreServiceApplicationTest {
    @Autowired
    private StoreController storeController;

    @Test
    @DisplayName("Main Method")
    public void testMain() {
        StoreServiceApplication.main(new String[]{});
    }

    @Test
    @DisplayName("Context Loads")
    public void contextLoads() throws Exception {
        //  assertEquals(storeController.getStoreList()).isNotNull();
        assertThat(storeController.getStoreList()).isNotNull();
    }
}
