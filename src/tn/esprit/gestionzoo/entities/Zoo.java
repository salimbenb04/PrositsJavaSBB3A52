package tn.esprit.gestionzoo.entities;

public class Zoo {

    Animal[] animals;
    String name;
    String city;
    final static int nbrCages=25;
    int nbrAnimals;

    Aquatic[] aquaticAnimals=new Aquatic[10];
    int nbrAquaticAnimals=0;

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

    public Aquatic[] getAquaticAnimals() { return aquaticAnimals; }
    public int getNbrAquatic() { return nbrAquaticAnimals; }

    public void addAquaticAnimal(Aquatic a){
        if(nbrAquaticAnimals<10){
            aquaticAnimals[nbrAquaticAnimals]=a;
            nbrAquaticAnimals++;
        }
        else {
            System.out.println("table full.");
        }
    }

    public void affTabAqua(){
        for(int i=0;i<nbrAquaticAnimals;i++){
            aquaticAnimals[i].swim();
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0.0f;
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin p = (Penguin) aquaticAnimals[i];
                if (p.getSwimmingDepth() > maxDepth) {
                    maxDepth = p.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                dolphinCount++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                penguinCount++;
            }
        }

        System.out.println("Number of Dolphins: " + dolphinCount);
        System.out.println("Number of Penguins: " + penguinCount);
    }

}
