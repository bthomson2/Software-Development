package com.example.singletonclass;

/**
 * Created by Brenda on 11/8/2015.
 */
public class SingletonClass {
    //create an object of SingleObject
    private static SingletonClass instance = new SingletonClass();
    //m ake the constructor private so that this class cannot be
//instantiated
    private SingletonClass(){}
    //Get the only object available
    public static SingletonClass getInstance() {
        return instance;
    }
    public void showMessage(){
        System .out.println("Look at this fine Singleton Pattern that was created!");
    }
}
