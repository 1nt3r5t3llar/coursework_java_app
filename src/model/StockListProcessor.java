package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class StockListProcessor  {
	
	private String productCode;
	private String description;
	private int unitPrice;
	private ArrayList<Product> stock;

	public StockListProcessor() {
		stock = new ArrayList<Product>();
	}
	
	public void StockListScanner() throws FileNotFoundException  {
		
        Scanner sc = new Scanner(new File("StockList.txt"));
        sc.useDelimiter("[<>\r\n]+");

        productCode = sc.next();           
       
        while (!productCode.equals("end") ) {     
        	description = sc.next();        
        	unitPrice = sc.nextInt();
        	stock.add(new Product(productCode, description, unitPrice));
        	productCode = sc.next();              
        }
        
        sc.close();
	}
	
	public void StockListWriter() {
	
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("StockList.txt"))) {

			for (Product o : stock) {
				oos.writeObject(o);
			}
				oos.writeObject(null);

				oos.flush();
		}
		catch (IOException e){
			e.printStackTrace();
			System.out.println("Error writing");
		}
	}
	
	public ArrayList<Product> getStock() {
		return this.stock;
		
	}
}