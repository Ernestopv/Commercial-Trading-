package object_oriented_design_paterns.oodp;

public class Product implements  Products{

    int price=0;
    final String name;

    /**
     * Constructor
     * @param price (product price)
     * @param name (product name)
     */
    public Product(int price, String name){

        this.price = price;
        this.name = name;

    }


   // name of the product 
    @Override
    public String getName() {

        return this.name;

    }

    // returns price 
    @Override
    public int getPrice() {

        return this.price;

    }


    // gives the price of every product in string 
    @Override
    public String toString(){
        return Integer.toString(this.price);
    }



}