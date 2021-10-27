package herya.programmer.belajarspringdasar;

import herya.programmer.belajarspringdasar.data.Bar;
import herya.programmer.belajarspringdasar.data.Foo;
import herya.programmer.belajarspringdasar.data.FooBar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DependencyInjectionConfiguration {
    @Bean
    public Foo foo(){
        return new Foo();
    }

    @Bean
    public Bar bar(){
        return new Bar();
    }

    @Bean
    public FooBar fooBar(Foo foo, Bar bar){
        return new FooBar(foo, bar);
    }

}
