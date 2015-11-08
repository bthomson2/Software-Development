package com.example.singletonclass;

/**
 * Created by Brenda on 11/8/2015.
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
//illegal construct
//Com pile Tim e Error: The constructor SingleObject() is not visible
//SingleObject object = new SingleObject();
//Get the only object available
        SingletonClass object = SingletonClass.getInstance();
//show the m essage
        object.showMessage();
    }
}
