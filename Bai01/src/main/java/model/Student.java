package model;

public class Student {
    private String firstName;
    private String lastName;
    private String dob; // ngày sinh (Day/Month/Year gộp lại)
    private String email;
    private String mobile;
    private String gender;
    private String address;
    private String city;
    private String pin;
    private String state;
    private String country;
    private String hobbies;
    private String qualification;
    private String course;

    public Student() {}

    public Student(String firstName, String lastName, String dob, String email, String mobile,
                   String gender, String address, String city, String pin, String state,
                   String country, String hobbies, String qualification, String course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.email = email;
        this.mobile = mobile;
        this.gender = gender;
        this.address = address;
        this.city = city;
        this.pin = pin;
        this.state = state;
        this.country = country;
        this.hobbies = hobbies;
        this.qualification = qualification;
        this.course = course;
    }

    // Getters & Setters ...
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getDob() { return dob; }
    public void setDob(String dob) { this.dob = dob; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getMobile() { return mobile; }
    public void setMobile(String mobile) { this.mobile = mobile; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getPin() { return pin; }
    public void setPin(String pin) { this.pin = pin; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public String getHobbies() { return hobbies; }
    public void setHobbies(String hobbies) { this.hobbies = hobbies; }

    public String getQualification() { return qualification; }
    public void setQualification(String qualification) { this.qualification = qualification; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }
}
