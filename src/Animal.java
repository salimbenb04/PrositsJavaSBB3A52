public class Animal {

    String name;
    String family;
    int age;
    boolean isMammal;

    Animal(String name,String family,int age,boolean isMammal) {
        this.name=name;
        this.family=family;
        this.age=age;
        this.isMammal=isMammal;
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}
