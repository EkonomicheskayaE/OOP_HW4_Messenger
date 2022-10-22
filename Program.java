import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {

    
        Input input = new Input();
        UserBuilder junior_task1 = new Junior_task1();
        input.setUserBuilder(junior_task1);
        input.constructUser();

        Input input2 = new Input();
        UserBuilder junior_task2 = new Junior_task2();
        input2.setUserBuilder(junior_task2);
        input2.constructUser();

        User user1 = input.getUser();
        System.out.println("Первый пользователь:\n");
        user1.print();

        User user2 = input2.getUser();
        System.out.println("Второй пользователь:\n");
        user2.print();
        
        User file = input.getUser();
        file.save();
        file.read();
            
    }
        
        // ArrayList<User> list = new ArrayList<>();
        // list.add(user1);
        // list.add(user2);
        // System.out.println(list);
}
        
