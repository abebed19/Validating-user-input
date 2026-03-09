/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validating;

/**
 *
 * @author aaron
 */
public interface FileServer {
    
    String load(String fileName) throws Exception;
    void save (String filName,String textToSave) throws Exception;
    
    
}
