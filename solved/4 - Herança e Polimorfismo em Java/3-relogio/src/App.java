public class App {
    public static void main(String[] args) {
        BRLClock brl = new BRLClock();
        brl.setHour(13);
        brl.setMinute(30);
        brl.setSecond(0);
        System.out.println("BRL: " + brl.getTime());

        USClock us = new USClock();
        us.convert(brl);
        System.out.println("US  (convertido de BRL " + brl.getTime() + "): " + us.getTime());

        System.out.println();

        USClock us2 = new USClock();
        us2.setHour(0);
        us2.setMinute(45);
        us2.setSecond(10);
        System.out.println("US: " + us2.getTime());

        BRLClock brl2 = new BRLClock();
        brl2.convert(us2);
        System.out.println("BRL (convertido de US " + us2.getTime() + "): " + brl2.getTime());
    }
}
