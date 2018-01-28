/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armyBuilder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author Vitaliy
 */
public class textReader {
    //This class is for getting an array list of the objects to be passed to the list module
    public static ArrayList<Monster> getList(Path filePath){
        //creates arraylist
        ArrayList<Monster> listOfMonsters = new ArrayList<>();
        //creates Monster path
        
        if (Files.exists(filePath))
        {
            //creates monster file from path
            File monsterFile = filePath.toFile(); 
            try (BufferedReader in = new BufferedReader(new FileReader(monsterFile)))
            {
                //reads the next line of the file
                String line = in.readLine();
                while (line != null)
            {   
                //Parse the line into its columns - pg 577 of Murach
                String [] columns = line.split(",");
                String race = columns[0];
                String desc = columns[1];
                String atk = columns[2];
                
                
                //Create the object from the data
                Monster m = new Monster(race, desc, atk);
                
                //Add the object to the list
                listOfMonsters.add(m);
                
                
                
                //Grab the next line
                line = in.readLine();
            }
        }
        catch (IOException e)
        {
            System.out.println("Exception occured in textReader viewer");
        }                  
        }
        else
        {
            System.out.println("ERROR: Invalid FilePath. File does not exit. textReader.java");
        }
        return listOfMonsters;
    }
}
