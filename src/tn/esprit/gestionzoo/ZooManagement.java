package tn.esprit.gestionzoo;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {

        Zoo myZoo = new Zoo("Carthage Zoo", "Tunis");

        Dolphin d1 = new Dolphin("Flipper", "Delphinidae", 10, true, "Ocean", 45.5f);
        Dolphin d2 = new Dolphin("Flipper", "Delphinidae", 10, true, "Ocean", 50.0f);
        Penguin p1 = new Penguin("Kowalski", "Spheniscidae", 5, false, "Ice Cap", 200.0f);
        Penguin p2 = new Penguin("Rico", "Spheniscidae", 7, false, "Ice Cap", 350.0f);

        System.out.println("--- Instruction 25: Adding Aquatic Animals ---");
        myZoo.addAquaticAnimal(d1);
        myZoo.addAquaticAnimal(d2);
        myZoo.addAquaticAnimal(p1);
        myZoo.addAquaticAnimal(p2);

        System.out.println("\n--- Instruction 26.1: Calling swim() ---");
        for (int i = 0; i < myZoo.getNbrAquatic(); i++) {
            myZoo.getAquaticAnimals()[i].swim();
        }

        System.out.println("\n--- Instruction 27: Max Penguin Depth ---");
        System.out.println("Max Penguin Swimming Depth: " + myZoo.maxPenguinSwimmingDepth() + " meters");

        System.out.println("\n--- Instruction 28: Count by Type ---");
        myZoo.displayNumberOfAquaticsByType();

        System.out.println("\n--- Instruction 31: Testing equals() ---");

        boolean areEqual = d1.equals(d2);
        System.out.println("Are d1 and d2 equal (same name, age, habitat)? " + areEqual);

        boolean areDifferent = d1.equals(p1);
        System.out.println("Are d1 and p1 equal? " + areDifferent);

        // Your existing Prosit 5 calls below
        Terrestrial t = new Terrestrial("lion","chats",2,true,4);
        Dolphin d = new Dolphin("mortadha","Dolphin",69,true,"ocean",69.420f);
        Penguin p = new Penguin("zarbout","el kadhi",9,true,"Antartiac",420.69f);

        System.out.println(t);
        System.out.println(d);
        System.out.println(p);


    }
}