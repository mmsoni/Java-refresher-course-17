package exercise_1;

/**
 * Point class has been implemented with various methods
 * @author Malav Soni, Vikas Yadav
 */
public class Point {
    
    private int x;
    private int y;
    
/**
 * Point constructor with the same argument variable names as the instance variables
 * @param x x coordinate of the point
 * @param y y coordinate of the point
 */    
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
/**
 * Point constructor with the different argument variable and instance variables
 * @param x0 x coordinate of the point
 * @param y0 y coordinate of the point
 */
    //public Point (int x0, int y0)
    //{
    //    x = x0;
    //    y = y0;
    //}
/**
 * Constructor without any arguments
 */
    public Point()
    {
        x=0;
        y=0;
    }

/**
 * Gets the x-coordinate
 * @return the x-coordinate of the point 
 */    
    public int getX()
    {
        return this.x;
    }

/**
 * Gets the y-coordinate
 * @return the y-coordinate of the point 
 */    
    public int getY()
    {
        return this.y;
    }

/**
 * Sets the x-coordinate
 * @param x will set the x-coordinate of the point to a given value
 */    
    public void setX(int x)
    {
        this.x = x;
    }
    
/**
 * Sets the y-coordinate
 * @param y will set the y-coordinate of the point to a given value
 */    
    public void setY(int y)
    {
        this.y = y;
    }
    
/**
 * Distance between the points with object as an argument to the method
 * @param P2 is the object name of type Point. It is supplied as an argument to 
 *           calculate the distance between the two points 
 * @return   the distance between the two points
 */    
    //Non-static
    public double disBetweenPoints(Point P2)
    {
        double Y = Math.pow((this.x - P2.x),2) + Math.pow((this.y - P2.y),2);
        double X = Math.sqrt(Y);
        return X;
        //return Point.distance(this, P2);
    }
/**
 * In this method the coordinates of the points (x,y) have been sent as 
 * arguments to calculate the distance between the two points
 * @param x is the x coordinate of the point
 * @param y is the y coordinate of the point
 * @return the distance between the two points 
 */    
    public double disBetweenPoints(int x, int y)
    {
        double Y = Math.pow((this.x - x),2) + Math.pow((this.y - y),2);
        double X = Math.sqrt(Y);
        return X;
        //return Point.distance(this, P2);
    }
   
/**
 * Static distance method with objects sent as arguments
 * @param P1 point 1 sent as an argument
 * @param P2 point 2 sent as an argument
 * @return 
 */    
    public static double distance(Point P1, Point P2)
    {
        //Point p1;
        double Y = Math.pow((P1.x - P2.x),2) + Math.pow((P1.y - P2.y),2);
        double X = Math.sqrt(Y);
        return X;
    }
   
/**
 * It performs the mirror operation e.g. (x,y) = (-x, -y) 
 * @return the mirrored point 
 */    
    public Point mirrorAtOrigin()
    {
        //this.x = -1*this.x;
        //this.y = -1*this.y;
        return (new Point(this.x*-1, this.y*-1));
    }
    
/**
 * The mirror operation is performed about the line with 45 degree slope (y=x) 
 * e.g. (x,y) = (y,x)
 * @return the mirrored point
 */   
    public Point mirrorAtAxis()
    {
        return (new Point(this.y, this.x));
    }
    
/**
 * It will return the object as we want to have both x and y coordinates at the 
 * same time and by calling a single method. Else we can do it separately via 
 * getX() and getY() methods, which can be boring and too much work when your 
 * program gets bigger. 
 * @return the location of the current point
 */
    public Point getLoc()
    {   
        return(new Point(this.x+1, this.y+2));
    }
   
/**
 * It will convert the output to the readable form
 * @return the string in readable form
 */    
    public String toString()
    {
        return ((this.x) + " " + (this.y));
    }
}
