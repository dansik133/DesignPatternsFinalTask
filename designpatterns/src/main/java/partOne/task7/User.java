package partOne.task7;

public class User implements Mediator {
    String name;
    ChatRoom chatRoom;

    public User(String name) {
        this.name = name;
    }

    public void joinChatRoom(ChatRoom chatRoom) {
        this.chatRoom = chatRoom;
        chatRoom.addUser(this);
    }

    @Override
    public void send(String message) {
        chatRoom.sendToAllUsers(name, message);
    }

    @Override
    public void send(String message, User user) {
        chatRoom.sendToUser(name, message, user);
    }

    @Override
    public void accept(String from, String message) {
        System.out.println(name + "\n============");
        System.out.println(from + " says : " + message + "\n\n");
    }
}
