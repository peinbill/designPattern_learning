package behavioral.mediatorPattern;

public class TestMediatorPattern {

    public static void main(String[] args){
        ChatMediator mediator = new ChatMediatorImpl();

        User user1 = new UserImpl(mediator,"Huang");
        User user2 = new UserImpl(mediator,"Li");
        User user3 = new UserImpl(mediator,"Chen");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.send("Hi All");

    }
}
