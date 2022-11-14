package at.fhj.swd;

import org.junit.jupiter.api.Test;

public class FactoryImplSingletonTest extends AbstractFactoryImplTest {
    @Override
    protected Factory getFactory() {
        // depending which kind of singleton you choose to implement,
        //there are different ways to access the single instance, e.g.,
        // * 'public static final field' singleton stores its instance according its name ==> you access the field via:
        // <classname>.INSTANCE
        // * 'Factory method' singleton, 'static-block', 'lazy', OR 'init-on-demand-holder-idiom' singelton you call:
        // <classname>.getInstance();
        // when using an 'enum' singleton you access the sole intance by accessing the <enum-name>.INSTANCE
        // just check out the singleton variants we have elaborated for more details.

        // implement meaningful code to return a factory instance
        return FactorySingletonImpl.INSTANCE;
    }

    @Test
    public void testFactoryInstances() {
        Factory factoryInstance1 = getFactory();
        Factory factoryInstance2 = getFactory();
        assertEquals(factoryInstance1, factoryInstance2, "Instances factoryInstance1, factoryInstance2, must be equal but are different!");

    }


}
