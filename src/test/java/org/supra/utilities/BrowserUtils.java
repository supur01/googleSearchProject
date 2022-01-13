package org.supra.utilities;

public class BrowserUtils {

    public static void sleep(int seconds){
        try{Thread.sleep(seconds*1000);

        }catch(InterruptedException e){
            e.printStackTrace();
            System.out.println("Exception in sleep method");
        }
    }
}
