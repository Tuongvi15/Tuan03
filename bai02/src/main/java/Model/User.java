package Model;

public class User {
    private String firstName, lastName, email, password, gender, birthday;

    public User() {}
    public User(String firstName, String lastName, String email,
                String password, String gender, String birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.birthday = birthday;
    }

    public String getFirstName(){ return firstName; }
    public void setFirstName(String v){ firstName = v; }
    public String getLastName(){ return lastName; }
    public void setLastName(String v){ lastName = v; }
    public String getEmail(){ return email; }
    public void setEmail(String v){ email = v; }
    public String getPassword(){ return password; }
    public void setPassword(String v){ password = v; }
    public String getGender(){ return gender; }
    public void setGender(String v){ gender = v; }
    public String getBirthday(){ return birthday; }
    public void setBirthday(String v){ birthday = v; }
}