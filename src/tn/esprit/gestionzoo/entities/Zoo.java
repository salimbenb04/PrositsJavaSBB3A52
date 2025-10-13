package tn.esprit.gestionzoo.entities;

public class Zoo {

    Animal[] animals;
    String name;
    String city;
    final static int nbrCages=25;
    int nbrAnimals;

    //getters

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    //setters

    public void setName(String name) {
        if(name.equals(" ")){
            System.out.println("le nom du zoo ne doit pas etre vide");
        }
        this.name = name;
    }

    public void setCity(String city) {
        if(city.equals(" ")){
            System.out.println("le nom d'une ville ne doit pas etre vide");
        }
        this.city = city;
    }

    public Zoo(String name,String city ){
        this.name=name;
        this.city=city;

    }

    public void displayZoo(Zoo z){
        System.out.println("tn.esprit.gestionzoo.entities.Zoo name: "+ z.name+ ", City: "+ z.city +", Number of Cages: "+ z.nbrCages);
    }

    public String toString() {
        return "tn.esprit.gestionzoo.entities.Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }

    public boolean addAnimal(Animal animal){
        if(isZooFull())
            return false;
        if(searchAnimal(animal)!=-1){
            animals[nbrAnimals]=animal;
            nbrAnimals++;
            return true;
        }
        return false;
    }

    int searchAnimal(Animal animal){
        for(int i=0;i<nbrAnimals;i++){
            if(animal.getName()==animals[i].getName())
                return i;
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal){
        int indexAnimal=searchAnimal(animal);
        if(indexAnimal==-1){
            return false;
        }
        for(int i=indexAnimal;i<nbrAnimals;i++){
            animals[i]=animals[i+1];
        }
        animals[nbrAnimals]=null;
        nbrAnimals--;
        return true;
    }

    boolean isZooFull(){
        return nbrAnimals==nbrCages;
    }
    public Zoo compareZoo(Zoo z1,Zoo z2){
        if(z1.nbrAnimals> z2.nbrAnimals)
            return z1;
        return z2;
    }

}
