package herya.programmer.belajarspringdasar;

import herya.programmer.belajarspringdasar.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrimaryConfigurationTest {
    private ApplicationContext applicationContext;

    @BeforeEach
    void setup(){
         applicationContext = new AnnotationConfigApplicationContext(PrimaryConfiguration.class);

    }

    @Test
    void testGetPrimari(){
        Foo foo = applicationContext.getBean(Foo.class);
        Foo foo1 = applicationContext.getBean("foo1", Foo.class);
        Foo foo2 = applicationContext.getBean("foo2", Foo.class);

        Assertions.assertSame(foo, foo1);
        Assertions.assertNotSame(foo, foo2);
        Assertions.assertNotSame(foo1,foo2);
    }
}

//class PrimaryConfigurationTest {
//    PrimaryConfiguration primaryConfiguration = new PrimaryConfiguration();
//
//    @Test
//    void testFoo1() {
//        Foo result = primaryConfiguration.foo1();
//        Assertions.assertEquals(new Foo(), result);
//    }
//
//    @Test
//    void testFoo2() {
//        Foo result = primaryConfiguration.foo2();
//        Assertions.assertEquals(new Foo(), result);
//    }
//}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme