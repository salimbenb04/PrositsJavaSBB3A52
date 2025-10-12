package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic{

    protected float swimmingSpeed;

    public Dolphin() {}
    public Dolphin(String name,String family,int age,Boolean isMammal,String habitat,float swimmingSpeed) {
        super(name,family,age,isMammal,habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return super.toString()+"Dolphin{" +
                "swimmingSpeed=" + swimmingSpeed +
                '}';
    }
    @Override
    public void swim(){
        System.out.println("This Dolphin is swimming.");
    }
}
