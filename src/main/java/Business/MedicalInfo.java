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
public class MedicalInfo {
    
    private String medicalRecordNumber;
    private String alergy_one;
    private String alergy_two;
    private String alergy_three;
    
    /**
     * @return the medicalRecordNumber
     */
    public String getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    /**
     * @param medicalRecordNumber the medicalRecordNumber to set
     */
    public void setMedicalRecordNumber(String medicalRecordNumber) {
        this.medicalRecordNumber = medicalRecordNumber;
    }

    /**
     * @return the alergy_one
     */
    public String getAlergy_one() {
        return alergy_one;
    }

    /**
     * @param alergy_one the alergy_one to set
     */
    public void setAlergy_one(String alergy_one) {
        this.alergy_one = alergy_one;
    }

    /**
     * @return the alergy_two
     */
    public String getAlergy_two() {
        return alergy_two;
    }

    /**
     * @param alergy_two the alergy_two to set
     */
    public void setAlergy_two(String alergy_two) {
        this.alergy_two = alergy_two;
    }

    /**
     * @return the alergy_three
     */
    public String getAlergy_three() {
        return alergy_three;
    }

    /**
     * @param alergy_three the alergy_three to set
     */
    public void setAlergy_three(String alergy_three) {
        this.alergy_three = alergy_three;
    } 
}
