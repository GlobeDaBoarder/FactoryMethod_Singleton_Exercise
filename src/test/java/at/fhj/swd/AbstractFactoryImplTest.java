package at.fhj.swd;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public abstract class AbstractFactoryImplTest {
    protected Group group = null;
    protected Factory factory = null;

    protected abstract Factory getFactory();

    @BeforeEach
    public void setup() {
        factory = getFactory();

    }

    private void createGroupUserStructure() {
        IntegerSequence.setInitValue(1);
        group = factory.createGroup("Simpsons");

        User u1 = factory.createUser("homer", "***");
        group.addUser(u1);
        u1.setGroup(group);

        User u2 = factory.createUser("marge", "***");
        group.addUser(u2);
        u2.setGroup(group);
    }

    @Test
    public void testCreateGroup() {
        Group g = factory.createGroup("vegetable");
        assertNotNull(g);
    }

    @Test
    public void testCreateUser() {
        User u = factory.createUser("cucumber", "******");
        assertNotNull(u);
    }

    @Test
    public void testUserToString() {
        User u = factory.createUser("lisa", "**********");

        assertEquals("4,lisa,**********", u.toString());
    }


    @Test
    public void testGroupToString() {
        createGroupUserStructure();
        final String EXPECTED = "1,Simpsons,2,homer,***3,marge,***";
        assertEquals(EXPECTED, group.toString());
    }


    @Test
    public void testNavigation() {
        createGroupUserStructure();
        assertEquals(2, group.getUsers().size());

        assertEquals("homer", group.getUsers().get(0).getUsername());
        assertEquals("marge", group.getUsers().get(1).getUsername());

        User u1 = group.getUsers().get(0);
        assertEquals("homer", u1.getUsername());
        assertEquals("Simpsons", u1.getGroup().getName());
    }
}
