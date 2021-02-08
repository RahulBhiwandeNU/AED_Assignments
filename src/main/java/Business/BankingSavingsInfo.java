/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author kisan
 */
public class BankingSavingsInfo {
    
    private String savingsAccountNumber;
    private String savingsBalance;

    /**
     * @return the savingsAccountNumber
     */
    public String getSavingsAccountNumber() {
        return savingsAccountNumber;
    }

    /**
     * @param savingsAccountNumber the savingsAccountNumber to set
     */
    public void setSavingsAccountNumber(String savingsAccountNumber) {
        this.savingsAccountNumber = savingsAccountNumber;
    }

    /**
     * @return the savingsBalance
     */
    public String getSavingsBalance() {
        return savingsBalance;
    }

    /**
     * @param savingsBalance the savingsBalance to set
     */
    public void setSavingsBalance(String savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
}
