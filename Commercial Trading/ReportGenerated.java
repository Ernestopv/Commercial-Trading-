package object_oriented_design_paterns.oodp;

public class ReportGenerated {

    /**
     * Brings individual report by company
     * @param company (company selected)
     */
    public void PrintReport(CompanyInterface company){
    	for(Transaction transacciones : company.getlistOfShopings()){
    		
    		System.out.println("===================================================");
    		System.out.println("Transaction number: "+transacciones.transactionID);
            System.out.println("Product Price: "+transacciones.productPrice);
            System.out.println("product  description:"+transacciones.productTrade);
            System.out.println("Seller:"+transacciones.seller);
            System.out.println("===================================================");
}
       
        // determining which copmany to show
        System.out.println("$$$$$$$$$$$$$$$$  Company"+ company.getCompanyName() +"   $$$$$$$$$$$$$$$$$$$");
        switch(company.getCompanyName()){
            case("A"):
                System.out.println("--  B pieces  purchased: " + company.getTotalProductsBuyInB()+ " Total cost " + company.getTotalSpendInB()+" Total cost for Delivery " + company.getTotalSpendDeliverB());
                System.out.println("-- Total amount of products C purchased: " + company.getTotalProductsBuyInC()+ " Total cost " + company.getTotalSpendInC()+" Total cost for Delivery " + company.getTotalSpendDeliverC());
                break;
            case("B"):
                System.out.println("--  A pieces purchased: " + company.getTotalProductsBuyInA()+ " Total cost " + company.getTotalSpendInA()+" Total cost for Delivery " + company.getTotalSpendDeliverA());
                System.out.println("-- Total amount of products C purchased: " + company.getTotalProductsBuyInC()+ " Total cost " + company.getTotalSpendInC()+" Total cost for Delivery " + company.getTotalSpendDeliverC());
                break;
            case("C"):
                System.out.println("--  A pieces purchased: " + company.getTotalProductsBuyInA()+ " Total cost " + company.getTotalSpendInA()+" Total cost for Delivery " + company.getTotalSpendDeliverA());
                System.out.println("-- Total amount of products B purchased: " + company.getTotalProductsBuyInB()+ " Total cost " + company.getTotalSpendInB()+" Total cost for Delivery " + company.getTotalSpendDeliverB());
                break;
        }
        
        System.out.println("|-- Balance before spend "+company.getcreditBeforeTrade()+ " Balance after spend "+company.getCreditAfterTrade());
   
    }
    
    //getting all the companies
    public void printGeneralreport(CompanyInterface company) {
    	
    	
    	 System.out.println("$$$$$$$$$$$$$$$$  Company"+ company.getCompanyName() +"   $$$$$$$$$$$$$$$$$$$");
         switch(company.getCompanyName()){
             case("A"):
                 System.out.println("--  B pieces  purchased: " + company.getTotalProductsBuyInB()+ " Total cost " + company.getTotalSpendInB()+" Total cost for Delivery " + company.getTotalSpendDeliverB());
                 System.out.println("-- Total amount of products C purchased: " + company.getTotalProductsBuyInC()+ " Total cost " + company.getTotalSpendInC()+" Total cost for Delivery " + company.getTotalSpendDeliverC());
                 break;
             case("B"):
                 System.out.println("--  A pieces purchased: " + company.getTotalProductsBuyInA()+ " Total cost " + company.getTotalSpendInA()+" Total cost for Delivery " + company.getTotalSpendDeliverA());
                 System.out.println("-- Total amount of products C purchased: " + company.getTotalProductsBuyInC()+ " Total cost " + company.getTotalSpendInC()+" Total cost for Delivery " + company.getTotalSpendDeliverC());
                 break;
             case("C"):
                 System.out.println("--  A pieces purchased: " + company.getTotalProductsBuyInA()+ " Total cost " + company.getTotalSpendInA()+" Total cost for Delivery " + company.getTotalSpendDeliverA());
                 System.out.println("-- Total amount of products B purchased: " + company.getTotalProductsBuyInB()+ " Total cost " + company.getTotalSpendInB()+" Total cost for Delivery " + company.getTotalSpendDeliverB());
                 break;
         }
         
         System.out.println("|-- Balance before spend "+company.getcreditBeforeTrade()+ " Balance after spend "+company.getCreditAfterTrade());
    	
    }
    
    
    
}