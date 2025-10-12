package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic{

    protected float swimmingDepth;

    public Penguin(){}
    public Penguin(String name,String family,int age,Boolean isMammal,String habitat,float swimmingDepth) {
        super(name,family,age,isMammal,habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString()+ "Penguin{" +
                "swimmingDepth=" + swimmingDepth +
                '}';
    }

    @Override
    public void swim(){
        System.out.println("This Penguin is swimming.");
    }
}
