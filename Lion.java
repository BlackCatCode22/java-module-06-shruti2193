package shruti.zoo.com;
public class Lion extends shruti.zoo.com.Animal {
    // Create a static int that keep track of the number of hyenas created.
    static int numOfLion = 0;
    // Create a constructor.
    public Lion(){
        super();
        numOfLion++;
    }
    // Create a constructor that will have all the fields I want.
    public Lion(String sex, int age, int weight, String animalName,
                 String animalID, String animalBirthDate, String animalColor,
                 String animalOrigin, String animalArrivalDate){
        super(sex, age, weight, animalName, animalID, animalBirthDate, animalColor,
                animalOrigin, animalArrivalDate);
        numOfLion++;
    }
}
