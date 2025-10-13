package tn.esprit.gestionzoo;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {

        Terrestrial t = new Terrestrial("lion","chats",2,true,4);
        Aquatic a = new Aquatic("7outa","fish",1,true,"mer");
        Dolphin d = new Dolphin("mortadha","Dolphin",69,true,"ocean",69.420f);
        Penguin p = new Penguin("zarbout","el kadhi",9,true,"Antartiac",420.69f);

        System.out.println(t);
        System.out.println(a);
        System.out.println(d);
        System.out.println(p);

        a.swim();
        d.swim();
        p.swim();


    }
}