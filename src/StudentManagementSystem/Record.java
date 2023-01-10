package StudentManagementSystem;

public class Record {
    private String name;
    private int idNumber;
    private int contactNumber;
    private String emailAddress;
    private String homeAddress;

    
    public Record(){}

    public Record(String name, int idNumber, int contactNumber, String emailNumber, String homeAddress){
        this.name = name;
        this.idNumber = idNumber;
        this.contactNumber = contactNumber;
        this.emailAddress = emailNumber;
        this.homeAddress = homeAddress;
    }
    public int getContactNumber(){
        return contactNumber;
    }
    public void setContactNumber(int contactNumber){
        this.contactNumber = contactNumber;
    }
    public int getIdNumber(){
        return idNumber;
    }
    public void setIdNumber(int idNumber){
        this.idNumber = idNumber;
    }
    public String getName(){
        return  name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getEmailNumber() {return emailAddress;}

    public void setEmailNumber(String emailNumber) {this.emailAddress = emailNumber;}

    public String getHomeAddress() {return homeAddress;}

    public void setHomeAddress(String homeAddress) {this.homeAddress = homeAddress;}


    public String toString(){
        return
                "RECORDS:\n" +
                "#####################################\n" +
                "Name: " + name +
                        "\n" +
                "-------------------------------------\n" +
                "id-number: " + idNumber +
                        "\n" +
                "-------------------------------------\n" +
                "contact-number: " + contactNumber +
                        "\n" +
                "-------------------------------------\n" +
                "email-address: " + emailAddress +
                        "\n" +
                "-------------------------------------I\n" +
                "home-address: " + homeAddress +
                        "\n" +
                "#####################################\n";
    }












}
