/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ortega;

import java.util.Scanner;

/**
 *
 * @author SCC-COLLEGE
 */
public class Sale {
      public void getSales(){
        Scanner input = new Scanner(System.in);
        Sales sls = new Sales();
        
        System.out.println("Running Sales Program:\n");
        System.out.print("Enter Customer name: ");
        String CNAME = input.nextLine();
        System.out.print("Enter Product Name: ");
        String PNAME = input.nextLine();
        System.out.print("Enter Quantity: ");
        int QTY = input.nextInt();
        System.out.print("Enter Price: ");
        int PRICE = input.nextInt();
        System.out.print("Enter Cash: ");
        int CASH = input.nextInt();
        
        sls.addSales(CNAME, PNAME, QTY, PRICE, CASH);
        sls.viewSales();
    }

}

