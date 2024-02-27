package com.github.iyuninva.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.github.iyuninva.toys.data.Toys;
import com.github.iyuninva.toys.data.ToysList;

public class FileToys {

    public static void fileWin(int numberWin) {
        String currentPath;
        File newFile;
        try {
            currentPath = new java.io.File(".").getCanonicalPath() + "\\src\\com\\github\\iyuninva\\data";
            Toys toys = ToysList.toysList.get(numberWin);
            String temp = String.valueOf(toys);
            newFile = new File(currentPath + "WinFile.txt");
            FileWriter fileWriter = new FileWriter(newFile, true);
            fileWriter.write(temp);
            fileWriter.close();
        } catch (Exception e) {
            System.err.println(e);
        }
        

    } 
    
}