package herya.programmer.belajarspringdasar;

import herya.programmer.belajarspringdasar.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Slf4j
@Configuration
public class BeanConfiguration {
    @Bean
    public Foo foo(){
        Foo foo = new Foo();
        log.info("hay herya ini bean yang baru di buat");
        return foo;
    }
}
