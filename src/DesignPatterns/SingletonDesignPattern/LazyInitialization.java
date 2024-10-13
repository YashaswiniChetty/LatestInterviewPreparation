package DesignPatterns.SingletonDesignPattern;

public class LazyInitialization {

        private  static LazyInitialization lazyInitialization;
        private LazyInitialization(){

        }
        public  static LazyInitialization getInstance(){
            if(lazyInitialization==null){
                return new LazyInitialization();
            }
            return lazyInitialization;
        }
    }

