package org.example.Model.Loan.LoanClass;

import org.example.Model.Loan.LoanEnum.RepaymentStatus;

public class Repayment {

    //Attributes
    private int repayId;
    private int loanId;
    private int number;
    private double amount;
    private double capitalPart;
    private double interestPart;
    private RepaymentStatus status;

    // ======================
    // Constructor
    // ======================
    public Repayment(int loanId,
                     int number,
                     double amount,
                     double capitalPart,
                     double interestPart,
                     RepaymentStatus status) {

        this.loanId = loanId;
        this.number = number;
        this.amount = amount;
        this.capitalPart = capitalPart;
        this.interestPart = interestPart;
        this.status = status;
    }

    // ======================
    // Getters & Setters
    // ======================

    public int getId() {return repayId;}

    public void setId(int id) {this.repayId = id;}

    public int getLoanId() {return loanId;}

    public void setLoanId(int loanId) {this.loanId = loanId;}

    public int getNumber() {return number;}

    public void setNumber(int number) {this.number = number;}

    public double getAmount() {return amount;}

    public void setAmount(double amount) {this.amount = amount;}

    public double getCapitalPart() {return capitalPart;}

    public void setCapitalPart(double capitalPart) {this.capitalPart = capitalPart;}

    public double getInterestPart() {return interestPart;}

    public void setInterestPart(double interestPart) {this.interestPart = interestPart;}

    public RepaymentStatus getStatus() {return status;}

    public void setStatus(RepaymentStatus status) {this.status = status;}

    // ======================
    // toString
    // ======================

    @Override
    public String toString() {
        return "Repayment{" +
                "id=" + repayId +
                ", loanId=" + loanId +
                ", number=" + number +
                ", amount=" + amount +
                ", capitalPart=" + capitalPart +
                ", interestPart=" + interestPart +
                ", status=" + status +
                '}';
    }
}
