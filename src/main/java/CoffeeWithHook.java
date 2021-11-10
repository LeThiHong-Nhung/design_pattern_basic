
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HONGNHUNG
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook{
    public void brew()
    {
        System.out.println("Dripping coffee with filter");
    }
    
    public void addCondiments()
    {
        System.out.println("Adding sugar and milk");
    }
    public boolean customerWantsCondiments()
    {
        String answer = getUserInput();
        if(answer.toLowerCase().startsWith("y"))
        {
            return true;
        }
        else return false;
    }
    
    public String getUserInput()
    {
        String answer = null;
        System.out.println("Would you like to add sugar and milk?");
        BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
        try {
            answer = in.readLine();
        }
        catch (IOException ioe)
        {
            System.err.println("IO err try to read your answer");
        }
        if(answer == null)
        {
            return "no";
        }
        else return answer;
    }
}
