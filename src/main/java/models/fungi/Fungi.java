package models.fungi;

import models.Creature;
import models.interfaces.Reproduction;

public class Fungi extends Creature implements Reproduction {

    @Override
    public String eatFood() {
        return "external digestion with hyphae";
    }

    public String modeOfReproduction() {
        return "Spores";
    }
}
