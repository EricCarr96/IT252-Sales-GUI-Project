
package salesgui;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class SalesFileStorage {
    
    public void writeSales(SalesRep sr) throws IOException
    {
     File testWriter = new File("Stars.txt");
        try (BufferedWriter out = new BufferedWriter(new FileWriter(testWriter, true))) {
            out.write(sr.getFirstName());
            out.write(",");
            out.write(sr.getLastName());
            out.write(",");
            out.write("" + sr.getRepID());
            out.write(",");
            out.write("" + sr.getBooksSold());
            out.write(",");
            out.write("" + sr.getSuppliesSold());
            out.write(",");
            out.write("" + sr.getPaperSold());
            out.write(",");
            out.write("" + sr.getContact());
            out.write(",");
            out.write("" + sr.getDistrict());
            out.newLine();
        }
    
    }
}
