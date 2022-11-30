public class Runner {
    public static void main(String[] args) {

        /*
        Bus bus1 = new Bus(5);

        System.out.println(bus1.getCurrentStop());
        for (int i = 1; i <= 10; i++) {

            bus1.move();
            System.out.println(bus1.getCurrentStop());

        }
        */

        RandomWord nice = new RandomWord("nice", "zebra");

        for (int i = 1; i <= 3; i++) {
            System.out.println(nice.randomLetter(1));
            System.out.println(nice.randomLetter(2));
        }

        System.out.println(nice.getNewWord());
        nice.resetWord();
        System.out.println(nice.getNewWord());
    }
}
