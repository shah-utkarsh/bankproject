/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utkarsh.autoboxingandunboxingchallengebank;


import java.util.ArrayList;
public class Customer {
    private String customerName;
    ArrayList<Double> transactions;

    public Customer(String customerName, double initialAmount) {
        this.customerName = customerName;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }
    
    public void addTransaction(double amount){
        this.transactions.add(amount);
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
    
    public void printTransactions(String name){
        for(int i=0; i<transactions.size() ; i++){
            System.out.println((i+1) +  ". " + transactions.get(i));
        }
    }
    
}
