package com.phn.esis;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            File file = new File("first.txt");

            if (file.createNewFile()){
                System.out.println("The file has been created");
            } else {
                System.out.println("An error occurred during the creation");
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }



    }
}