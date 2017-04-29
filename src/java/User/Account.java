/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Account implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accountID;
    private String accountType;
    private double startingBal;
    @ManyToOne
    private User accountOwner;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<TransactionServlet> transactions;

    public Account() {
    }

    public Account(String accountType, double startingBal, User accountOwner) {
        this.accountType = accountType;
        this.startingBal = startingBal;
        this.accountOwner = accountOwner;
    }
    
    public void addTransaction(TransactionServlet trans){
        transactions.add(trans);
    }  
    
    public void Credit(double amount) {
        this.startingBal += amount;
    }

    public void Debit(double amount) {
        this.startingBal -= amount;
    }

    public Long getAccountID() {
        return accountID;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getStartingBal() {
        return startingBal;
    }

    public User getAccountOwner() {
        return accountOwner;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setStartingBal(double startingBal) {
        this.startingBal = startingBal;
    }

    public List<TransactionServlet> getTransactions() {
        return transactions;
    }

    
 
    @Override
    public String toString() {
        return "Account{" + "accountType=" + accountType + ", startingBal=" + startingBal + ", accountOwner=" + accountOwner + '}';
    }

}
