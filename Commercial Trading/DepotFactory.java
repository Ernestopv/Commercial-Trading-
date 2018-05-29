package object_oriented_design_paterns.oodp;

import java.util.ArrayList;
import java.util.Random;



public class DepotFactory {
    int mindeliveryCost=1;
    int maxdeliveryCost=10;
    int minCash = 50;
    int maxCash =100;

    /**
     * Method that calls the creator of companies and assigns the boolean arguments depend on which company it belongs to
     * @param belongsTo (company the depot belongs to)
     * @return createDepots() method
     */
    public  ArrayList<DepotInterface> getDepot(String belongsTo){
        
       //depending on the selection made by the user the company that it will show
    	if("A".equalsIgnoreCase(belongsTo)){

            return createDepots(true,false,false);

        }if("B".equalsIgnoreCase(belongsTo)){

            return createDepots(false,true,false);

        }if("C".equalsIgnoreCase(belongsTo)){

            return createDepots(false,false,true);
        }

        return null;

    }

    /**
     * This method receives the sets from the previous method and instantiates the depot factory to create the depots
     * Returns a list of depots added
     * @param set1 (boolean)
     * @param set2 (boolean)
     * @param set3 (boolean)
     * @return list (ArrayList)
     */
    public ArrayList<DepotInterface> createDepots(boolean set1, boolean set2,boolean set3){
        //creating a list of depots and instance for the products factory
        ArrayList<DepotInterface> list = new ArrayList<>();
        ProductFactory factory = new ProductFactory();

        //creating the depot and assigning ramdom values for each
        for(int i=1;i<=100;i++){
            list.add(new Depot(i,factory.getProduct("A",set1),factory.getProduct("B",set2),factory.getProduct("C",set3),getRandom(maxdeliveryCost,mindeliveryCost),getRandom(maxCash,minCash)));

        }
        return list;
    }

    /**
     * Generates random number inside the function
     * @param max (created randomly)
     * @param min (created randomly)
     * @return randNumber (within the range stated)
     */
    public static int getRandom(int max, int min){
       
    	//Generation of the random number within the limits
        Random rand = new Random();
        return   rand.nextInt((max-min)+1)+min;
    }



}