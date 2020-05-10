/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utkarsh.autoboxingandunboxingchallengebank;

/**
 *
 * @author Utkarsh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bank bank =new Bank("SBI");
        bank.addBranch("Mehsana");
        bank.addBranch("Baroda");
        bank.addCustomerToBranch("Mehsana", "Utkarsh", 123.33);
        bank.addCustomerToBranch("Mehsana", "Manish", 600.00);
        bank.addCustomerToBranch("Mehsana","Alpa" , 1000.9);
        
        bank.addCustomerToBranch("Baroda", "Vivn", 12345);
        bank.addCustomerToBranch("Baroda", "Shrenik", 3242);
        bank.addCustomerToBranch("Baroda", "Pooja", 544); 
        
        bank.addCustomerTransaction("Mehsana", "Utkarsh", 123);
        
        bank.listCustomers("Mehsana", true );
        bank.listCustomers("Baroda", true);
        
    }
    
}
