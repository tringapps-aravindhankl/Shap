package shapp;
import java.util.logging.Level;
import java.util.logging.Logger;
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

