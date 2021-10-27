package herya.programmer.belajarspringdasar;

import herya.programmer.belajarspringdasar.data.Bar;
import herya.programmer.belajarspringdasar.data.Foo;
import herya.programmer.belajarspringdasar.data.FooBar;
import lombok.var;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionTest {
    private ApplicationContext applicationContext;

    @BeforeEach
    void setupUp(){
        applicationContext = new AnnotationConfigApplicationContext(DependencyInjectionConfiguration.class);

    }

    @Test
    void testDI(){
        Foo foo = applicationContext.getBean(Foo.class);
        Bar bar = applicationContext.getBean(Bar.class);
        FooBar fooBar = applicationContext.getBean(FooBar.class);

        Assertions.assertSame(foo, fooBar.getFoo());
        Assertions.assertSame(bar, fooBar.getBar());


    }


    @Test
    void testNoDi(){
        var foo = new Foo();
        var bar = new Bar();

        var fooBar = new FooBar(foo, bar);

        Assertions.assertSame(foo, fooBar.getFoo());
        Assertions.assertSame(bar, fooBar.getBar());
    }
}
