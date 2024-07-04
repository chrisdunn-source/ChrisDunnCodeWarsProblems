package July2024;
/*
According to the creation myths of the Abrahamic religions, Adam and Eve were the first Humans to wander the Earth.

You have to do God's job. The creation method must return an array of length 2 containing objects (representing Adam and Eve). The first object in the array should be an instance of the class Man. The second should be an instance of the class Woman. Both objects have to be subclasses of Human. Your job is to implement the Human, Man and Woman classes.
 */
class Human {
    // No specific attributes or methods for now
}

class Man extends Human {
    // Additional attributes or methods specific to men can be added here
}

class Woman extends Human {
    // Additional attributes or methods specific to women can be added here
}

public class God {
    public static Human[] create() {
        // Create an array of length 2 to hold the instances of Human
        Human[] humans = new Human[2];

        // The first element of the array will be an instance of the Man class (representing Adam)
        humans[0] = new Man();

        // The second element of the array will be an instance of the Woman class (representing Eve)
        humans[1] = new Woman();

        // Return the array containing Adam and Eve
        return humans;
    }
}
