package src;

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
