package src;
// Andrew Walter, 5/9/24
// This class, the testCloning class, does basic implementation of the two base classes in the project.
// It runs a clone on each, prints them, and prints their hashcodes to prove the objects are unique.
public class testCloning {
    public static void main(String[] args){
        CloneFactory animalMaker = new CloneFactory();
        Sheep sally = new Sheep();
        Sheep clonedSally = (Sheep) animalMaker.getClone(sally);
        System.out.println(sally);
        System.out.println(clonedSally);
        System.out.println("Sally hashcode: " + System.identityHashCode(sally));
        System.out.println("Clone hashcode: " + System.identityHashCode(clonedSally));

        Mouse charles = new Mouse();
        Mouse charlesII = (Mouse) animalMaker.getClone(charles);
        System.out.println(charles);
        System.out.println(charlesII);
        System.out.println("Charles hashcode: " + System.identityHashCode(charles));
        System.out.println("Charles the Second hashcode: " + System.identityHashCode(charlesII));
    }
}
