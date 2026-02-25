package Iterator;

import java.util.ArrayList;

public class UserManagement {
    
    private ArrayList<User> userList = new ArrayList<>();

    public void addUser(User user){
        userList.add(user);
    }

    public User getUser(int i){
        return userList.get(i);
    }

    public MyIterator getIterator(){
        return new MyIteratorImpl(userList);
    }
}
