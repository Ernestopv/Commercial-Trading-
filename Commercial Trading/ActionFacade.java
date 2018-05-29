package object_oriented_design_paterns.oodp;

import java.util.ArrayList;


public class ActionFacade  {

	//variables
    ArrayList<CompanyInterface> companies;
    ReportGenerated reportComp;
    

  
    public ActionFacade(ReportGenerated reportComp) {
        
        this.reportComp=reportComp;
        
        
        //the CompanyFactory creates three companies with depots and products 
        CompanyFactory compa = new CompanyFactory();
    
  
        this.companies= compa.getCompany();
        
        // the trader receives the ArrayList of depots of each company
        Trader newTrader = new Trader(companies.get(0).getarrayListDepots(),companies.get(1).getarrayListDepots(),companies.get(2).getarrayListDepots());
        newTrader.MerkantActionA();
        newTrader.MerkantActionC();
        newTrader.MerkantActionB();
        
        
       
        for(CompanyInterface eachComp : companies){
            eachComp.setCreditAfterTrade();;
            eachComp.calculateProfit();;
            //collecting the transaction of all depots
            for(DepotInterface  eachDepot: eachComp.getarrayListDepots()){
                eachComp.addlistOfShopings(eachDepot.getlistOfShopings());
            }
            //collecting information for the report 
            for (Transaction eachTran  : eachComp.getlistOfShopings()){
                switch (eachTran.productTrade) {
                    case "A":
                        eachComp.increaseTotalSpendInA(eachTran.productPrice);
                        eachComp.increaseTotalSpendDeliverA(eachTran.deliveryCost);
                        eachComp.increaseTotalProductsBuyInA(1);
                        break;
                    case "B":
                        eachComp.increaseTotalSpendInB(eachTran.productPrice);
                        eachComp.increaseTotalSpendDeliverB(eachTran.deliveryCost);
                        eachComp.increaseTotalProductsBuyInB(1);
                        break;
                    default:
                        eachComp.increaseTotalSpendInC(eachTran.productPrice);
                        eachComp.increaseTotalSpendDeliverC(eachTran.deliveryCost);
                        eachComp.increaseTotalProductsBuyInC(1);
                        break;
                }
            }
        }
        
    }
  

 
    public void SelectCompany(String CompanySelected) {
        if(null != CompanySelected)switch (CompanySelected) {
            case "a":
                reportComp.PrintReport(companies.get(0));
                break;
                
            case "b":
                reportComp.PrintReport(companies.get(1));
                break;
                
            case "c":
                reportComp.PrintReport(companies.get(2));
                break;
        }}
        
        
        public void SelectAnyCompanyToprintGeneral(String CompanySelected) {
            if(null != CompanySelected)switch (CompanySelected) {
                case "a":
                    reportComp.printGeneralreport(companies.get(0));
                    break;
                    
                case "b":
                    reportComp.printGeneralreport(companies.get(1));
                    break;
                    
                case "c":
                    reportComp.printGeneralreport(companies.get(2));
                    break;
            }
        
    }

   
    
    
    
}