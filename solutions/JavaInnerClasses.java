class OuterClass {
    int x = 10;


    class InnerClass {
        int y = 5;
    }

    // Private Inner Class
    // Unlike a "regular" class, an inner class can be private or protected.
    // If you don't want outside objects to access the inner class, declare the class as private
    // If you try to access a private inner class from an outside class, an error occurs:
    private class InnerClassOne {
        int y = 5;

    }

    // An inner class can also be static, which means that you can access it without creating an object of the outer class:
    static class InnerClassTwo {
        int y = 5;
    }

    //    Access Outer Class From Inner Class
    class InnerClassThree {
        public int myInnerMethod() {
            return x;
        }
    }
}

public class JavaInnerClasses {
    // it is also possible to nest classes (a class within a class).
    // The purpose of nested classes is to group classes that belong together,
    // which makes code more readable and maintainable

    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);  // Outputs 15 (5 + 10)


        // just like static attributes and methods, a static inner class does not have access to members of the outer class.
        OuterClass.InnerClassTwo myInnerTwo = new OuterClass.InnerClassTwo();
        System.out.println(myInner.y); // Outputs 5

        // One advantage of inner classes, is that they can access attributes and methods of the outer class
        OuterClass.InnerClassThree myInnerThree = myOuter.new InnerClassThree();
        System.out.println(myInnerThree.myInnerMethod()); // Outputs 10
    }

}