
package salesgui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author Administrator
 */
public class SalesReader{

    public static void main(String[] args) throws IOException {
        
        SalesReader srd = new SalesReader();
        List<SalesRep> sales = srd.readSales("Stars.txt");
        System.out.println(sales);
        
    }
    
    public List<SalesRep> readSales(String StarsFile) throws IOException {
        
        File f = new File("Stars.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        
        List<SalesRep> sales = new ArrayList<SalesRep>();
        
        String line = br.readLine();
        while(line != null)
        {
        SalesRep s = null;
        
        try
        {
          s = parseLine(line);
        
        }catch(Exception e)
        {
          e.printStackTrace();
        }
        if(s == null)
        {
          System.out.println("Error incorrect input" + line);
        }else{
        
        sales.add(s);
        }
        line = br.readLine();
        }
        return sales;
    }
    
    private SalesRep parseLine(String line)
    {
     int repID;
     String firstName, lastName, district, contact;
     double suppliesSold, booksSold, paperSold;
    
        StringTokenizer st = new StringTokenizer(line, ",");
        System.out.println("Number of tokens " + st.countTokens()); 
        firstName = st.nextToken().trim();
        lastName  = st.nextToken().trim();
        repID     = Integer.parseInt(st.nextToken().trim());
        booksSold = Double.parseDouble(st.nextToken().trim());
        suppliesSold = Double.parseDouble(st.nextToken().trim());
        paperSold = Double.parseDouble(st.nextToken().trim());
        contact   = st.nextToken().trim();
        district  = st.nextToken().trim();
       
        
       
        SalesRep s = new SalesRep();
        
        s.setFirstName(firstName);
        s.setLastName(lastName);
        s.setRepID(repID);
        s.setBooksSold(booksSold);
        s.setSuppliesSold(suppliesSold);
        s.setPaperSold(paperSold);
        s.setContact(contact);
        s.setDistrict(district);
       
        return s;
        
        
    }
}
