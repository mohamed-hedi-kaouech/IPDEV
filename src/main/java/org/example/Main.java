package org.example;

import org.example.Interfaces.InterfaceGblobal;
import org.example.Model.Budget.Categorie;
import org.example.Model.Loan.LoanClass.Loan;
import org.example.Model.Personne;
import org.example.Model.Product.ClassProduct.Product;
import org.example.Model.Product.EnumProduct.ProductCategory;
import org.example.Service.BudgetService.BudgetService;
import org.example.Service.LoanService.LoanService;
import org.example.Model.Product.EnumProduct.SubscriptionStatus;
import org.example.Model.Product.EnumProduct.SubscriptionType;
import org.example.Service.PersonneService;
import org.example.Service.ProductService.ProductService;
import org.example.Service.ProductService.ProductSubscriptionService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Product p = new Product(ProductCategory.CARTE_DEBIT,"kaouech",1000.0);
//        Product p2 = new Product(ProductCategory.COMPTE_COURANT,"kaouech12346",1200.0);
//        ProductService ps = new ProductService();
//        ps.add(p2);
//        ps.add2(p);
//        Product p3 = new Product(3,ProductCategory.ASSURANCE_VIE,"mohamed hedi",1200.0);
//        ps.update(p3);
//        System.out.println(ps.getAll());
//        ps.delete(p3);

//        ProductSubscription PS = new ProductSubscription(1,4, SubscriptionType.TRANSACTION);
//        ProductSubscriptionService sps = new ProductSubscriptionService();
//
//        sps.add(PS);

//        PS.setSubscriptionId(10);
//        PS.setStatus(SubscriptionStatus.DRAFT);
//        PS.setType(SubscriptionType.ANNUAL);
//        sps.update(PS);

//        sps.delete(PS);


//        System.out.println(sps.getAll());
//        System.out.println(sps.getParClient(2));





//        Loan l = new Loan(12.500,4,3.5,2000);
//        LoanService ls = new LoanService();
//        ls.add(l);
//        Loan l2 = new Loan(15.500,12,5,3000);
//        ls.add(l2);
//        Loan l3 = new Loan(2,19000,12,5,3000);
//        ls.update(l3);
//        System.out.println(ls.getAll());
//        ls.delete(l2);

        Categorie c = new Categorie("Alimention",2000,600);
        BudgetService bs = new BudgetService();
        //bs.add(c);
        c.setIdCategorie(2);
        //bs.delete(c);
        c.setNomCategorie("Education");
        bs.update(c);
        System.out.println(bs.getAll());




    }
}