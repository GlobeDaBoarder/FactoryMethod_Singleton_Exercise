package at.fhj.swd;

import java.util.ArrayList;
import java.util.List;

public class Group extends Entity {
    /*
     * Constructor
     */
    public Group(int id, String name) {
        setId(id);
        setName(name);
    }


    /*
     * Property: name:String
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null)
            throw new IllegalArgumentException();
        this.name = name;
    }


    /*
     * Association: ---[*]-> users:User
     */
    private List<User> users = new ArrayList<User>();

    public void addUser(User user) {
        if (user == null)
            throw new IllegalArgumentException();
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }


    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append(getId()).append(",").append(getName()).append(",");
        for (User u : getUsers()) {
            b.append(u.toString());
        }

        return b.toString();
    }
}
