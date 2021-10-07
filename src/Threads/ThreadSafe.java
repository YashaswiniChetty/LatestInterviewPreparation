package Threads;

class ThreadSafe {

    //make static data member of threadSafeSingleton
    private static ThreadSafe threadSafeSingleton;

    //private constructor to avoid client application to use constructor
    private ThreadSafe(){

    }

    //a public static method that returns instance
    public static synchronized ThreadSafe getInstance(){
        if(threadSafeSingleton == null){
            threadSafeSingleton = new ThreadSafe();
        }

        return threadSafeSingleton;
    }
}


