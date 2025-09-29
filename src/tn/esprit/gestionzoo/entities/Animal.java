package tn.esprit.gestionzoo.entities;

public class Animal {

    String name;
    String family;
    int age;
    boolean isMammal;

    public Animal(String name,String family,int age,boolean isMammal) {
        this.name=name;
        this.family=family;
        this.age=age;
        this.isMammal=isMammal;
    }

    public String toString() {
        return "tn.esprit.gestionzoo.entities.Animal{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }

    //getters
    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public String getFamily(){
        return family;
    }

    public boolean isMammal(){
        return isMammal;
    }

    //setters

    public void set(int age){
        if(age>=0)
            this.age=age;
        else
            System.out.println("animal ne peut pas avoir un age negatif ");
    }

    public void setName(String name){
        if (name.equals(" "))
            System.out.println("Le nom d’un animal ne doit pas être vide");
        this.name=name;
    }

    public void setFamily(String family){
        if(name.equals(" "))
            System.out.println("le nom de famille d'un animal ne doit pas etre vide");
        this.family=family;
    }

}
