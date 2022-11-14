package at.fhj.swd;

public final class FactorySingletonImpl implements Factory{
    private FactorySingletonImpl(){ }

    private static class Holder {
        private static final FactorySingletonImpl INSTANCE = new FactorySingletonImpl();
    }

    public static FactorySingletonImpl getInstance() {
        return Holder.INSTANCE;
    }
    @Override
    public Group createGroup(String name) {
        return new Group(IntegerSequence.getNextValue(), name);
    }

    @Override
    public User createUser(String username, String password) {
        return new User(IntegerSequence.getNextValue(), username, password);
    }
}
