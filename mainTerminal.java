public class mainTerminal {
    public static void main(String[] args) {
    Sportsman sp1 = new Sportsman("Jack", 5);
    Sportsman sp2 = new Sportsman("Max", 6);
    Sportsman sp3 = new Sportsman("Leo", 2);
    Sportsman sp4 = new Sportsman("Dominic", 9);

    Team t = new Team("Mad Lions");
    t.add(sp1);
    t.add(sp2);
    t.add(sp3);
    t.add(sp4);

    System.out.println(t.getInfo());
    }
}
