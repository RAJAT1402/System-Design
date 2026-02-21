package Prototype;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        
        NetworkConnection networkConnection = new NetworkConnection();

        networkConnection.setIp("191.168.5.5");
        networkConnection.loadImportantData();

        System.out.println(networkConnection);

        NetworkConnection networkConnection2 = null;

        try{
            networkConnection2 = (NetworkConnection) networkConnection.clone();
            System.out.println(networkConnection2);
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }


    }
}
