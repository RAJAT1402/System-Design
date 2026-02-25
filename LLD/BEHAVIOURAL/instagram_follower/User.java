package instagram_follower;

import java.util.List;

public class User extends observer{
    List<User> follower;
    
    public void addPost(){

        for(User user: follower){
            user.sendNotification();
        }
    }

    public void addObserver(User user){
        follower.add(user);
    }

    public void removeObserver(User user){
        // int i = follower.find(user);
        
    }

    public void sendNotification(){
        // Send notificiation to current user
    }
}