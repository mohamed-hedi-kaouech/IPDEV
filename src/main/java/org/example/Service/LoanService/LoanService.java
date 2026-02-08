package org.example.Service.LoanService;

import org.example.Interfaces.InterfaceGblobal;
import org.example.Model.Loan.LoanClass.Loan;
import org.example.Model.Loan.LoanEnum.LoanStatus;
import org.example.Utils.MaConnexion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LoanService implements InterfaceGblobal<Loan> {

    Connection cnx = MaConnexion.getInstance().getCnx();

    // ======================
    // CREATE (ADD)
    // ======================
    @Override
    public void add(Loan loan) {

        String req = "INSERT INTO `loan` " +
                "(`amount`, `duration`, `interest_rate`, `monthly_payment`, `remaining_principal`, `status`, `createdAt`) VALUES (" +
                "'" + loan.getAmount() + "'," +
                "'" + loan.getDuration() + "'," +
                "'" + loan.getInterestRate() + "'," +
                "'" + loan.getMonthlyPayment() + "'," +
                "'" + loan.getRemainingPrincipal() + "'," +
                "'" + loan.getStatus() + "'," +
                "'" + loan.getCreationDate() + "'" +
                ")";

        try {
            Statement st = cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("Loan added successfully!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    // ======================
    // DELETE
    // ======================
    @Override
    public void delete(Loan loan) {

        String req = "DELETE FROM `loan` WHERE loanId = ?";

        try {
            PreparedStatement ps = cnx.prepareStatement(req);
            ps.setInt(1, loan.getLoanId());
            ps.executeUpdate();
            System.out.println("Loan deleted successfully!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // ======================
    // UPDATE
    // ======================
    @Override
    public void update(Loan loan) {
        String req = "UPDATE `loan` SET amount = ?, duration = ?, interest_rate = ?,monthly_payment = ?,remaining_principal = ?,status = ?, createdAt = ? WHERE loanId = ?";

        try {
            PreparedStatement ps = cnx.prepareStatement(req);

            ps.setDouble(1, loan.getAmount());
            ps.setInt(2, loan.getDuration());
            ps.setDouble(3, loan.getInterestRate());
            ps.setDouble(4, loan.getMonthlyPayment());
            ps.setDouble(5, loan.getRemainingPrincipal());
            ps.setString(6, loan.getStatus().name());
            ps.setTimestamp(7, Timestamp.valueOf(loan.getCreationDate()));
            ps.setInt(8, loan.getLoanId());

            ps.executeUpdate();
            System.out.println("Loan updated successfully!");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // ======================
    // READ (GET ALL)
    // ======================
    @Override
    public List<Loan> getAll() {

        List<Loan> loans = new ArrayList<>();
        String req = "SELECT * FROM `loan`";

        try {
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(req);

            while (rs.next()) {
                Loan loan = new Loan(
                        rs.getDouble(1),
                        rs.getInt(2),
                        rs.getDouble(3),
                        rs.getDouble(4)
                );

                loan.setLoanId(rs.getInt("loanId"));
                loan.setRemainingPrincipal(rs.getDouble("remaining_principal"));
                loan.setStatus(LoanStatus.valueOf(rs.getString("status")));
                loan.setCreationDate(rs.getTimestamp("createdAt").toLocalDateTime());

                loans.add(loan);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return loans;
    }
}
