package at.fhj.swd;

public interface Factory {

    Group createGroup(String name);

    User createUser(String username, String password);
}
