package models.fungi;

public class Mushroom extends Fungi {

    private final String classIdentifier = "Mushroom";
    private final String growthDirection = "Grows vertically";

    @Override
    public String toString() {
        String eatingProcess = this.eatFood();
        String reproductionProcess = this.modeOfReproduction();

        String output = "Class: " + this.classIdentifier + "\n"
                + "Eating Process: " + eatingProcess + "\n"
                + "Reproduction Process: " + reproductionProcess + "\n"
                + "Growth direction: " + this.growthDirection + "\n";

        return output;
    }

}
