package homework;

public class VariableValues {
    public static void main(String[] args) {
        byte numOfPilot=7;
        int numOfPassenger = 60600;
        short distanceToMars = 8000;
        long distanceToJupiter = 9500000;
        float gallonsAvailible = 900.9f;
        double weight = 600000.65;
        char departed = 'N';
        boolean isSafe = true;

        numOfPilot = 5;
        numOfPassenger = 60599;
        distanceToMars= 200;
        distanceToJupiter = 9400000;
        gallonsAvailible = 9.1f;
        weight=599599.65;
        departed = 'Y';
        isSafe=false;

        System.out.println("Pilots availible: " + numOfPilot);
        System.out.println("# of Passengers: " + numOfPassenger);
        System.out.println("Miles to Mars: " + distanceToMars);
        System.out.println("Miles to Jupiter " + distanceToJupiter);
        System.out.println("Gallons left in tank: " + gallonsAvailible);
        System.out.println("Weight in lbs: " + weight);
        System.out.println("Has ship departed?: " + departed);
        System.out.println("On track to arrive safely?: " + isSafe);
    }
}
