package Singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Example {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, FileNotFoundException, IOException, ClassNotFoundException {
        
        // Ways to Break Singleton Design Pattern

        // 1. Reflection API
        // Singleton s = Singleton.getInstance();
        // System.out.println(s.hashCode());


        // Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
        // constructor.setAccessible(true);
        // Singleton s2 = constructor.newInstance();
        // System.out.println(s2.hashCode());
        
        // Solution 
        // a> Throws exception inside the constructor
        // b> Using ENUM

        
        // 2. Deserialization 

        Singleton s3 = Singleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
        oos.writeObject(s3);
        System.out.println("s3 " + s3.hashCode());
        
        System.out.println("Serialization Done");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
        Singleton s4 = (Singleton) ois.readObject();
        
        System.out.println("s4 " + s4.hashCode());
    }   
}
