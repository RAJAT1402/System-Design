package Observer;

public interface Subject {

    void subscribe(Observer ob);

    void unsubsribe(Observer ob);

    void newVideoUploaded(String title);
    
}