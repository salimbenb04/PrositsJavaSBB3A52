import java.util.Scanner;

public class ZooManagement {

    public static void main(String[] args) {

        //instruction 1
        int nbrCages=20;
        String zooName = "my zoo";

        System.out.println(zooName+" comporte"+nbrCages+" cages");

        //instruction 2
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("entrez le nom du zoo");
            zooName = sc.nextLine();
        }while(zooName.isEmpty());

        do {
            System.out.println("entrez le nombre des cages");
            nbrCages = sc.nextInt();
        }while(nbrCages<=0);

        //instruction 3
        System.out.println(zooName+" comporte "+nbrCages+" cages");

    }

}
