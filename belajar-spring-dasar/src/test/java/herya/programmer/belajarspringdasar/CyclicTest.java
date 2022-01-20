package herya.programmer.belajarspringdasar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

public class CyclicTest {
    @Test
    void testCyclic(){
        /*Karena cycural dependency maka lebih bagus memakai method seperti dibawah ini*/
        Assertions.assertThrows(Throwable.class, () -> {
            ApplicationContext context = new AnnotationConfigApplicationContext(CyclicConfiguration.class);
        });
    }
}
