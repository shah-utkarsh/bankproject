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
import java.util.ArrayList;
public class Branch {
    private String branchName;
    private ArrayList<Customer> customers;
    
    public Branch(String name){
        this.branchName = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    
    
    public boolean newCustomer(String customerName, double amount){
        if(findCustomer(customerName) == null){
            this.customers.add(new Customer(customerName,amount));
            return true; 
        }
        
        return false;
    }
    
    public boolean addCustomerTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null){
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }
    private Customer findCustomer(String searchCustomer){
        for(int i=0 ; i<customers.size() ; i++){
            if(this.customers.get(i).getCustomerName().equals(searchCustomer)){
                return this.customers.get(i);
            }
        }
        return null;
    }
    public void printTransactionsOfCustomer(){
        System.out.println(this.branchName);
        for(int i=0 ; i< customers.size() ; i++){
            System.out.println((i+1) + customers.get(i).getCustomerName());
            System.out.println("Transactions: " + customers.get(i).getTransactions());
        }
    }
}
