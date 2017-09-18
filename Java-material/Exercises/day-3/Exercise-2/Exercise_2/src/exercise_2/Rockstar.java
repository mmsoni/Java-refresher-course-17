package exercise_2;

/**
 * Rock-star extends Person
 * @author Malav Soni
 */
public class Rockstar extends Person{
    
    private String band;
    private String famousSong;

/**
 * Rockstar constructor
 * @param firstName first name
 * @param surname last name
 * @param gender male or female
 * @param band band 
 * @param famoussong any famous song from the band 
 */    
    public Rockstar(String firstName, String surname,boolean gender, String band, String famoussong)
    {
        super(firstName, surname,gender);
        this.band = band;
        this.famousSong = famoussong;
    }
/**
 * It will give the information of the rockstar
 * @return the array of type String
 */    
    public String[] rockStarInfo()
    {
        String[] rockStarInfo = new String[2];
        rockStarInfo[0] = this.band;
        rockStarInfo[1] = this.famousSong;
        return rockStarInfo;
    }
/**
 * This toString() describes itself
 * @return the rock-star information in readable form
 */    
    public String toString()
    {
        return (super.toString() + " " + "band: " + band  + " " + "famoussong: " + famousSong);
    }
}
