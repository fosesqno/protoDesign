package src;
// Andrew Walter, 5/9/24
// This is the Mouse class that implements our Animal interface.
// The default constructor just generates a sample string to confirm the object was created.
// The makeCopy is overriden from the implemented Animal interface.
// The toString() allows us to use our Mouse objects directly in print statements.
public class Mouse implements Animal{
    public Mouse() {
        System.out.println("Mouse is being made.");
    }

    public Animal makeCopy() {
        System.out.println("Mouse is being made.");
        Mouse mouseObject = null;
        try {
            mouseObject = (Mouse) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mouseObject;
    }

    public String toString() {
        return "im a mouse, squeak!";
    }
}
