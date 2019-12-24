package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LaptopIOS implements Laptop {

    @Override
    public String getElementsOnSite() {
        String style = "";
        try(FileReader reader = new FileReader("laptopIOS.css")){
            int element;
            while ((element = reader.read()) != -1){
                style = style + (char) element;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return style;
    }
}
