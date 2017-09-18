package exercise_2;

/**
 * Class Person is the super class 
 * @author Malav Soni, Vikas Yadav
 */
public class Person {

    public String firstName, surname;
    public boolean isMale = true;
    public int age;
    
    public Person()
    {
        this.firstName = "";
        this.surname = "";
    }
    
/**
 * Constructor with 3 arguments of type Person
 * @param firstName is the first name
 * @param surname is the last name
 * @param gender is boolean and has to be true = Male and false = female
 */
    public Person(String firstName, String surname, boolean gender)
    {
        this.firstName = firstName;
        this.surname = surname;
        this.isMale = gender;
    }
    
/**
 * This method returns the gender of the person
 * @param gender is of type boolean either true or false for male or female resp.
 * @return a gender string Male or Female
 */    
    public String gender(boolean gender)
    {
        if(gender)
        {
            return "Male";
        }
        else
        {
            return "female";
        }
    }
/**
 * This method helps to convert the address information or the location of the 
 * object to human readable form String
 * @return a string with first and the last name
 */
    public String toString()
    {
        return ("Surname: " + surname + " " + "Firstname: " + firstName + " "
                + "Gender: " + this.gender(this.isMale));
    }
}
