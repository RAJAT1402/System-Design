package Singleton;

import java.io.Serializable;

// public class Singleton {
//     public static Singleton Instance;

//     private Singleton(){
//         if(Instance == null){
//             throw new RuntimeException("You are trying to break singleton using reflection");
//         }
//     }

//     public static Singleton getInstance(){
//         if(Instance == null){
//             synchronized(Singleton.class){
//                 if(Instance == null){
//                     Instance = new Singleton();
//                 }
//             }
//         }

//         return Instance;
//     }
// }


// public class Singleton implements Serializable{
//     public static Singleton Instance;

//     private Singleton(){
//     }

//     public static Singleton getInstance(){
//         if(Instance == null){
//             synchronized(Singleton.class){
//                 if(Instance == null){
//                     Instance = new Singleton();
//                 }
//             }
//         }

//         return Instance;
//     }
// }

// 1. ENUM Method
// public enum Singleton{
//     Instance;
// }

// 2. Serializable

// public class Singleton implements Serializable{
//     public static Singleton Instance;

//     private Singleton(){
//     }

//     public static Singleton getInstance(){
//         if(Instance == null){
//             synchronized(Singleton.class){
//                 if(Instance == null){
//                     Instance = new Singleton();
//                 }
//             }
//         }

//         return Instance;
//     }

//     public Object readResolve(){
//         return Instance;
//     }
// }



// 3. Cloning

public class Singleton implements Cloneable{
    public static Singleton Instance;

    private Singleton(){
    }

    public static Singleton getInstance(){
        if(Instance == null){
            synchronized(Singleton.class){
                if(Instance == null){
                    Instance = new Singleton();
                }
            }
        }

        return Instance;
    }

    // @Override
    // public Object clone() throws CloneNotSupportedException{
    //     return super.clone();
    // }

     @Override
    public Object clone() throws CloneNotSupportedException{
        return Instance;
    }
}