package object_oriented_design_paterns.oodp;

import java.util.ArrayList;



public class Depot implements DepotInterface{

    //variables determining the date the depots will have
    int depotNo;
    private ArrayList<Products> productsFromA = new ArrayList<>();
    private ArrayList<Products> productsFromB = new ArrayList<>();
    private ArrayList<Products> productsFromC = new ArrayList<>();
    private ArrayList<Transaction> listOfShopings = new ArrayList<>();
    private int depotCash;
    private final int deliveryCost;

 /**
  * Constructor of Company class
  * @param A (depots from a)
  * @param B (depots from b)
  * @param C (depots from C)
  * @param int deliveryCost (depot's delivery price)
  * @param int cash (depot cash)
 */
    Depot(int id,ArrayList<Products> A, ArrayList<Products> B,ArrayList<Products> C,int deliveryCost, int cash) {

        this.depotNo=id;
        this.productsFromA=A;
        this.productsFromB=B;
        this.productsFromC=C;
        this.deliveryCost=deliveryCost;
        this.depotCash=cash;
    }





/**
  * Returns depot if of the company
  * @return depotNo (depot name)
 */
    @Override //getters and setter for each of the class properties
    public int getdepotNo() {
        return this.depotNo;
    }

 /**
  * Adds products from company A to an ArrayList of products
  * @param Newproduct (Object)
 */
    @Override
    public void buyProductsFromA(Products Newproduct) {
        this.productsFromA.add(Newproduct);
    }

 /**
  * Adds products from company B to an ArrayList of products
  * @param Newproduct (object)
 */
    @Override
    public void buyProductsFromB(Products Newproduct) {
        this.productsFromB.add(Newproduct);
    }

  /**
  * Adds products from company C to an ArrayList of products
  * @param Newproduct (object)
 */
    @Override
    public void buyProductsFromC(Products Newproduct) {
        this.productsFromC.add(Newproduct);
    }


 /**
  * Returns a list of products from company A
  * @return productsFromA (as an ArrayList)
 */
    @Override
    public ArrayList<Products> getProductsA() {
        return this.productsFromA;
    }

 /**
  * Returns a list of products from company B
  * @return productsFromB (as an ArrayList)
 */
    @Override
    public ArrayList getProductsB() {
        return this.productsFromB;
    }

 /**
  * Returns a list of products from company C
  * @return productsFromC (as an ArrayList)
 */
    @Override
    public ArrayList getProductsC() {
        return this.productsFromC;
    }

 /**
  * Performs sale of a products from company A
  * subtract the products sold from the amount of products
  * @return List products with amount updated
 */
    @Override
    public Products sellProductsA() {
        return this.productsFromA.remove((this.productsFromA.size()-1));
    }


  /**
  * Performs sale of a products from company B
  * subtract the products sold from the amount of products
  * @return List products with amount updated
 */
    @Override
    public Products sellProductsB() {
        return this.productsFromB.remove((this.productsFromB.size()-1));
    }

 /**
  * Performs sale of a products from company C
  * subtract the products sold from the amount of products
  * @return List products with amount updated
 */
    @Override
    public Products sellProductsC() {
        return this.productsFromC.remove((this.productsFromC.size()-1));
    }


   /**
  * Updates the depot wallet that has sold a products
  * @param money (old depot cash to be updated)
 */
    @Override
    public void setDepotCredit(int cash){
        this.depotCash += cash;
    }


    /**
     * Returns the depot wallet
     * @return depotCash (depot cash)
     */
    @Override
    public int getdepotCash() {
        return this.depotCash;
    }

    /**
     * Returns delivery price of the depot
     * @return deliveryCost (depot delivery cash)
     */
    @Override
    public int getdeliveryCost() {
        return this.deliveryCost;
    }



    /**
     * Returns an ArrayList of transactions performed by that depot
     * @return listOfShopings (transactions from depot as ArrayList)
     */
    @Override
    public ArrayList<Transaction> getlistOfShopings() {
        return listOfShopings;
    }

    /**
     * Adds q new transaction to a ArrayList that hold information
     * about the depot transactions
     * @param newTransaction (new transaction to be added to the list)
     */
    @Override
    public void addTransactions(Transaction newTransaction) {
        this.listOfShopings.add(newTransaction);
    }


  




}