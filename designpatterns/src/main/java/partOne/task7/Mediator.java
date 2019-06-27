package partOne.task7;

public interface Mediator {
    void send(String message);
    void send(String message, User user);
    void accept(String from, String message);
}
