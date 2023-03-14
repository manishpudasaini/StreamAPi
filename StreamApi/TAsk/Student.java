package StreamApi.TAsk;

public class Student {
    private  int id;
    private String name;
    private String address;
    private String email;
    private String mobileNumber;

    public Student(int id, String name, String address, String email, String mobileNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}
