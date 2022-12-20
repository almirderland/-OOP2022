package intranet;

/**
 * @generated
 */
public class Admin extends Employee {

    public Admin(String name, String surname, String birthDate, String phoneNumber, String email,
                 String password) {
        super(name, surname, birthDate, phoneNumber, email, password);
    }
    //                          Operations                                  

    /**
     * @generated
     */
    public void createTeacher(String name, String surname, String birthDate, String phoneNumber, String email, String password, String experience) {
        Teacher t = new Teacher(name, surname, birthDate, phoneNumber, email, password, Status.PROFESSOR, experience);
        Database.users.add(t);
    }

    public void createStudent(String studentName, String studentSurname, String birthDate, String phoneNumber, String email, String password, String id, Integer yearOfStudy, Faculty faculty, Degree degree) {
        Student st = new Student(studentName, studentSurname, birthDate, phoneNumber, email, password, id, yearOfStudy,faculty,degree);
        Database.users.add(st);
    }

    public void createManager(String name, String surname, String birthDate, String phoneNumber, String email, String password, Managers managerType) {
        Manager m = new Manager(name, surname, birthDate, phoneNumber, email, password, managerType);
        Database.users.add(m);
    }

    public void createLibrarian(String name, String surname, String birthDate, String phoneNumber, String email, String password) {
        Librarian l = new Librarian(name, surname, birthDate, phoneNumber, email, password);
        Database.users.add(l);
    }


    /**
     * @generated
     */
    public boolean deleteUser(String login) {
        for (User u : Database.users) {
            if (u.getLogin().equals(login)) {
                Database.users.remove(u);
                return true;
            }
        }
        return false;
    }

    public String getUsers() {
        String s = "";
        for (User u : Database.users) {
            s += u.toString();
        }
        return s;
    }
}
