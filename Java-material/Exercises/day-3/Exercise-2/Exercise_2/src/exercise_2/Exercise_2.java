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
        
        // Task 1:
        // Check the output after implementing the employee class
        
        Employee M = new Employee("Mac", "Namara", true, "Car-Designer", 1000);
        System.out.println(M.info());
        
        //Task 2 : 
        //Create an Array and then print the output of the array
        
        
        Person[] persons = new Person[3];
        persons[0] = new Employee("Cacy", "Namara", false, "Car-designer", 2000);
        //persons[1] = new Rockstar(args[0], args[1], true, args[2], args[3]); // can also use command line arguments
        persons[1] = new Rockstar("Elvis", "Presely", true, "The Blue Moon Boys", "Blue moon of kentucky");
        //persons[2] = new Student(); // fill in the object call to class student
        
        for(int i=0; i<persons.length; ++i)
        {
            System.out.println(persons[i]);
        }
        
       
    }
    
}
