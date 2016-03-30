import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

/**
 * Created by zanna on 30/03/16.
 */
public class ProvaInject {

    private static Injector i = Guice.createInjector(new BinderModule());
    @Inject private static FooFactory fooFactory = i.getInstance(FooFactory.class);
    private Foo f;

    public ProvaInject(String s){
        f = fooFactory.create(s);
    }

    public void doFoo(){
        System.out.println(f.getFooName());
    }

    public static void main(String[] args) {
        ProvaInject in = new ProvaInject("how lovely inject");
        in.doFoo();
    }
}
