package models.animals;

public class Bird extends Animal {
    private final String classIdentifier = "Bird";
    private final String sound = "Chirp";

    @Override
    public String toString() {
        String eatingProcess = this.eatFood();
        String reproductionProcess = this.modeOfReproduction();

        String output = "Class: " + this.classIdentifier + "\n"
                + "Eating Process: " + eatingProcess + "\n"
                + "Reproduction Process: " + reproductionProcess + "\n"
                + "Sound: " + this.sound + "\n";

        return output;
    }

}
