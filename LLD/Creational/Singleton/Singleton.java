package Singleton;

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

public class Singleton {
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
}

// 1. ENUM Method
// public enum Singleton{
//     Instance;
// }
