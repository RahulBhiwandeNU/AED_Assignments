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
public class BankingCheckingInfo {
    
    private String CheckingAccountNumber;
    private String checkingBalance;

    /**
     * @return the CheckingAccountNumber
     */
    public String getCheckingAccountNumber() {
        return CheckingAccountNumber;
    }

    /**
     * @param CheckingAccountNumber the CheckingAccountNumber to set
     */
    public void setCheckingAccountNumber(String CheckingAccountNumber) {
        this.CheckingAccountNumber = CheckingAccountNumber;
    }

    /**
     * @return the checkingBalance
     */
    public String getCheckingBalance() {
        return checkingBalance;
    }

    /**
     * @param checkingBalance the checkingBalance to set
     */
    public void setCheckingBalance(String checkingBalance) {
        this.checkingBalance = checkingBalance;
    }  
}
