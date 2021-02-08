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
public class BankingInfo {
    
    private String bankName;
    private String bankRoutingNumber;
    private BankingCheckingInfo bankingCheckingInfo;
    private BankingSavingsInfo bankingSavingsInfo;

    /**
     * @return the bankingCheckingInfo
     */
    public BankingCheckingInfo getBankingCheckingInfo() {
        return bankingCheckingInfo;
    }

    /**
     * @param bankingCheckingInfo the bankingCheckingInfo to set
     */
    public void setBankingCheckingInfo(BankingCheckingInfo bankingCheckingInfo) {
        this.bankingCheckingInfo = bankingCheckingInfo;
    }

    /**
     * @return the bankingSavingsInfo
     */
    public BankingSavingsInfo getBankingSavingsInfo() {
        return bankingSavingsInfo;
    }

    /**
     * @param bankingSavingsInfo the bankingSavingsInfo to set
     */
    public void setBankingSavingsInfo(BankingSavingsInfo bankingSavingsInfo) {
        this.bankingSavingsInfo = bankingSavingsInfo;
    }
     
    /**
     * @return the bankName
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * @param bankName the bankName to set
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * @return the bankRoutingNumber
     */
    public String getBankRoutingNumber() {
        return bankRoutingNumber;
    }

    /**
     * @param bankRoutingNumber the bankRoutingNumber to set
     */
    public void setBankRoutingNumber(String bankRoutingNumber) {
        this.bankRoutingNumber = bankRoutingNumber;
    }
}
