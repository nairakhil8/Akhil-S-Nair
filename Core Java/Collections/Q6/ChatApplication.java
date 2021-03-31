import java.util.*;

public class ChatApplication {
    private Map<String, Chatroom> chatrooms = new HashMap<String, Chatroom>();
    private Map<String, User> users = new HashMap<String, User>();
    private Set<String> loggedInUsers = new HashSet<String>();

    public boolean isChatroomNameValid(String name) {
        return true;
    }

    public boolean isUsernameExists(String username) {
        List<User> user = new ArrayList<>(users.values());
        for(User u:user){
            if(username.equals(u.getUsername())){
                return true;
            }
        }
        return false;
    }

    public boolean authenticateUser(String username, String password) {
        List<User> user = new ArrayList<>(users.values());
        for(User u:user){
            if(username.equals(u.getUsername()) && password.equals(u.getPassword())){
                return true;
            }
        }
        return false;
    }

    //UI Methods Below
    public void createChatroom() {

    }

    public void addNewUser() {}

    public boolean login() {
        return true;
    }

    public void sendMessage() {}
    public void printMessages() {}

    public void listUsersFromChatroom() {}

    public void logout(){}

    public void deleteUser(){}


    public void menu() {}
}
