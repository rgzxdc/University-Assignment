package xava.exam.mid.q4;

public class Player {
    private String name;
    private String contactAddrs;
    private String phoneNumber;
    private String status;

    public Player(String name, String contactAddrs, String phoneNumber, String status) {
        this.name = name;
        this.contactAddrs = contactAddrs;
        this.phoneNumber = phoneNumber;
        this.status = status;
    }

    public Player() {

    }


    public String getName() {
        return name;
    }

    public String getContactAddrs() {
        return contactAddrs;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getStatus() {
        return status;
    }

    public int avg(int total, int totalMatch) {
        int avg;
        avg = total/totalMatch;
        return avg;
    }

}
