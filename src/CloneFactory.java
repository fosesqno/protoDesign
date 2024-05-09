package src;
// Andrew Walter, 5/9/24
// This is the CloneFactory class.
// Its only method, getClone(), intakes an animal to be cloned and then calls that animal's overridden makeCopy() function.
public class CloneFactory {
    public Animal getClone(Animal animalSample) {
        return animalSample.makeCopy();
    }
}
