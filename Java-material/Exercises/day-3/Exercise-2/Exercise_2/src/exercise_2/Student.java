package exercise_2;

/**
 * Student class extends the person class
 * @author Malav Soni, Vikas Yadav
 */
public class Student extends Person {
    
    private String University, fieldOfStudy;
/**
 * Constructor for student class. "super" is used to mention that this 
 * constructor inherits the functionalities of the super-class
 * @param firstName 
 * @param surname
 * @param gender
 * @param Uni name of university
 * @param faculty Branch or department i.e. Engineering
 */    
    public Student(String firstName, String surname, boolean gender, String Uni, String faculty)
    {
        super(firstName, surname, gender);
        // modity the constructor
    }
/**
 * This method return an array of type string. The array will have the 
 * information about the university and the faculty of the student
 * @return returns the student details array
 */    
    public String[] getDetails()
    {
        //Type your code in here and return the array fo type string back
        
        return (); //modify the return statement
    }
/**
 * This toString() describes itself
 * @return student information from student class as well as from the 
 * information inherited from super-class
 */    
    public String toString()
    {
        return ("1"); // fill in the method and modify the return statement
    }
    
}
