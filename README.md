For your fifth project, you will be needing to do three things:

Implement an Interface.
Inherit from an abstract class.
Create either a SET or List of your elements.

All creatures on earth share DNA in some manner. Taxonomists love to classify these creatures into classes. Because computers are the way of the future, these unnamed taxonomists want you to write a program which classifies Plants, Animals, and Fungi!

Your Plant, Animal, and Fungi classes should all inherit from an abstract class called "creature" which has the function "eatFood".

- Your Plant class must override the function eat food and return "sunlight (aka photosynthesis)".

- Your Animal class must override the function eatFood and return "ingestion".

- Your Fungi class must override the function eatFood and return "external digestion with hyphae".



Your classes must also implement the interface Reproduction, which has the function "modeOfReproduction".

Implementing the interface:

- Animals must return the string "Sexual Reproduction" as their mode of production

- Plants must return the string "Seeds" as their mode of production.

- Fungi must return the string "Spores" as their mode of production.



Then create 2 classes that extend Animal, 2 classes that extend Plant, and 2 classes that extend Fungi.  Each of your classes should additionally override the 'toString' method. Be sure your toString method uses both your interface and abstract class methods and add some extra stuff that represents your class.

Example:

class Wolf extends Animal {
@Override
public String toString() {
// call eatFood()
// call modeOfReproduction()
// add some custom string for the Wolf
// put it all together and return
}
}
In your main function, after implementing your classes, create each type, and place them in a SET or a LIST. That is, for animals, have an Animal list, for plants, have a plant list, and for Fungi, have a fungi list.

Then print out each of your sets/lists. When printing your lists be sure to print them with your overridden toString methods.

Submission

You can submit your solution in many ways:

Zip up your project and upload your whole java project
Upload the relevant *.java files only (make sure to include your pom.xml if using Maven)
Submit your GitLab link so I can clone your project