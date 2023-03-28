package com.cydeo.utilities;

import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class Utils {
    /**
This method will accept int (in seconds) and execute Thread.sleep
for given duration
 */
    public static void sleep(int second){
        second *=1000;
        try {
            Thread.sleep(second);
        }catch (InterruptedException e ) {

        }
    }

    /** This method accepts List of WebElements and cliks a randomly selected element from the list.
     */
    public void randomlyClickButton(List<WebElement> webElements){
        Random random= new Random();
        int randomNumber = random.nextInt(webElements.size()-1);
        webElements.get(randomNumber).click();

    }




}
