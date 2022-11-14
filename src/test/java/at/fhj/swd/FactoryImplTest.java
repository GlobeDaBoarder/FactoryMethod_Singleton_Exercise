package at.fhj.swd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactoryImplTest extends AbstractFactoryImplTest {
    @Override
    protected Factory getFactory() {
        return new FactoryImpl();
    }


    @Test
    public void testFactoryInstances() {
        Factory factoryInstance1 = getFactory();
        Factory factoryInstance2 = getFactory();
        assertNotEquals(factoryInstance1, factoryInstance2, "Instances factoryInstance1, factoryInstance2, must be different but are equal!");
    }


}
