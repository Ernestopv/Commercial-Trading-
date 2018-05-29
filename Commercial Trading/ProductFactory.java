package object_oriented_design_paterns.oodp;

import java.util.ArrayList;
import java.util.Random;



public class ProductFactory {


    static int maxPrice = 10;
    static int minPrice = 1;
    static int maxProducOwner =50;
    static int minProducOwner =15;
    static int minProducOthers =3;
    static int maxProducOthers =40;


  
    public ArrayList<Products> getProduct(String productName,boolean owner){
        ArrayList<Products> listOfProductsX = new ArrayList<>();
        int numberOfProducts=0;

        //Here is where it differenciates between the products made by the company and the other not made by the company
        switch(productName){
               case "A":
                   if(owner){
                       numberOfProducts=getRandom(maxProducOwner,minProducOwner);
                   }else{
                       numberOfProducts=getRandom(maxProducOthers,minProducOthers);
                   }
                   listOfProductsX.clear();
                   listOfProductsX.addAll(createListProductsX(getRandom(maxPrice,minPrice),numberOfProducts,productName));
                   break;

                case "B":
                   if(owner){
                       numberOfProducts=getRandom(maxProducOwner,minProducOwner);
                   }else{
                       numberOfProducts=getRandom(maxProducOthers,minProducOthers);
                   }

                   listOfProductsX.clear();
                   listOfProductsX.addAll(createListProductsX(getRandom(maxPrice,minPrice),numberOfProducts,productName));
                   break;

                case "C":
                   if(owner){
                       numberOfProducts=getRandom(maxProducOwner,minProducOwner);
                   }else{
                       numberOfProducts=getRandom(maxProducOthers,minProducOthers);
                   }

                   listOfProductsX.clear();
                   listOfProductsX.addAll(createListProductsX(getRandom(maxPrice,minPrice),numberOfProducts,productName));
                   break;

           }
           return listOfProductsX;

    }
    

    /**
     * This function is performed in the function above as a creator of new lists of products 
     * Loops over the ArrayList of products and assigns a company and random product cost
     * @param cost (new product price)
     * @param numberOfProducts (amount of products)
     * @param company (what company)
     * @return list (list of products)
     */
    public static ArrayList<Products> createListProductsX(int cost, int numberOfProducts,String company) {
        //creating an arraylist of products
        ArrayList<Products> list = new ArrayList<>();
        for (int i=0;i<numberOfProducts;i++){
            list.add(new Product(cost, company));
        }
        return list;
    }

    
    /**
     * Makes random number 
     * @param max (randomly selected)
     * @param min (randomly selected)
     * @return randNumber (number selected)
     */
    public static int getRandom(int max, int min){ 

        
        Random rand = new Random();
        return   rand.nextInt((max-min)+1)+min;
    }



}