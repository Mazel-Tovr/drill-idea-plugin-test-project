import com.epam.buisnes.*;
import com.epam.buisnes.impl.*;
import org.springframework.boot.*;
import org.springframework.context.annotation.*;

@SpringBootConfiguration
public class Config {

    @Bean
    public UserService userService() {
        return new UserServiceImpl();
    }

    @Bean
    public InsuranceService insuranceService() {
        return new InsuranceServiceImpl();
    }
}
