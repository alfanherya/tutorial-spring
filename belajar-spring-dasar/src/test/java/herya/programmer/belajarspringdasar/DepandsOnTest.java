package herya.programmer.belajarspringdasar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DepandsOnTest {
    private ApplicationContext applicationContext;

    @BeforeEach
    void setup(){
        applicationContext = new AnnotationConfigApplicationContext(DepandOnConfigurations.class);

    }

    @Test
    void testDependsOn(){

    }
}
