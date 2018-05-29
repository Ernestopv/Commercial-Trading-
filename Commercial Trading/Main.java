package object_oriented_design_paterns.oodp;

import java.util.Scanner;


public class Main {
    
    public static void main (String[] args){
    	 Scanner dato=new Scanner(System.in);
    	// this with help to print the reports there are two kind of reports one with every detail of the company and the another with full detalis
        ReportGenerated reportCompany = new ReportGenerated();
        ActionFacade facade = new ActionFacade(reportCompany);
        /// starts The action!!! (trade itself)
       
     
       // select any company to print information including the depots
       System.out.println("select your company to print the report (a, b, c) or any button to print general");
       String option = dato.nextLine();
       option = option.toLowerCase();
        
       if(option.contains("a")) {
    	facade.SelectCompany("a");
       }
       else if(option.contains("b")){
    	   facade.SelectCompany("b");
    	   
       }
       else if(option.contains("c")) {
    	   facade.SelectCompany("c");
       }
       else {// select any button in general to print the information regarding about the 3 companies 
    	   
    	   facade.SelectAnyCompanyToprintGeneral("a"); // print general report this method selectAnytocompanytoPrintintgeneral
    	   facade.SelectAnyCompanyToprintGeneral("b");
    	   facade.SelectAnyCompanyToprintGeneral("c");
       }

       
        
            
    }
    
    
}