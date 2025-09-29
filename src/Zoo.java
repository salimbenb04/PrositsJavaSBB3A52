import java.util.Arrays;

public class Zoo {
    Animal[] animals=new Animal[25];
    String name;

    String city;
    final static int NBRCAGES=25;
    int nbrAnimals;

    public Zoo( String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        ;
    }
    public void displayZoo(){
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre de cages : " + NBRCAGES);
    }


    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + Arrays.toString(animals) +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + NBRCAGES +
                '}';
    }

    boolean addAnimal(Animal animal){
        if(nbrAnimals==NBRCAGES)
            return false;
        if(searchAnimal(animal)!=-1){
            animals[nbrAnimals]=animal;
            nbrAnimals++;
            return true;
        }
        return false;


    }
    void dislayAnimals(){
        for(Animal animal :animals){
            System.out.println(animals);
        }
    }
    int searchAnimal(Animal animal){
        for(int i=0;i<nbrAnimals;i++){
            if(animal.getName()==animals[i].getName())
                return i;
        }
        return -1;
    }
    boolean removeAnimal(Animal animal){
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
        return nbrAnimals==NBRCAGES;
    }
    Zoo compareZoo(Zoo z1,Zoo z2){
        if(z1.nbrAnimals> z2.nbrAnimals)
            return z1;
        return z2;
    }


}
