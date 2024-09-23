/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ortega;

/**
 *
 * @author SCC-COLLEGE
 */
public class Sales {
        String C_NAME, P_NAME;
    int QUANTITY, PRICE, CASH;
  
    public void addSales(String cname, String pname, int quantity, int price, int cash){
        this.C_NAME = cname;
        this.P_NAME = pname;
        this.QUANTITY = quantity;
        this.PRICE = price;
        this.CASH = cash;
    }
    
    public void viewSales(){
        System.out.println("\n---------------------------");
        System.out.println("RECEIPT:");
        System.out.println("---------------------------");
        System.out.println("Name: "+C_NAME);
        System.out.println("\nItem Name: "+P_NAME);
        System.out.println("Quantity: "+QUANTITY);
        System.out.println("---------------------------");
        System.out.println("Total Due: "+(PRICE*QUANTITY)+".00");
        System.out.println("Cash: "+CASH+".00");
        System.out.println("---------------------------");
        System.out.println("Change: "+(CASH-(PRICE*QUANTITY))+".00");
    }
}

