package object_oriented_design_paterns.oodp;

import java.util.ArrayList;

public class Trader {

    ArrayList<DepotInterface> depotsA ;
    ArrayList<DepotInterface> depotsB ;
    ArrayList<DepotInterface> depotsC ;
    int minCashAllowance=50;
    
    // in this class is where the trade begins between the depots 
 
    Trader(ArrayList<DepotInterface> dA,ArrayList<DepotInterface> dB,ArrayList<DepotInterface> dC){

        this.depotsA=dA;
        this.depotsB=dB;
        this.depotsC=dC;
    }

   
    public void  MerkantActionA(){



        for(int i=0;i<depotsA.size()-1;i++){
            int counterDepot =0;
            int deliveryCost=depotsA.get(i).getdeliveryCost();
            int productPrice = depotsA.get(i).getProductsA().get(1).getPrice();
            int pricePlusDelivery= deliveryCost+productPrice;
            while(depotsA.get(i).getProductsA().size()> 16 && counterDepot<100){

                if((depotsB.get(counterDepot).getdepotCash()-minCashAllowance>pricePlusDelivery) && (depotsB.get(counterDepot).getProductsA().size()<40) ){

                    depotsB.get(counterDepot).buyProductsFromA(depotsA.get(i).sellProductsA());
                    depotsA.get(i).setDepotCredit(pricePlusDelivery);
                    depotsB.get(counterDepot).setDepotCredit(pricePlusDelivery*(-1));
                    Transaction tempTran = new Transaction("DepotB id: "+depotsB.get(counterDepot).getdepotNo(),"DepotA id: "+depotsA.get(i).getdepotNo(),"A",productPrice,deliveryCost);
                    depotsB.get(counterDepot).addTransactions(tempTran);
                    depotsA.get(i).addTransactions(tempTran);
                   

                
                }

                if((depotsC.get(counterDepot).getdepotCash()-minCashAllowance>pricePlusDelivery) && (depotsC.get(counterDepot).getProductsA().size()<40) ){

                    depotsC.get(counterDepot).buyProductsFromA(depotsA.get(i).sellProductsA());
                    depotsA.get(i).setDepotCredit(pricePlusDelivery);
                    depotsC.get(counterDepot).setDepotCredit(pricePlusDelivery*(-1));
                    Transaction tempTran = new Transaction("DepotC id: "+depotsC.get(counterDepot).getdepotNo(),"DepotA id: "+depotsA.get(i).getdepotNo(),"A",productPrice,deliveryCost);
                    depotsC.get(counterDepot).addTransactions(tempTran);
                    depotsA.get(i).addTransactions(tempTran);
              


                }
                counterDepot++;
            }
        }
    }

   
    public void  MerkantActionB(){


        for(int i=0;i<depotsB.size()-1;i++){
           int counterDepot =0;
           int deliveryCost=depotsB.get(i).getdeliveryCost();
           int productPrice=depotsB.get(i).getProductsB().get(1).getPrice();
           int pricePlusDelivery= deliveryCost+productPrice;

            while(depotsB.get(i).getProductsB().size()> 16 && counterDepot<100){

                if((depotsA.get(counterDepot).getdepotCash()-minCashAllowance>pricePlusDelivery) && (depotsA.get(counterDepot).getProductsB().size()<40) ){

                    depotsA.get(counterDepot).buyProductsFromB(depotsB.get(i).sellProductsB());
                    depotsB.get(i).setDepotCredit(pricePlusDelivery);
                    depotsA.get(counterDepot).setDepotCredit(pricePlusDelivery*(-1));

                    Transaction tempTran = new Transaction("DepotA id: "+depotsA.get(counterDepot).getdepotNo(),"DepotB id: "+depotsB.get(i).getdepotNo(),"B",productPrice,deliveryCost);
                    depotsA.get(counterDepot).addTransactions(tempTran);
                    depotsB.get(i).addTransactions(tempTran);
                    



                }

                if((depotsC.get(counterDepot).getdepotCash()-minCashAllowance>pricePlusDelivery) && (depotsC.get(counterDepot).getProductsB().size()<40) ){

                    depotsC.get(counterDepot).buyProductsFromB(depotsB.get(i).sellProductsB());
                    depotsB.get(i).setDepotCredit(pricePlusDelivery);
                    depotsC.get(counterDepot).setDepotCredit(pricePlusDelivery*(-1));

                    Transaction tempTran = new Transaction("DepotC id: "+depotsC.get(counterDepot).getdepotNo(),"DepotB id: "+depotsB.get(i).getdepotNo(),"B",productPrice,deliveryCost);
                    depotsB.get(counterDepot).addTransactions(tempTran);
                    depotsC.get(i).addTransactions(tempTran);
                   



                }
                counterDepot++;
            }
        }
    }

    public void  MerkantActionC(){


        for(int i=0;i<depotsC.size()-1;i++){
            int counterDepot =0;

            int deliveryCost=depotsC.get(i).getdeliveryCost();
            int productPrice=depotsC.get(i).getProductsB().get(1).getPrice();
            int pricePlusDelivery= deliveryCost+productPrice;


            while(depotsC.get(i).getProductsC().size()> 16 && counterDepot<100){

                if((depotsA.get(counterDepot).getdepotCash()-minCashAllowance>pricePlusDelivery) && (depotsA.get(counterDepot).getProductsC().size()<40) ){

                    depotsA.get(counterDepot).buyProductsFromC(depotsC.get(i).sellProductsC());
                    depotsC.get(i).setDepotCredit(pricePlusDelivery);
                    depotsA.get(counterDepot).setDepotCredit(pricePlusDelivery*(-1));

                    Transaction tempTran = new Transaction("DepotA id: "+depotsA.get(counterDepot).getdepotNo(),"DepotC id: "+depotsC.get(i).getdepotNo(),"C",productPrice,deliveryCost);
                    depotsA.get(counterDepot).addTransactions(tempTran);
                    depotsC.get(i).addTransactions(tempTran);
                    
                    
                }

                if((depotsB.get(counterDepot).getdepotCash()-minCashAllowance>pricePlusDelivery) && (depotsB.get(counterDepot).getProductsC().size()<40) ){

                    depotsB.get(counterDepot).buyProductsFromC(depotsC.get(i).sellProductsC());
                    depotsC.get(i).setDepotCredit(pricePlusDelivery);
                    depotsB.get(counterDepot).setDepotCredit(pricePlusDelivery*(-1));


                    Transaction tempTran = new Transaction("DepotB id: "+depotsB.get(counterDepot).getdepotNo(),"DepotC id: "+depotsC.get(i).getdepotNo(),"C",productPrice,deliveryCost);
                    depotsB.get(counterDepot).addTransactions(tempTran);
                    depotsC.get(i).addTransactions(tempTran);
                    

                }
                counterDepot++;
            }

        }
    }
}