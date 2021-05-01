public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setStudentNumber("1");
        student1.setId(1);
        student1.setFirstName("Sema");
        student1.setLastName("Salayeva");
        student1.setEmail("semasalayeva@gmail.com");
        student1.setPassword("1235464");
        student1.setCourseName("java");


        Student student2 = new Student();
        student2.setStudentNumber("2");
        student2.setId(2);
        student2.setFirstName("Ahmet");
        student2.setLastName("Mustafa");
        student2.setEmail("mustafaahmet@gmail.com");
        student2.setPassword("123kd4");
        student2.setCourseName("C#");


        Instructor instructor1 = new Instructor();
        instructor1.setInstructorNumber("1");
        instructor1.setFirstName("Engin");
        instructor1.setLastName("Demirog");
        instructor1.setId(1);
        instructor1.setEmail("engindemirog@gmail.com");
        instructor1.setPassword("454884");
        instructor1.setCourseName("Java");

        Instructor instructor2 = new Instructor();
        instructor2.setInstructorNumber("1");
        instructor2.setFirstName("Engin");
        instructor2.setLastName("Demirog");
        instructor2.setId(1);
        instructor2.setEmail("engindemirog@gmail.com");
        instructor2.setPassword("454884");
        instructor2.setCourseName("C#");

        User [] users = {student1, student2};
        StudentManager studentManager = new StudentManager();

        for (User user:users) {
            studentManager.add(user);
        }
        Instructor[] instructors = {instructor1, instructor2};
        InstructorManager instructorManager = new InstructorManager();

        for (User user:users) {
            instructorManager.add(user);
        }
    }
}
