import it.si3p.supwsd.SupWSD;
import it.si3p.supwsd.data.SupInventory;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import it.si3p.supwsd.SupException;
import it.si3p.supwsd.SupResult;
import it.si3p.supwsd.SupSense;


public class test {
	
	
   public static void main(String[] args) throws IOException, SupException {
	   
	   String csvFile = "C:\\Users\\agrah\\Dropbox\\Downloads\\table2.txt";
       BufferedReader br = null;
       String line = "";
       String cvsSplitBy = ";";
       PrintWriter writer = null;
//       SupWSD sWSD = SupWSD.getInstance();
       String s= null;
       br = new BufferedReader(new FileReader(csvFile));
       File file = new File("C:\\Users\\agrah\\Dropbox\\Intelligent System\\Text Analytics\\Text_Analytics\\result1.txt");
		writer = new PrintWriter(new FileWriter(file));
		SupWSD sWSD = SupWSD.getInstance();
       while ((line = br.readLine()) != null) {

           // use comma as separator
    	   
           String[] sentence = line.split(cvsSplitBy);
           if (sentence[1].contains(sentence[0])) {
        	   
        	   s = sentence[1];
        	   String s1=s.replace(sentence[0], "<SENSE>"+sentence[0]+"<SENSE>");
        	   List<SupSense> sSenses = sWSD.getSenses(s1,false ,SupInventory.WN);	
        	   writer.println(sentence[0]+";"+s1+";"+sSenses.get(0)+";"+sentence[3]);
        	   System.out.println(sentence[0]+";"+sentence[1]+";"+sSenses.get(0)+";"+sentence[3]);
        	   
           }
          
       }
       writer.close();
	   
//	   
//	   
//	   List<SupSense> sSenses = sWSD.getSenses("he was asked to fill out a <SENSE>form<SENSE>",false ,SupInventory.WN);
//
//	   System.out.println(sSenses);
	   
//	   String text = "he was asked to fill out a <SENSE>form<SENSE>";
//		SupWSD swsd = SupWSD.getInstance();
//		for (SupSense sense : swsd.getSenses(text,true)) {
//			System.out.println("Word: " + sense.getWord() + "\tLemma: " + sense.getLemma() + "\tPOS: " + sense.getPOS());
//			for (SupResult result : sense.getResults()) {
//				System.out.println("SenseKey " + result.getKey() + "\tProbability: " + result.getProbability());
//			}
//		}
	}	
}
	


