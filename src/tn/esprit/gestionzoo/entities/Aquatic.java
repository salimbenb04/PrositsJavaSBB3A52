package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal {

    protected String habitat;

    public Aquatic(){}

    public Aquatic(String name,String family,int age,Boolean isMammal,String habitat) {
        super(name,family,age,isMammal);
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString()+"Aquatic{" +
                "habitat='" + habitat + '\'' +
                '}';
    }

    public abstract void swim();

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Aquatic other = (Aquatic) obj;

        return this.getName().equals(other.getName()) &&
                this.getAge() == other.getAge() &&
                this.habitat.equals(other.habitat);
    }
}
