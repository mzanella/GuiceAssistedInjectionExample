import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.assistedinject.FactoryModuleBuilder;

/**
 * Created by zanna on 28/03/16.
 */
public class BinderModule implements Module {

    public void configure(Binder binder) {
        binder.install(new FactoryModuleBuilder()
                .implement(FooInterface.class, Foo.class)
                .build(FooFactory.class));
    }
}