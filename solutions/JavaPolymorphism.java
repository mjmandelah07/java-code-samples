public class JavaPolymorphism {
    // Polymorphism means "many forms",
    // and it occurs when we have many classes that are related to each other by inheritance

    // For example, think of a superclass called Animal that has a method called animalSound().
    // Subclasses of Animals could be Pigs, Cats, Dogs, Birds -
    // And they also have their own implementation of an animal sound (the pig oinks, and the cat meows, etc.)

    public void animalSound() {
        System.out.println("The animal makes a sound");
    }

    // Subclass Pig extends JavaPolymorphism
    static class Pig extends JavaPolymorphism {
        @Override
        public void animalSound() {
            System.out.println("The pig says: wee wee");
        }
    }

    // Subclass Dog extends JavaPolymorphism
    static class Dog extends JavaPolymorphism {
        @Override
        public void animalSound() {
            System.out.println("The dog says: bow wow");
        }
    }

    // Main method to demonstrate polymorphism
    public static void main(String[] args) {
        JavaPolymorphism myAnimal = new JavaPolymorphism();  // Create an Animal object
        JavaPolymorphism myPig = new Pig();  // Create a Pig object
        JavaPolymorphism myDog = new Dog();  // Create a Dog object

        myAnimal.animalSound();  // Output: The animal makes a sound
        myPig.animalSound();     // Output: The pig says: wee wee
        myDog.animalSound();     // Output: The dog says: bow wow
    }
}
