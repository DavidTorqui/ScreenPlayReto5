package ScreenPlay.Reto5.Util;

import java.util.concurrent.Callable;

public class UtilidadTiempo {

       public static Callable<Boolean> condicionExitosa() {
             return new Callable<Boolean>() {
                    public Boolean call() throws Exception {
                           Boolean allMessagesProcessed = true;
                           return allMessagesProcessed;
                    }
             };
       }
}
