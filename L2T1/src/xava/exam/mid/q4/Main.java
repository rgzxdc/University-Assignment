package xava.exam.mid.q4;

public class Main {
    public static void main(String[] args) {

        Player shakibBatsman = new Batsman("Shakib", "Dhaka", "+88017XXX", 12002, 300);
        System.out.println(shakibBatsman.getName());
        System.out.println(shakibBatsman.getContactAddrs());
        System.out.println(shakibBatsman.getStatus());
        System.out.println(shakibBatsman.getPhoneNumber());
        System.out.println(shakibBatsman);


        Player shakibBowler = new Bowler("Shakib", "Dhaka", "+88017XXX", 300, 300);
        System.out.println(shakibBowler.getName());
        System.out.println(shakibBowler.getContactAddrs());
        System.out.println(shakibBowler.getStatus());
        System.out.println(shakibBowler.getPhoneNumber());
        System.out.println(shakibBowler);


    }


}
