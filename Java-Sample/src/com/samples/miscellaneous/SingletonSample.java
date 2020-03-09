
package com.samples.miscellaneous;

import java.io.Serializable;

public class SingletonSample implements Serializable {

    private static volatile SingletonSample sSoleInstance;

    //private constructor.
    private SingletonSample(){

        //Prevent form the reflection api.
        if (sSoleInstance != null){
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    public static SingletonSample getInstance() {
        if (sSoleInstance == null) { //if there is no instance available... create new one
            synchronized (SingletonSample.class) {
                if (sSoleInstance == null) sSoleInstance = new SingletonSample();
            }
        }

        return sSoleInstance;
    }

    //Make singleton from serialize and deserialize operation.
    protected SingletonSample readResolve() {
        return getInstance();
    }
}
