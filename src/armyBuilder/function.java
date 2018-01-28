/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armyBuilder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author veese
 */
public class function {
    
    public static void replaceString(Path filePath, String oldString, String newString)
	{
                
                //Had a lot of trouble getting this functiont to work using murachs java, 
                //ended up googling for help and used online reference
            
		File fileToBeModified = filePath.toFile();
		
		String oldText = "";
		
		BufferedReader reader = null;
		
		FileWriter writer = null;
		
		try 
		{
			reader = new BufferedReader(new FileReader(fileToBeModified));
						
			String line = reader.readLine();
			
			while (line != null) 
			{
				oldText += line + System.lineSeparator();
				
				line = reader.readLine();
			}
			
			
			String newText = oldText.replaceAll(oldString, newString);
			
			
			writer = new FileWriter(fileToBeModified);
			
			writer.write(newText);
		}
		catch (IOException e)
		{
                    System.out.println("Problem with the function.replaceString() method");
		}
		finally
		{
			try 
			{
				//Closing the resources
				
				reader.close();
				
				writer.close();
			} 
			catch (IOException e) 
			{
                            System.out.println("Problem with closing the resources in function.replaceString()");
			}
		}
	}
    
    public static void addToFile(Path filePath, String toAdd){
        if (Files.exists(filePath)){
            
        File fileToEdit = filePath.toFile();
        
        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileToEdit, true)))) //true = append
            { 
                out.println(toAdd);
            } 
        catch (IOException ex) 
            {
                System.out.println(ex);
            }
        }
    }
}
		
		
		
  


        
            
       

