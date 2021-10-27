package herya.programmer.belajarspringdasar;

import herya.programmer.belajarspringdasar.data.Bar;
import herya.programmer.belajarspringdasar.data.Foo;
import herya.programmer.belajarspringdasar.data.FooBar;
import lombok.var;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DependencyInjectionTest {

    @Test
    void testNoDi(){
        var foo = new Foo();
        var bar = new Bar();

        var fooBar = new FooBar(foo, bar);

        Assertions.assertSame(foo, fooBar.getFoo());
        Assertions.assertSame(bar, fooBar.getBar());
    }
}
