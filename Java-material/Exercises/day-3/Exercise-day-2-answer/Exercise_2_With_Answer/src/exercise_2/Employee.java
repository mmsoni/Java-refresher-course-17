package exercise_2;

/**
 * Employee class is the sub-class that extends the Person class and thus it 
 * inherits all the functionalities of the Person class, which is the super class.
 * @author Malav Soni, Vikas Yadav
 */
public class Employee extends Person{
    
    private String role; // his work position i.e Manager
    private double wage; // his monthly salary
/**
 * Employee constructor
 * @param firstName first name
 * @param surname last name
 * @param gender male or female
 * @param role job designation
 * @param wage the monthly salary
 */    
    public Employee(String firstName, String surname, boolean gender, String role, double wage)
    {
        super(firstName, surname, gender);
        this.role = role;
        this.wage = wage;
    }
/**
 * Employee information
 * @return an object of type Employee
 */   
    public Employee info()
    {
        return (new Employee(this.firstName, this.surname, this.isMale, role, wage));
    }
/**
 * This toString() describes itself
 * @return the string in the readable form
 */   
    public String toString()
    {
        return (super.toString()+ " " + "Role: " + role  + " " + "Wage: " + wage);
    }
}
