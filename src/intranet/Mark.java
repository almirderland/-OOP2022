package intranet;

import java.io.Serializable;

/**
* @generated
*/
public class Mark implements Serializable {
    
    private Double totalGrade;
    private Double firstAtt;
    private Double secondAtt;
    private Double finalGrade;

    public Mark(){

    }

    public Mark(Double firstAtt, Double secondAtt, Double finalGrade) {
        this.totalGrade = firstAtt + secondAtt + finalGrade;
        this.firstAtt = firstAtt;
        this.secondAtt = secondAtt;
        this.finalGrade = finalGrade;
    }

    public Double getTotalGrade() {
        return this.totalGrade;
    }

    public void setTotalGrade(Double totalGrade) {
        this.totalGrade = totalGrade;
    }

    public Double getFirstAtt() {
        return this.firstAtt;
    }

    public void setFirstAtt(Double firstAtt) {
        this.firstAtt = firstAtt;
    }

    public Double getSecondAtt() {
        return this.secondAtt;
    }

    public void setSecondAtt(Double secondAtt) {
        this.secondAtt = secondAtt;
    }

    public Double getFinalGrade() {
        return this.finalGrade;
    }

    public void setFinalGrade(Double finalGrade) {
        this.finalGrade = finalGrade;
    }
    

    

    //                          Operations                                  
    
    /**
    * @generated
    */
    public String convertToLetter() {
        if (totalGrade >= 95 && totalGrade <= 100) 
            return Grade.A.toString();
            if (totalGrade >= 90) 
                return Grade.A_MINUS.toString();
            if (totalGrade >= 85) 
                return Grade.B_PLUS.toString();
            if (totalGrade >= 80) 
                return Grade.B.toString();
            if (totalGrade >= 75) 
                return Grade.B_MINUS.toString();
            if (totalGrade >= 70) 
                return Grade.C_PLUS.toString();
            if (totalGrade >= 65) 
                return Grade.C.toString();
            if (totalGrade >= 60) 
                return Grade.C_MINUS.toString();
            if (totalGrade >= 55) 
                return  Grade.D_PLUS.toString();
            if (totalGrade >= 50) 
                return Grade.D.toString();
            else
                return Grade.F.toString();
    }
    /**
    * @generated
    */
    public String convertToGPA() {
        if (totalGrade >= 95 && totalGrade <= 100) 
            return "4.0"; 
            if (totalGrade >= 90) 
                return "3.67"; 
            if (totalGrade >= 85) 
                return "3.33"; 
            if (totalGrade >= 80) 
                return "3.0"; 
            if (totalGrade >= 75) 
                return "2.67"; 
            if (totalGrade >= 70) 
                return "2.33"; 
            if (totalGrade >= 65) 
                return "2.0"; 
            if (totalGrade >= 60) 
                return "1.67"; 
            if (totalGrade >= 55) 
                return "1.33"; 
            if (totalGrade >= 50) 
                return "1.00"; 
            else  
                return "0.0";
        
    }
    
}
