package object_oriented_design_paterns.oodp;

import java.util.ArrayList;


public class Company implements CompanyInterface{

    //variables that the company must have 
    private String name;
    private double companyCredit = 0;
    private double totalDeliveryExpenses = 0;
    
    //this variable will determine the profit made
    private int profit;
    
    //transactions before and after trading
    private int creditBeforeTrade;  
    private int creditAfterTrade;
    
    //here we will have all the products available
    private int totalProductsBuyInA=0;
    private int totalProductsBuyInB=0;
    private int totalProductsBuyInC=0;
    
    //here we will put the operations inside a list
    private ArrayList<DepotInterface> arrayListDepots; 
    private ArrayList<Transaction> listOfShopings= new ArrayList<>(); 
    
    //all the options available
    private int totalSpendInA=0;
    private int totalSpendInB=0;
    private int totalSpendInC=0;
    private int totalSpendDeliverA=0;
    private int totalSpendDeliverB=0;
    private int totalSpendDeliverC=0;
    
   //
   public Company(String name, ArrayList<DepotInterface> list){

       this.name = name;
       this.arrayListDepots=list;

       //determining the credit
       setcreditBeforeTrade(); 

   }

 /**
 * Returns an ArrayList of the depots inside acompany
 * @return arrayListDepots (depots inside a company)
 */
   @Override
   public ArrayList<DepotInterface> getarrayListDepots() {
        return arrayListDepots;
    }

   /**
   * Returns the name of the company
   * @return name (company name)
   */
    @Override
    public String getCompanyName() {
        return this.name;
    }

    /**
 * Returns the company Credit
 * @return companyCredit (company's money)
 */
    @Override
    public double getCompanyCredit() {
        return this.companyCredit;
    }

/**
 * Returns the total expenses per company  in delivery from every depot
 * @return totalDeliveryExpenses (total sum)
 */
    @Override
    public double getTotalDeliveryExpenses() {
        return this.totalDeliveryExpenses;
    }

    /**
     * Assigns value to company Credit
     * @param companyCredit (company's money)
     */
    public void setcompanyCredit(double companyCredit) {
        this.companyCredit = companyCredit;
    }

    /**
     * Determines the total expenses per company  in delivery from every depot
     * @param totalDeliveryExpenses (total sum)
     */
    public void setTotalDeliveryExpenses(double totalDeliveryExpenses) {
        this.totalDeliveryExpenses = totalDeliveryExpenses;
    }

    /**
     * Returns an ArrayList with the transactions made by the company
     * @return listOfShopings (Transactions on an ArrayList format)
     */
    @Override
     public ArrayList<Transaction> getlistOfShopings() {
        return listOfShopings;
    }

   
    @Override
    public void addlistOfShopings(ArrayList<Transaction> listOfShopings) {
        this.listOfShopings.addAll(listOfShopings);
    }

    /**
     * set the creditBefore the trade
     */
    @Override
    public void setcreditBeforeTrade() { 

       for(DepotInterface eachdepotinterfaceitem: arrayListDepots){
           this.creditBeforeTrade += eachdepotinterfaceitem.getdepotCash();
       }

    }


    /**
     * set credit after the transactions are done
     */
    @Override
    public void setCreditAfterTrade() { 
        for(DepotInterface eachdepotinterfaceitem: arrayListDepots){
           this.creditAfterTrade += eachdepotinterfaceitem.getdepotCash();
       }
    }



    /**
     *
     * @return creditBeforeTrade  
     */
    @Override
    public int getcreditBeforeTrade() {
        return creditBeforeTrade;
    }

    /**
     * 
     * @return totalProductsBuyInA products bought on A as trader
     */
    @Override
    public int getTotalProductsBuyInA() {
        return totalProductsBuyInA;
    }

    
    @Override
    public void increaseTotalProductsBuyInA(int addProductsBuyInA) {
        this.totalProductsBuyInA += addProductsBuyInA;
    }

    /**
     * 
     * @return totalProductsBuyInB products bought on B as trader
     */
    @Override
    public int getTotalProductsBuyInB() {
        return totalProductsBuyInB;
    }

    /**
     * Alters the number of products buy from B
     * @param addProductsBuyInB coming from the Facade
     */
    @Override
    public void increaseTotalProductsBuyInB(int addProductsBuyInB) {
        this.totalProductsBuyInB += addProductsBuyInB;
    }

    /**
     * 
     * @return totalProductsBuyInC products bought on A as trader
     */
    @Override
    public int getTotalProductsBuyInC() {
        return totalProductsBuyInC;
    }

    
    @Override
    public void increaseTotalProductsBuyInC(int addProductsBuyInC) {
        this.totalProductsBuyInC += addProductsBuyInC;
    }
    
    // get total spend in a
    @Override
    public int getTotalSpendInA() {
        return totalSpendInA;
    }

    
    @Override
    public void increaseTotalSpendInA(int totalSpendInA) {
        this.totalSpendInA += totalSpendInA;
    }

    // get total spend in b 
    @Override
    public int getTotalSpendInB() {
        return totalSpendInB;
    }

   
    @Override
    public void increaseTotalSpendInB(int totalSpendInB) {
        this.totalSpendInB += totalSpendInB;
    }

    // ge total spend in C
    @Override
    public int getTotalSpendInC() {
        return totalSpendInC;
    }

   
    @Override
    public void increaseTotalSpendInC(int totalSpendInC) {
        this.totalSpendInC += totalSpendInC;
    }

    
    @Override
    public int getTotalSpendDeliverA() {
        return totalSpendDeliverA;
    }

    
    @Override
    public void increaseTotalSpendDeliverA(int totalSpendDeliverA) {
        this.totalSpendDeliverA += totalSpendDeliverA;
    }

    // get total spend in delivery cost in b 
    @Override
    public int getTotalSpendDeliverB() {
        return totalSpendDeliverB;
    }

   
    @Override
    public void increaseTotalSpendDeliverB(int totalSpendDeliverB) {
        this.totalSpendDeliverB += totalSpendDeliverB;
    }

    // get total spenddeliver cost in c
    @Override
    public int getTotalSpendDeliverC() {
        return totalSpendDeliverC;
    }

   
    @Override
    public void increaseTotalSpendDeliverC(int totalSpendDeliverC) {
        this.totalSpendDeliverC += totalSpendDeliverC;
    }
    
    
    // get credit after trade 
    @Override
    public int getCreditAfterTrade() {
        return creditAfterTrade;
    }
    // get profit
    @Override
    public int getProfit() {
        calculateProfit();
        return profit;
    }

    // calcualte the value of the profit for the bussines 
    @Override
    public void calculateProfit() {
        this.profit = creditAfterTrade-creditBeforeTrade;
    }

}