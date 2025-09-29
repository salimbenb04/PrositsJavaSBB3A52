public class Animal {
    String family;
    private String name;
    private int age;
    boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public int getAge(){
        return age;
    }
    public void set(int age){
        if(age>=0)
            this.age=age;
        else
            System.out.println("animal ne peut pas avoir un age negatif ");
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        if (name.equals(" "))
            System.out.println("Le nom d’un Zoo ne doit pas être vide");
        this.name=name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}
