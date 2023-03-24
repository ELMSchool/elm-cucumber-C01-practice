package utils;

public class WaitUtils {

    public static void pauseFor(int milliSeconds){
        try{

            Thread.sleep(milliSeconds);
        }catch (Exception e){

        }
    }
}
