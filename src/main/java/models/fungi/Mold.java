package models.fungi;

public class Mold extends Fungi {
    private final String classIdentifier = "Mold";
    private final String growthDirection = "Grows horizontally";

    @Override
    public String toString() {
        String eatingProcess = this.eatFood();
        String reproductionProcess = this.modeOfReproduction();

        String output = "Class: " + this.classIdentifier + "\n"
                + "Eating Process: " + eatingProcess + "\n"
                + "Reproduction Process: " + reproductionProcess + "\n"
                + "Growth Direction: " + this.growthDirection + "\n";

        return output;
    }
}
