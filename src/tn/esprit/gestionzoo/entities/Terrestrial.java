package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal {
    protected int nbrLegs;

    public Terrestrial() {}
    public Terrestrial(String name,String family,int age,Boolean isMammal,int nbrLegs) {
        super(name,family,age,isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString()+"Terrestrial{" +
                "nbrLegs=" + nbrLegs +
                '}';
    }
}
