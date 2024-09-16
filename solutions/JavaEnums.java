enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class JavaEnums {
    // An enum is a special "class" that represents a group of constants
    // (unchangeable variables, like final variables)

    // To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma.
    // Note that they should be in uppercase letters:


    // Enum inside a Class
    enum Level1 {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);

        Level1 myVar1 = Level1.MEDIUM;
        System.out.println(myVar1);

        // Enum in a Switch Statement
        switch(myVar) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }

        // Loop Through an Enum
        // The enum type has a values() method, which returns an array of all enum constants.
        // This method is useful when you want to loop through the constants of an enum

        for (Level myVar2 : Level.values()) {
            System.out.println(myVar2);
        }
    }
}
