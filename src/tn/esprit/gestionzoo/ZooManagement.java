package tn.esprit.gestionzoo;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class ZooManagement {
    public static void main(String[] args) {

        Animal lion=new Animal("lion","simba",6,true);
        Zoo myZoo=new Zoo("zoo","Tunis");
        myZoo.displayZoo(myZoo);
        System.out.println(myZoo) ;
        System.out.println(myZoo.toString());
        Animal elephant = new Animal("Elephant", "Dumbo", 10, true);
        Animal giraffe = new Animal("Giraffe", "Melman", 7, true);
        Animal crocodile = new Animal("Crocodile", "Snappy", 12, false);
        Animal parrot = new Animal("Parrot", "Polly", 3, false);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(giraffe);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(parrot);
        System.out.println(myZoo.toString());




    }
}