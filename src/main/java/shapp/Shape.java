package shapp;
import java.util.*;
class Shap {
    float length;
    float width;
    float radius;
    float length1;
    String type;

    // triangle
    Shap(String type, float width, float length, float length1) {
        this.type = type;
        this.length = length;
        this.width = width;
        this.length1 = length1;

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
        this.length = length;
    }

    void area() {
        // triangle
        if ("TRIANGLe".equalsIgnoreCase(type)) {
            float area = width * length;  
            area = area / 2;
            System.out.println("area of triangle is" + area);
        }

        // circle
        else if ("Circle".equalsIgnoreCase(type)) {
            float area1 = radius * radius;
            area1 = area1 * 3.14f;
            System.out.println("area of circle is" + area1);
        }

        // rectangle
        else if ("ReCtangle".equalsIgnoreCase(type)) {
            float area2 = width * length;
            System.out.println("area of rectangle is" + area2);
        }

    }

    void perimeter() {
        // rectangle
        if ("RectanGle".equalsIgnoreCase(type)) {
            double perimeter1 = 2 * length * width;
            System.out.println("Perimeter of rectangle is" + perimeter1);
        }

        // circle
        else if ("cirCle".equalsIgnoreCase(type)) {
            double perimeter2 = 2 * 3.14f * radius;
            System.out.println("Perimeter of circle is" + perimeter2);
        }

        // triangle
        else if ("TRIAnGLE".equalsIgnoreCase(type)) {
            double perimeter3 = width + length + length1;
            System.out.println("Perimeter of trianlge is" + perimeter3);
        }
    }
}

public class Shape
{
	 private static Scanner scan;
		public static void main( String[] args){
	    	int option;
	        scan = new Scanner(System.in);
	        do {
	            System.out.println("Enter your option 1.Triangle 2.circle 3.Rectangle 4.Exit");
	            option = scan.nextInt();
	            if (option == 1) {
	                System.out.println("ENTER WIDTH");
	                float width = scan.nextFloat();
	                System.out.println("Enter length");
	                float length = scan.nextFloat();
	                System.out.println("Enter length1");
	                float length1 = scan.nextFloat();
	                Shap a = new Shap("TRIANGLE", width, length, length1);
	                a.area();
	                a.perimeter();
	            } else if (option == 2) {
	                System.out.println("Enter radius");
	                float rad = scan.nextFloat();
	                Shap b = new Shap("circle", rad);
	                b.area();
	                b.perimeter();
	            } else if (option == 3) {
	                System.out.println("Enter width");
	                float width = scan.nextFloat();
	                System.out.println("Enter length");
	                float length = scan.nextFloat();
	                Shap c = new Shap("Rectangle", width, length);
	                c.area();
	                c.perimeter();
	            }else if(option==4) {
	            	System.out.println("Exit Successfully");
	            }
	        } while (option < 4);
        
    }
}
