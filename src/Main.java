import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Festmeny> festmenyek = new ArrayList<Festmeny>();

    Festmeny festmeny1 = new Festmeny("Jozsi a hegyen" , "jozsef joska" , "kalsszikus" );
    Festmeny festmeny2 = new Festmeny("egy ház" , "random NPC" , "reneszánsz" );

    festmenyek.add(festmeny1);
    festmenyek.add(festmeny2);



    festmeny1.licit();
        System.out.println(festmeny1.getLegmagasabbLicit() + " " +  festmeny1.getLegutolsoLicitIdeje());
    festmeny1.licit(9);
    festmeny1.licit(30);
        System.out.println(festmeny1.getLegmagasabbLicit() + " " +  festmeny1.getLegutolsoLicitIdeje());

        System.out.println(festmeny1);

    }
}