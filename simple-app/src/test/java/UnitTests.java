import com.epam.buisnes.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = Config.class)
public class UnitTests {

    @Autowired
    private UserService userService;

    @Autowired
    private InsuranceService insuranceService;


    @Test
    public void registerUser() {
        assertNotNull(userService.registerUser("name", "password"));
    }

    @Test
    public void removeUser() {
        assertTrue(userService.removeUser("name"));
    }

    @Test
    public void generateInsurance() {
        assertNotNull(insuranceService.generate());
    }

    @Test
    public void buildInsurance() {
        assertNotNull(insuranceService.build());
    }

}
