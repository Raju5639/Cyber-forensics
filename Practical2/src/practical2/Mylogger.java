/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practical2;
import java.io.*;
import java.util.logging.*;
/**
 *
 * @author dell
 */
public class Mylogger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Logger l=Logger.getLogger(Mylogger.class.getName());
        FileHandler fh;
        try
        {
            fh=new FileHandler("F:/Msc Docs/MSC-2/Practical/Cyber/mylog1.log",true);
            l.addHandler(fh);
            l.setLevel(Level.ALL);
            SimpleFormatter sf=new SimpleFormatter();
            fh.setFormatter(sf);
            l.info("My first log");
        }
        catch(SecurityException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        l.info("Hi How r u?");
    }
}
