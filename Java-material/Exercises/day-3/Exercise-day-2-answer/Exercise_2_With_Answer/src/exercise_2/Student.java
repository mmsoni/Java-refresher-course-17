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
 * @param firstName first name
 * @param surname last name
 * @param gender gender of the person
 * @param Uni name of university
 * @param faculty Branch or department i.e. Engineering
 */    
    public Student(String firstName, String surname, boolean gender, String Uni, String faculty)
    {
        super(firstName, surname, gender);
        this.University = Uni;
        this.fieldOfStudy = faculty;
    }
/**
 * This method return an array of type string. The array will have the 
 * information about the university and the faculty of the student
 * @return returns the student details array
 */    
    public String[] getDetails()
    {
        String[] getDetails = new String[2];
        getDetails[0] = this.University;
        getDetails[1] = this.fieldOfStudy;
        return getDetails;
    }
/**
 * This toString() describes itself
 * @return student information from student class as well as from the 
 *         information inherited from super-class
 */    
    public String toString()
    {
        return (super.toString() + " " + "University " + University  + " " + "fieldOfStudy: " + fieldOfStudy);
    }
    
}
