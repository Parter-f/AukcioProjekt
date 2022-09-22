public class Main {
    public static void main(String[] args) {

    Festmeny festmeny = new Festmeny("Jozsi a hegyen" , "jozsef joska" , "kalsszikus" );
    festmeny.licit();
        System.out.println(festmeny.getLegmagasabbLicit() + " " +  festmeny.getLegutolsoLicitIdeje());
    festmeny.licit(9);
    festmeny.licit(30);
        System.out.println(festmeny.getLegmagasabbLicit() + " " +  festmeny.getLegutolsoLicitIdeje());
    }
}