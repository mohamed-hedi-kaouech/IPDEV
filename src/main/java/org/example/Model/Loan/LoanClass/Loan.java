package org.example.Model.Loan.LoanClass;

import org.example.Model.Loan.LoanEnum.LoanStatus;

import java.time.LocalDateTime;

public class Loan {

    private int loanId;

    //Attributs
    private double amount;
    private int duration;               // duration in months
    private double interestRate;         // annual interest rate
    private double monthlyPayment;
    private double remainingPrincipal;
    private LoanStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    // Constructor (called AFTER eligibility check)
    public Loan(
                double amount,
                int duration,
                double interestRate,
                double monthlyPayment) {

        this.amount = amount;
        this.duration = duration;
        this.interestRate = interestRate;
        this.monthlyPayment = monthlyPayment;

        this.remainingPrincipal = amount;
        this.status = LoanStatus.PENDING;
        this.createdAt = LocalDateTime.now();
    }
    public Loan(
            int loanId,
            double amount,
            int duration,
            double interestRate,
            double monthlyPayment) {
        this.loanId= loanId;
        this.amount = amount;
        this.duration = duration;
        this.interestRate = interestRate;
        this.monthlyPayment = monthlyPayment;

        this.remainingPrincipal = amount;
        this.status = LoanStatus.PENDING;
        this.createdAt = LocalDateTime.now();
    }



    public Loan() {}

    // toString
    // ======================

    // ======================
    // Getters & Setters
    // ======================

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int id) {
        this.loanId = id;
    }
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {this.monthlyPayment = monthlyPayment;}

    public double getRemainingPrincipal() {
        return remainingPrincipal;
    }

    public void setRemainingPrincipal(double remainingPrincipal) {
        this.remainingPrincipal = remainingPrincipal;
    }

    public LoanStatus getStatus() {
        return status;
    }

    public void setStatus(LoanStatus status) {
        this.status = status;
    }

    public LocalDateTime getCreationDate() {
        return createdAt;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.createdAt = creationDate;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "id=" + loanId +
                ", amount=" + amount +
                ", duration=" + duration +
                ", interestRate=" + interestRate +
                ", monthlyPayment=" + monthlyPayment +
                ", remainingPrincipal=" + remainingPrincipal +
                ", status=" + status +
                ", creationDate=" + createdAt +
                '}';
    }
}
