/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class UserTransaction implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long transNum;
    private double amount;
    private String accountType;
    private String type;
    @ManyToOne
    private Account account;
    

    public UserTransaction() {
    }

    public UserTransaction(double amount, String accountType, String type, Account account) {
        this.amount = amount;
        this.account = account;
        this.type = type;
    }
    
    
    public Long getTransNum() {
        return transNum;
    }
    
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

 
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}