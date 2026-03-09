/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validating;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author aaron
 */
public class TextServer implements FileServer{
    Map<String,String> data;
    
    public TextServer(){
        this.data = new HashMap<>();
    }
    

    @Override
    public String load(String fileName) throws Exception {
        
        return this.data.get(fileName);
    }

    @Override
    public void save(String filName, String textToSave) throws Exception {
        this.data.put(filName, textToSave);
    }
    
}
