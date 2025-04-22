package ContactApp;

public class Contact {

    private String Name;
    private String phoneNumber;
    private String emailAdress;

    public Contact(String Name, String phoneNumber, String emailAdress){
        this.Name = Name;
        this.phoneNumber = phoneNumber;
        this.emailAdress = emailAdress;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "Name='" + Name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAdress='" + emailAdress + '\'' +
                '}';
    }
}
