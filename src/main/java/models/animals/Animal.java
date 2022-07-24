package models.animals;

import models.Creature;
import models.interfaces.Reproduction;

public class Animal extends Creature implements Reproduction {

    @Override
    public String eatFood() {
        return "ingestion";
    }

    public String modeOfReproduction() {
        return "Sexual Reproduction";
    }

}
