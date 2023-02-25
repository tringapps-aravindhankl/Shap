package shapp;
import java.util.*;
import java.util.logging.*;
class Shap {
    float width;
    float radius;
    float length1;
    float length2;
    String type;
    Logger log=Logger.getLogger("hi");
    // triangle
    Shap(String type, float width, float length1, float length2) {
        this.type = type;
        this.width = width;
        this.length1 = length1;
        this.length2 = length2;

    }

    // circle
    Shap(String type, float radius) {
        this.type = type;
        this.radius = radius;
    }

    // rectangle
    Shap(String type, float width, float length) {
        this.type = type;
        this.width = width;
        this.length1 = length;
    }

    void area() {
        // triangle
        if ("TRIANGLe".equalsIgnoreCase(type)) {
            float area = width * length1;  
            float ans = area / 2;
            log.log(Level.INFO,()->"Area of triangle is:)" + ans);
        }

        // circle
        else if ("Circle".equalsIgnoreCase(type)) {
            float area1 = radius * radius;
            float answer = area1 * 3.14f;
            log.log(Level.INFO,()->"area of circle is" + answer);
        }

        // rectangle
        else if ("ReCtangle".equalsIgnoreCase(type)) {
            float area2 = width * length1;
            log.log(Level.INFO,()->"area of rectangle is" + area2);
        }

    }

    void perimeter() {
        // rectangle
        if ("RectanGle".equalsIgnoreCase(type)) {
            double perimeter1 = 2 * length1 * width;
            log.log(Level.INFO,()->"Perimeter of rectangle is" + perimeter1);
        }

        // circle
        else if ("cirCle".equalsIgnoreCase(type)) {
            double perimeter2 = 2 * 3.14f * radius;
            log.log(Level.INFO,()->"Perimeter of circle is" + perimeter2);
        }

        // triangle
        else if ("TRIAnGLE".equalsIgnoreCase(type)) {
            double perimeter3 = width + length1 + length2;
            log.log(Level.INFO,()->"Perimeter of trianlge is" + perimeter3);
        }
    }
}


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
