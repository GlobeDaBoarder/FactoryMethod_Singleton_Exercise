package at.fhj.swd;

public class FactoryImpl implements Factory{
    @Override
    public Group createGroup(String name) {
        return new Group(IntegerSequence.getNextValue(), name);
    }

    @Override
    public User createUser(String username, String password) {
        return new User(IntegerSequence.getNextValue(), username, password);
    }
}
