public class Zoo {

    Animal[] animals;
    String name;
    String city;
    int nbrCages=25;

    Zoo(String name,String city,int nbrCages){
        this.name=name;
        this.city=city;
        this.nbrCages=nbrCages;

    }

    void displayZoo(Zoo z){
        System.out.println("Zoo name: "+ z.name+ ", City: "+ z.city +", Number of Cages: "+ z.nbrCages);
    }

    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }
}
