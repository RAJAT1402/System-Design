package Singleton;

// Lazy Initialization
// public class SimpleSingleton {
//     public static SimpleSingleton Instance;

//     private SimpleSingleton(){

//     }

//     public static SimpleSingleton getInstance(){
//         if(Instance == null){
//             Instance = new SimpleSingleton();
//         }

//         return Instance;
//     }
// }




// Thread Safety ( Method Synchronization )
// public class SimpleSingleton {
//     public static SimpleSingleton Instance;

//     private SimpleSingleton(){

//     }

//     public synchronized static SimpleSingleton getInstance(){
//         if(Instance == null){
//             Instance = new SimpleSingleton();
//         }

//         return Instance;
//     }
// }




// Thread Safety ( Block Synchronization )
public class SimpleSingleton {
    public static SimpleSingleton Instance;

    private SimpleSingleton(){

    }

    public static SimpleSingleton getInstance(){
        if(Instance == null){
            synchronized(SimpleSingleton.class){
                if(Instance == null){
                    Instance = new SimpleSingleton();
                }
            }
        }

        return Instance;
    }
}



// Eager Initilization
// public class SimpleSingleton {
//     public static final SimpleSingleton Instance = new SimpleSingleton();
    
//     private SimpleSingleton(){

//     }

//     public static SimpleSingleton getInstance(){
//         return Instance;
//     }
// }






// public class SimpleSingleton {
//     public static final SimpleSingleton Instance;

//     // statioc initilization block
//     static {
//         Instance = new SimpleSingleton();
//     }
    
//     private SimpleSingleton(){

//     }

//     public static SimpleSingleton getInstance(){
//         return Instance;
//     }
// }
