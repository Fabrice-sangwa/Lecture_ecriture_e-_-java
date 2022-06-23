package com.phn.esis;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import java.util.Scanner;

public class Fichier {

    private String chemin;
    private File file;

    private FileWriter fileWriter;


    public Fichier(String chemin, File file) {
        this.chemin = chemin;
        this.file = file;
    }
    public void creer(){
        try {
            if(this.file.createNewFile()){
                System.out.println("The file has been created");
            } else {
                System.out.println("An Error occurred while creating the file");
            }

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void lire(){
        try{
            Scanner scanner = new Scanner(this.file);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }

        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());

        }
    }

    public void ecrire(String texte) {
        try {
            this.fileWriter = new  FileWriter(this.chemin, true);
            this.fileWriter.append(texte);
            this.fileWriter.flush();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public String getChemin() {
        return chemin;
    }


    public void setChemin(String chemin) {
        this.chemin = chemin;
    }

    @Override
    public String toString() {
        return "The path to your file " + this.getChemin();
    }
}
