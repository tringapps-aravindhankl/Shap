package shapp;
import java.util.*;
import java.util.logging.*;
public class Shape
{
	 private static Scanner scan;
		public static void main( String[] args){
	    	int option;
		    Logger log;
	        log=Logger.getLogger("hi");
	        scan = new Scanner(System.in);
	        try{
	        do {
	            log.info("Enter your option 1.Triangle 2.circle 3.Rectangle 4.Exit");
	            option = scan.nextInt();
	            if (option == 1) {
	                log.info("ENTER WIDTH");
	                float width = scan.nextFloat();
	                log.info("Enter length1");
	                float length1 = scan.nextFloat();
	                log.info("Enter length2");
	                float length2 = scan.nextFloat();
	                Shap triangle = new Shap("TRIANGLE", width, length1, length2);
	                triangle.area();
	                triangle.perimeter();
	            } else if (option == 2) {
	                log.info("Enter radius");
	                float rad = scan.nextFloat();
	                Shap cirle = new Shap("circle", rad);
	                cirle.area();
	                cirle.perimeter();
	            } else if (option == 3) {
	                log.info("Enter width");
	                float width = scan.nextFloat();
	                log.info("Enter length");
	                float length1 = scan.nextFloat();
	                Shap rectangle = new Shap("Rectangle", width, length1);
	                rectangle.area();
	                rectangle.perimeter();
	            }else if(option==4) {
	            	log.info("Exit Successfully");
	            }
	        } while (option < 4);
	        }
	        catch(InputMismatchException e) {
	        	log.info(String.valueOf(e));
	        	System.exit(0);
	        }
    }
}
