package Prototype;

public class NetworkConnection implements Cloneable{
    
    private String ip;
    private String importantData;

    public void setIp(String ip){
        this.ip = ip;
    }

    public void loadImportantData() throws InterruptedException{
        this.importantData = "Very Important data";
        // this function will take 5 minutes
        Thread.sleep(2000);
    }

    @Override
    public String toString(){
        return this.ip + " : " + this.importantData;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    } 
}
