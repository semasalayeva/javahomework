public class InstructorManager extends UserManager{
    @Override
    public void add(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " " + user.getCourseName() + " kursunu eklediniz" );
    }

    @Override
    public void update(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " Gunceleme islemi basariyla tamamlandi");
    }

    @Override
    public void remove(User user) {
        System.out.println( user.getFirstName() + " " + user.getLastName() + " cikarma isleminiz yapildi");

    }

}
