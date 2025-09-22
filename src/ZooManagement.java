public class ZooManagement {
    public static void main(String[] args) {

        Animal lion = new Animal("Salta3oun","Aabd Errazek",7,true);
        Animal gazelle = new Animal("Hsouna","El Mbarek",9,true);
        Animal fartattou = new Animal("5nifs","El Wess",4,true);
        Zoo bebAasal = new Zoo("Beb Nhal","Jandoba",25);

        bebAasal.displayZoo(bebAasal);
        System.out.println(bebAasal);
        System.out.println(bebAasal.toString());

        //je remarque que les deux derniers affichent le même résultat et c'est un message qu'on ne peut pas lire.
    }

}
