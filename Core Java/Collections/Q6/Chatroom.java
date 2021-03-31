import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Chatroom {
    private String name;
    private Set<String> username;
    private List<String> messages;

    {
        name = "";
        username = new HashSet<String>();
        messages = new ArrayList<String>();
    }
    public boolean removeUser(String username) {
        return this.username.remove(username);
    }

    public void addUsername(String name){
        this.username.add(name);

    }

}
