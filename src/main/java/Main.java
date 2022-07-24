import models.animals.Animal;
import models.animals.Bird;
import models.animals.Fish;
import models.fungi.Fungi;
import models.fungi.Mold;
import models.fungi.Mushroom;
import models.plants.Flower;
import models.plants.Plant;
import models.plants.Tree;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("See all concrete Creature classes: \n");
        printAnimals();
        printPlants();
        printFungi();
        System.out.println("\nThat's all!");
    }

    private static void printAnimals() {
        ArrayList<Animal> animalList = new ArrayList<Animal>();
        Bird bird = new Bird();
        Fish fish = new Fish();

        animalList.add(bird);
        animalList.add(fish);

        for (Animal animal: animalList) {
            System.out.println(animal.toString());
        }
    }

    private static void printPlants() {
        ArrayList<Plant> plantList = new ArrayList<Plant>();
        Flower flower = new Flower();
        Tree tree = new Tree();

        plantList.add(flower);
        plantList.add(tree);

        for(Plant plant: plantList) {
            System.out.println(plant.toString());
        }
    }

    private static void printFungi() {
        ArrayList<Fungi> fungiList = new ArrayList<Fungi>();
        Mold mold = new Mold();
        Mushroom mushroom = new Mushroom();

        fungiList.add(mold);
        fungiList.add(mushroom);

        for(Fungi fungi: fungiList) {
            System.out.println(fungi.toString());
        }
    }
}
