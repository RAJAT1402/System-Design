package Iterator;

public class Main {
    public static void main(String[] args) {
        
        UserManagement userManagement = new UserManagement();

        User user1 = new User("rg", "1");
        User user2 = new User("yash", "2");
        User user3 = new User("pooja", "3");
        userManagement.addUser(user1);
        userManagement.addUser(user2);  
        userManagement.addUser(user3);

        MyIterator myIterator = userManagement.getIterator();

        while(myIterator.hasNext()){
            User user = (User) myIterator.next();

            System.out.print(user.getName());
        }
    }
}
