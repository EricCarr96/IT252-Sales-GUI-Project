/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesgui;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Administrator
 */
public class StarsFile {
     
    public void writeStar(SalesRep s) throws IOException{
     File sFile = new File("Stars.txt");
        try (BufferedWriter pr = new BufferedWriter(new FileWriter(sFile, true))) {
            pr.write(s.getFirstName());
            pr.write(",");
            pr.write(s.getLastName());
            pr.write(",");
            pr.write("" + s.getRepID());
            pr.write(",");
            pr.write("" + s.getBooksSold());
            pr.write(",");
            pr.write("" + s.getSuppliesSold());
            pr.write(",");
            pr.write("" + s.getPaperSold());
            pr.write(",");
            pr.write("" + s.getContact());
            pr.write(",");
            pr.write("" + s.getDistrict());
            pr.newLine();
        } 
    
    }
}
