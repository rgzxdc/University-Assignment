package xava.exam.mid.q4;

public class Batsman extends Player {
    private int totalRuns;
    private int totalOneDayPlayed;

    public Batsman(String name, String contactAddrs, String phoneNumber, int totalRuns, int totalOneDayPlayed) {
        super(name, contactAddrs, phoneNumber, "Batsman");
        this.totalRuns = totalRuns;
        this.totalOneDayPlayed = totalOneDayPlayed;

    }

    public Batsman() {
        super();
    }

    public void averageRun() {
        System.out.println(super.avg(totalRuns,totalOneDayPlayed));
    }

}