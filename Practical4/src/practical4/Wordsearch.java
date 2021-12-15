/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practical4;
import java.io.*;
/**
 *
 * @author dell
 */
public class Wordsearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        try
        {
            String str="";
            String ser="";
            int flag=0;
            BufferedReader br=new BufferedReader(new FileReader("F:\\Msc Docs\\MSC-2\\Practical\\Cyber\\file.txt"));
            BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
            str=br.readLine();
            String [] s = new String[str.length()];
            System.out.println("enter the text u want to search");
            ser=br1.readLine();
            s=str.split(" ");
            for(int i=0;i<s.length;i++)
            {
                if(ser.equalsIgnoreCase(s[i]))
                {
                    System.out.println("Text "+ser+" Found");
                    flag=1;
                }
            }
            if(flag==0)
            {
                System.out.println("Text "+ser+" Not Found");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
