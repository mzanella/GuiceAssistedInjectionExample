import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;

/**
 * Created by zanna on 28/03/16.
 */
public class Foo implements FooInterface{
    String bar;

    @Inject
    public Foo(@Assisted String bar)
    {
        this.bar = bar;
    }

    // return the final name
    public String getFooName(){
        return this.bar;
    }

}
