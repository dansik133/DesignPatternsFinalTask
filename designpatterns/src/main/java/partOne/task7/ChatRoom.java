package partOne.task7;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
    private List<User> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        if (!users.contains(user)) {
            users.add(user);
            user.joinChatRoom(this);
        }
    }

    public void disconnectUser(User user) {
        users.remove(user);
    }

    public void sendToAllUsers(String from, String message) {
        users.forEach(user -> user.accept(from, message));
    }

    public void sendToUser(String from, String message, User user) {
        if (users.contains(user))
            user.accept(from, message);
    }
}
