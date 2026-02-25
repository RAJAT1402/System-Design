package Observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // YoutubeChannel channel = new YoutubeChannel();

        // Subscriber aman = new Subscriber("aman");

        // channel.subscribe(aman);

        // channel.newVideoUploaded("Learn DSA");

        // Subscriber raman = new Subscriber("raman");

        // channel.subscribe(raman);

        // channel.newVideoUploaded("Learn System Design");

        // channel.unsubsribe(aman);

        // channel.newVideoUploaded("Observer deign pattern");

        Map<String, Subscriber> userMap = new HashMap<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        YoutubeChannel channel = new YoutubeChannel();

        outer : while(true){

            System.out.println("Press 1 for Upload Video");
            System.out.println("Press 2 to add observer");
            System.out.println("Print 3 for unsubscribe");
            System.out.println("Print 4 for exit");

            int c = Integer.parseInt(br.readLine());

            switch(c){
                case 1: System.out.print("Enter video title : ");
                        String title = br.readLine();
                        channel.newVideoUploaded(title);
                    break;
                case 2: System.out.print("Enter user name : ");
                        String userName = br.readLine();
                        Subscriber user = new Subscriber(userName);
                        userMap.put(userName, user);
                        channel.subscribe(user);
                    break;
                case 3: System.out.print("Enter user to unsubscribe : ");
                        String userName1 = br.readLine();

                        Subscriber ob = userMap.get(userName1);

                        if(ob == null){
                            System.out.println("No User exixts");
                        }else{
                            channel.unsubsribe(ob);
                        }
                    break;
                case 4: 
                    break outer;
                default:
                    System.out.println("Wrong input press again");
            }
        }
    }
}
