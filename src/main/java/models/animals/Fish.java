package models.animals;

public class Fish extends Animal {
    private final String classIdentifier = "Fish";
    private final String sound = "Blub blub";

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
