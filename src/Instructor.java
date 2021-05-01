public class Instructor extends User {
    private String instructorNumber;

    public Instructor() {
    }

    public Instructor(int id, String firstName, String lastName, String email, String password, String courseName, String instructorNumber) {
        super(id, firstName, lastName, email, password, courseName);
        this.instructorNumber = instructorNumber;
    }

    public String getInstructorNumber() {
        return instructorNumber;
    }

    public void setInstructorNumber(String instructorNumber) {
        this.instructorNumber = instructorNumber;
    }
}
