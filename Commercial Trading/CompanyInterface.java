package object_oriented_design_paterns.oodp;

import java.util.ArrayList;



public interface CompanyInterface {
    
   
// this interface is for company class
    public String getCompanyName();
    public double getCompanyCredit();
    public double getTotalDeliveryExpenses();
    public ArrayList<DepotInterface> getarrayListDepots();
    public ArrayList<Transaction> getlistOfShopings();
    public void addlistOfShopings(ArrayList<Transaction> listOfShopings);
    public void setcreditBeforeTrade();
    public void setCreditAfterTrade();
    public int getcreditBeforeTrade();
    public int getCreditAfterTrade();
    public int getTotalProductsBuyInA() ;
    public void increaseTotalProductsBuyInA(int addProductsBuyInA);
    public int getTotalProductsBuyInB();
    public void increaseTotalProductsBuyInB(int addProductsBuyInB);
    public int getTotalProductsBuyInC() ;
    public void increaseTotalProductsBuyInC(int addProductsBuyInC);
     public int getTotalSpendInA();
    public void increaseTotalSpendInA(int totalSpendInA) ;
    public int getTotalSpendInB() ;
    public void increaseTotalSpendInB(int totalSpendInB) ;
    public int getTotalSpendInC();
    public void increaseTotalSpendInC(int totalSpendInC);
     public int getTotalSpendDeliverA();
    public void increaseTotalSpendDeliverA(int totalSpendDeliverA); 
    public int getTotalSpendDeliverB();
    public void increaseTotalSpendDeliverB(int totalSpendDeliverB); 
    public int getTotalSpendDeliverC();
    public void increaseTotalSpendDeliverC(int totalSpendDeliverC); 
    public int getProfit();
    public void calculateProfit();
    
    
}