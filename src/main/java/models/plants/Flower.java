package models.plants;

public class Flower extends Plant {

    private final String classIdentifier = "Flower";
    private final String distinctiveFeature = "Petals";

    @Override
    public String toString() {
        String eatingProcess = this.eatFood();
        String reproductionProcess = this.modeOfReproduction();

        String output = "Class: " + this.classIdentifier + "\n"
                + "Eating Process: " + eatingProcess + "\n"
                + "Reproduction Process: " + reproductionProcess + "\n"
                + "Distinctive Feature: " + this.distinctiveFeature + "\n";

        return output;
    }

}
