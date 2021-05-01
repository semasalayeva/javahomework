public class StudentManager extends UserManager {
    @Override
    public void add(User user) {
        System.out.println(user.getFirstName() + " " +
                user.getLastName() + " " + user.getCourseName() +" kursuna katildiniz");
    }

    @Override
    public void update(User user) {
        System.out.println("Gunceleme islemi yapildi");
    }

    @Override
    public void remove(User user) {
        System.out.println(user.getCourseName() + " kursundan ciktiniz");

    }
}
