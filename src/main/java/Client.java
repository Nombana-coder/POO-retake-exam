import java.util.Date;

public class Client {
    private String id;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String address;
    private String email;
    private String phone;

    public Client(String id, String firstName, String lastName, Date birthDate, String address, String email, String phone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
