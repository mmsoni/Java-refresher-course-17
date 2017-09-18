package exercise_1;

/**
 * Tasks 
 * 1) Implement the Point class
 * 2) Implement a constructor a toString method and a main
 *    method in Point, so that you can a) run it b) an object on the 
 *    command line
 * 3) Add a distance function
 * 4) Print the distance between Point(1,1) and Point(4,5)(should be 5, right?) 
 * 5) Create both versions (static and non-static of the distance function)
*  6) Optional: add methods to move the point some distance, mirror it at the 
*     origin, mirror it at some axis
* @author Malav Soni, Vikas  Yadav
 */
public class Exercise_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Point p1 = new Point(10, 20); // Point 1(object 1)
        Point p2 = new Point(15, 30); // Point 2(object 2)
        
        // It gets the location of the point 1
        System.out.println( p1.getLoc());
        // It gets the location of the point 2
        System.out.println( p2.getLoc());
        // It gets the distance between point 1 and point 2, with point 2 
        // supplied as an argument
        System.out.println(p1.disBetweenPoints(p2));
        // It calculates the distance between the two given points 1 and 2 as 
        // objects
        System.out.println(Point.distance(p1, p2));
        // It calculates the distance between the point 1 and 2, where point 2 
        // is given in the form of x & y co-ordinates
        System.out.println(p1.disBetweenPoints(30, 50));
        // mirror operation e.g. (x,y) = (-x, -y)
        System.out.println(p1.mirrorAtOrigin());
        // mirror operation e.g. (x,y) = (y,x)
        System.out.println(p1.mirrorAtAxis());
        
    }
    
}
