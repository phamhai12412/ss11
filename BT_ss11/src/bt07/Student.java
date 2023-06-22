package bt07;

public class Student {
    private int id;
    private String name;
    private boolean gender;
    private String dob;

    public Student() {
    }

    public Student(int id, String name, boolean gender, String dob) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Gender: " + (gender ? "Nam" : "Nữ") + " | DOB: " + dob;
    }
}
