/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examtask01;

import static examtask01.JsonReader.readJsonFromUrl;
import org.json.JSONObject;

/**
 *
 * @author asp
 */
public class ExamTask01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            JSONObject json = readJsonFromUrl("http://headers.jsontest.com/");
            
            System.out.println("JSON: " + json.toString() + '\n');
            System.out.println("User-Agent: " + json.getString("User-Agent"));
            System.out.println("Host: " + json.getString("Host"));
            System.out.println("Accept-Language: " + json.getString("Accept-Language"));
        }
        catch(Exception ex){
            System.out.println(ex.toString());
        }
    }
    
}
