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
public class Bank {
    private String name;
    private ArrayList<Branch> branches;
    
    public Bank(String name){
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }
    
    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }
    
    public boolean addCustomerToBranch(String branchName,String customerName , double initialAmount){
        Branch existingBranch = findBranch(branchName);
        if(existingBranch != null){
            return existingBranch.newCustomer(customerName, initialAmount);
        }
        
        return false;
    }
    
    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch existingBranch = findBranch(branchName);
        if(existingBranch != null){
            return existingBranch.addCustomerTransaction(customerName, amount);
        }
        return false;
       
    }
    
    private Branch findBranch(String branchSearchName){
        for(int i=0 ; i<branches.size() ; i++){
            if(branches.get(i).getBranchName().equals(branchSearchName)){
                return branches.get(i);
            }
        }
        return null;
    }
    
    public boolean listCustomers(String branchName ,boolean showTransactions){
        Branch branch = findBranch(branchName);
        if(branch != null){
            System.out.println("Customers details for " + branch.getBranchName() + " branch." );
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for(int i=0 ; i< branchCustomers.size() ; i++){
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getCustomerName() + "[" + (i+1) + "]") ;
                if(showTransactions){
                    System.out.println("Transactions: ");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for(int j=0 ; j<transactions.size() ; j++){
                        System.out.println("[" + (j+1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        }else{
            return false;
        }
    }
}
