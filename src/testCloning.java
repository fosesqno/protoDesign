package src;

public class testCloning {
    public static void main(String[] args){
        CloneFactory animalMaker = new CloneFactory();
        Sheep sally = new Sheep();
        Sheep clonedSally = (Sheep) animalMaker.getClone(sally);
        System.out.println(sally);
        System.out.println(clonedSally);
        System.out.println("Sally hashcode: " + System.identityHashCode(sally));
        System.out.println("Clone hashcode: " + System.identityHashCode(clonedSally));
    }
}
