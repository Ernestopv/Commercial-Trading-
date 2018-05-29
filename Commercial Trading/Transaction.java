package object_oriented_design_paterns.oodp;

class Transaction {
    static int TransactionCounter=1;
    int transactionID;
    String buyer;
    String seller;
    String productTrade;
    int productPrice;
    int deliveryCost;



    // this class save details for every transaction done 
    public Transaction(String buyer, String seller, String productTrade, int productPrice, int deliveryCost) {
        this.transactionID=TransactionCounter;
        TransactionCounter++;
        this.buyer = buyer;
        this.seller = seller;
        this.productTrade = productTrade;
        this.productPrice = productPrice;
        this.deliveryCost = deliveryCost;
    }

  
    
}