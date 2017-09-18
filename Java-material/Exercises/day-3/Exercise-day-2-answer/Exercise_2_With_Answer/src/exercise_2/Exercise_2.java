package exercise_2;

/**
 * Day 3 : Java Refresher, Exercise 2
 * Implementing the class inheritance 
 * @author Malav Soni, Vikas Yadav
 */
public class Exercise_2 {

    /**
     * Array named persons of type Person has been created to store the objects of various 
     * other sub-classes which extends the super class Person.
     * @param args[i] are the input parameter to the constructor Rockstar
     */
    public static void main(String[] args) {
        
        // Task 1: Check the output
        
        Employee M = new Employee("Mac", "Namara", true, "Car-Designer", 1000);
        System.out.println(M.info());
        
        Student X = new Student("Alan", "Turing",true, "Cambridge", "Mathematics");
        System.out.println(X.getDetails());
        
        //Task 2 : Arrays and then print those arrays
        
/**        
        Person[] persons = new Person[3];
        persons[0] = new Employee("Cacy", "Namara", false, "Car-designer", 2000);
        //persons[1] = new Rockstar(args[0], args[1], true, args[2], args[3]);
        persons[1] = new Rockstar("Elvis", "Presely", true, "The Blue Moon Boys", "Blue moon of kentucky");
        persons[2] = new Student("Alan", "Turing",true, "Cambridge", "Mathematics");
        
        for(int i=0; i<persons.length; ++i)
        {
            System.out.println(persons[i]);
        }
        
*/        
    }
    
}
