package models.plants;

import models.Creature;
import models.interfaces.Reproduction;

public class Plant extends Creature implements Reproduction {

    @Override
    public String eatFood() {
        return "sunlight (aka photosynthesis)";
    }

    public String modeOfReproduction() {
        return "Seeds";
    }
}
