package xava.exam.mid.q4;

public class Bowler extends Player{
    private int totalWicket;
    private int totalMatchPlayed;

    public Bowler(String name, String contactAddrs, String phoneNumber, int totalWicket, int totalMatchPlayed) {
        super(name, contactAddrs, phoneNumber, "Bowler");
        this.totalWicket = totalWicket;
        this.totalMatchPlayed = totalMatchPlayed;
    }
    public Bowler() {
        super();
    }

    public void setTotalWicket(int totalWicket) {
        this.totalWicket = totalWicket;
    }

    public void setTotalMatchPlayed(int totalMatchPlayed) {
        this.totalMatchPlayed = totalMatchPlayed;
    }

    public void averageRun() {
        super.avg(totalWicket,totalMatchPlayed);
    }
}
