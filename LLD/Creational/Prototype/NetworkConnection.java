package Prototype;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable{
    
    private String ip;
    private String importantData;
    private List<String> domains = new ArrayList<>();
    
    public void setIp(String ip){
        this.ip = ip;
    }

    public List<String> getDomains(){
        return domains;
    }

    public void setImportantData(String importantData){
        this.importantData = importantData;
    }

    public void loadImportantData() throws InterruptedException{
        this.importantData = "Very Important data";

        domains.add("www.google.com");
        domains.add("www.stackoverflow.com");
        domains.add("www.leetcode.com");
        domains.add("www.w3schools.com");
        // this function will take 5 minutes
        Thread.sleep(1000);
    }

    @Override
    public String toString(){
        return this.ip + " : " + this.importantData + " : " + this.domains;
    }

    // @Override
    // public Object clone() throws CloneNotSupportedException{
    //     return super.clone();
    // } 

    // deep clone
    @Override
    public Object clone() throws CloneNotSupportedException{

        NetworkConnection networkConnection = new NetworkConnection();

        networkConnection.setIp(this.ip);
        networkConnection.setImportantData(importantData);

        for(String d : domains){
            networkConnection.getDomains().add(d);
        }

        return networkConnection;
    } 
}
