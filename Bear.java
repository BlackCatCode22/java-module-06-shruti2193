package shruti.zoo.com;
public class Bear extends shruti.zoo.com.Animal {
    // Create a static int that keep track of the number of hyenas created.
    static int numOfBear = 0;
    // Create a constructor.
    public Bear(){
        super();
        numOfBear++;
    }
    // Create a constructor that will have all the fields I want.
    public Bear(String sex, int age, int weight, String animalName,
                 String animalID, String animalBirthDate, String animalColor,
                 String animalOrigin, String animalArrivalDate){
        super(sex, age, weight, animalName, animalID, animalBirthDate, animalColor,
                animalOrigin, animalArrivalDate);
        numOfBear++;
    }
}