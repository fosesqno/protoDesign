package src;
// Andrew Walter, 5/9/24
// This is the Sheep class that implements our Animal interface.
// The default constructor just generates a sample string to confirm the object was created.
// The makeCopy is overriden from the implemented Animal interface.
// The toString() allows us to use our Sheep objects directly in print statements.
public class Sheep implements Animal {
    public Sheep() {
        System.out.println("Sheep is made.");
    }

    @Override
    public Animal makeCopy() {
        System.out.println("Sheep is being made.");
        Sheep sheepObject = null;
        try {
            sheepObject = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheepObject;
    }

    public String toString(){
        return "Dolly is my hero, Baaaa";
    }
}
