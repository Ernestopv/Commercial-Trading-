package object_oriented_design_paterns.oodp;

import java.util.ArrayList;


public interface DepotInterface {
    
    //Depot class interface

    
    public abstract int getdepotNo();
    public ArrayList<Products> getProductsA();
    public ArrayList<Products> getProductsB();
    public ArrayList<Products> getProductsC();
    public int getdepotCash();

   
    public void setDepotCredit(int cash);
    public int getdeliveryCost();
    public abstract Products sellProductsA();
    public abstract Products sellProductsB();
    public abstract Products sellProductsC();
    public void buyProductsFromA(Products newProduct);
    public void buyProductsFromB(Products newProduct);
    public void buyProductsFromC(Products newProduct);
    public ArrayList<Transaction> getlistOfShopings();
    public void addTransactions(Transaction newTransaction);

}