package intranet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tester {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException, ClassNotFoundException, CreditOverFlow {

        Course c1 = new Course("Object-oriented programming", 5, "CSCI2106");
        Course c2 = new Course("Software Engineering", 5, "CSCI2208");
        Database.courses.add(c1);
        Database.courses.add(c2);

        Teacher t1 = new Teacher("Mels", "Begenov", "22/02/1983", "8 777-123-23-23", "mels@gmail.com", "12345", Status.SENIOR_LECTOR, "10 years");
        Teacher t2 = new Teacher("Aldamuratov", "Zhomart", "22/02/1983", "8 777-123-23-23", "kibokz.a@gmail.com", "12345", Status.SENIOR_LECTOR, "10 years");
        Database.users.add(t1);
        Database.users.add(t2);

        Admin a1 = new Admin("Alfiya", "Khalitova", "22/09/1977", "8 777-222-22-22", "admin1@gmail.com", "12345");
        Admin a2 = new Admin("Leyla", "Rozykovna", "22/02/1973", "8 777-222-22-23", "admin2@gmail.com", "12345");
        Database.users.add(a1);
        Database.users.add(a2);

        Message me1 = new Message("Alimzhan", "m.begenov@kbtu.kz", "Greetings", "Hello Mels. When do you release student points?");
        Message me2 = new Message("Mels", "a.amanov@kbtu.kz", "Hi", "Good morning Alimzhan. Today.");
        Database.messages.add(me1);
        Database.messages.add(me2);

        Student s1 = new Student("Almira", "Khalitova", "15/06/2002", "8 777-777-77-77", "almirderland@gmail.com", "12345", "20b030760", 3, Faculty.SITE, Degree.BACHELOR);
        Student s2 = new Student("Aruzhan", "Sakenova", "25/07/2002", "8 777-777-77-77", "sakesha@gmail.com", "12345", "20b000000", 3, Faculty.SITE, Degree.BACHELOR);
        Database.users.add(s1);
        Database.users.add(s2);

        Librarian l1 = new Librarian("Librarian1", "Librarianov1", "21/12/1960", "8 777-123-34-55", "lib1@gmai.com", "12345");
        Librarian l2 = new Librarian("Librarian2", "Librarianov2", "20/12/1961", "8 777-123-34-51", "lib2@gmai.com", "12345");
        Database.users.add(l1);
        Database.users.add(l2);
        
        Manager m1 = new Manager("Dana", "Akhmetzhan", "21/01/1985", " 8 707-111-11-11", "dana@gmail.com", "12345", Managers.DEPARTMENTS); 
        Manager m2 = new Manager("Nazym", "Aidarkhanova", "8/03/1983", " 8 707-112-12-12", "nazym@gmail.com", "12345", Managers.OR); 
        Database.users.add(m1); 
        Database.users.add(m2); 

        Book b1 = new Book("Thomas Calculus", "B1", "Thomas");
        Book b2 = new Book("Ryabushko", "B2", "Evgeniy");
        Database.books.add(b1);
        Database.books.add(b2);

        News n1 = new News("1", "Registration 2022-2023 Fall", "Registration will start 10th of Jan");
        News n2 = new News("2", "Exam", "The exam session is transferred to the online format");
        Database.news.add(n1);
        Database.news.add(n2);

        File f1 = new File("OOP_Project", "CSCI2106", "Here should be project");
        File f2 = new File("OOP_Diagram", "CSCI2106", "Here should be diagram");
        File f3 = new File("SE_Assessment1", "CSCI2208", "This is your assessment");
        File f4 = new File("SE_Assessment1", "CSCI2208", "This is your assessment");
        Database.files.add(f1);
        Database.files.add(f2);
        Database.files.add(f3);
        Database.files.add(f4);
        
        Database.teacherRatings.put("Zhomart", 5);
        Database.teacherRatings.put("Zhomart", 5);
        Database.teacherRatings.put("Zhomart", 5);
        
        s1.courseMarks.put(c1, null);
        s1.courseMarks.put(c2, null);
        
        t1.putMark("Software Engineering", "20b030760", 30.0, 30.0, 40.0);

        Database.save();
        Database.load();


        System.out.println("Press q to quit.");
        System.out.println("Enter your login: ");
        String input = reader.readLine();
        if (input.equals("q")) {
            System.exit(0);
        }
        for (User u : Database.users) {
            if (u.getLogin().equals(input)) {
                System.out.println("Enter password: ");
                String input1 = reader.readLine();
                if (u.getPassword().equals(input1)) {
                    System.out.println("Successfully authorized.");
                    System.out.println("Welcome " + u.getName() + ".");
                    if (u instanceof Student) {
                        boolean flag = true;
                        while (flag) {
                            Student st = (Student) u;
                            System.out.println("Student's mode");
                            System.out.println(
                            		"1. Information about Student\n" +
                                    "2. View available courses\n" +
                                    "3. View course files\n" +
                                    "4. View Teacher info\n" +
                                    "5. View marks\n" +
                                    "6. View transcript\n" +
                                    "7. Get transcript\n" +
                                    "8. Rate teacher\n" +
                                    "9. Order book\n" +
                                    "10. Register to Course\n" +
                                    "11. Drop Course\n" +
                                    "12. View news\n" +
                                    "13. Quit\n" +
                                    "0. Change password\n"
                            );

                            int chosen = Integer.parseInt(reader.readLine());

                            switch (chosen) {
                                case 1:
                                    System.out.println(st.getAllInfo());
                                    break;
                                case 2:
                                    System.out.println(st.viewAvailableCourses());
                                    break;
                                case 3:
                                    System.out.println("Enter courseId: ");
                                    String courseId = reader.readLine();
                                    System.out.println(st.viewCourseFiles(courseId));
                                    break;
                                case 4:
                                    System.out.println("Enter Teacher's name: ");
                                    String name = reader.readLine();
                                    System.out.println(st.viewTeacherInfo(name));
                                    break;
                                case 5:
                                    System.out.println(st.viewMarks());
                                    break;
                                case 6:
                                    System.out.println(st.viewTranscript());
                                    break;
                                case 7: 
                                	System.out.println(st.getTranscript());
                                case 8:
                                    System.out.println("Enter Teacher's name: ");
                                    String teacherName = reader.readLine();
                                    System.out.println("Enter 1-5 stars: ");
                                    int rating = Integer.parseInt(reader.readLine());
                                    st.rateTeacher(teacherName, rating);
                                    Database.save();
                                    System.out.println("Thank you for your feedback!");
                                    break;
                                case 9:
                                    System.out.println("Enter BookId: ");
                                    String bookId = reader.readLine();
                                    st.orderBook(bookId);
                                    Database.save();
                                    System.out.println("Your order has been completed.");
                                    break;
                                case 10:
                                    System.out.println("Enter courseId: ");
                                    String courseId1 = reader.readLine();
                                    st.registerToCourse(courseId1);
                                    Database.save();
                                    System.out.println(st.courseMarks);
                                    for (User user : Database.users) {
                                        if (user instanceof Student) {
                                            Student student = (Student) user;
                                            System.out.println(student.getId());
                                            System.out.println(student.courseMarks);
                                        }
                                    }
                                    System.out.println("Your request is fulfilled");
                                    break;
                                case 11:
                                    System.out.println("Enter courseId: ");
                                    String courseId2 = reader.readLine();
                                    st.dropCourse(courseId2);
                                    Database.save();
                                    System.out.println("Your course has been removed.");
                                    break;
                                case 12:
                                    System.out.println(st.viewNewsTab());
                                    break;
                                case 13:
                                    System.exit(0);
                                case 0:
                                    System.out.println("Enter old password: ");
                                    String oldPassword = reader.readLine();
                                    System.out.println("Enter new password: ");
                                    String newPassword = reader.readLine();
                                    if (st.changePassword(oldPassword, newPassword)) {
                                        System.out.println("Your password has been changed.");
                                    } else System.out.println("Incorrect password.");
                                    Database.save();
                                    break;
                            }

                        }


                    } else if (u instanceof Teacher) {
                        boolean flag = true;
                        while (flag) {
                            Teacher t = (Teacher) u;
                            System.out.println("Teacher's mode");
                            System.out.println(
                                    		"1. Information about Teacher\n" +
                                            "2. View courses\n" +
                                            "3. Add course file\n" +
                                            "4. Delete course file\n" +
                                            "5. View list of students\n" +
                                            "6. View info about student\n" +
                                            "7. Put mark\n" +
                                            "8. View marks\n" +
                                            "9. Send message\n" +
                                            "10. Get messages\n" +
                                            "11. View rating\n" +
                                            "12. View news\n" +
                                            "13. Quit\n" +
                                            "0. Change password\n");

                            int chosen = Integer.parseInt(reader.readLine());
                            switch (chosen) {
                                case 1:
                                    System.out.println("Information about teacher: ");
                                    System.out.println(t.getAllInfo());
                                    break;
                                case 2:
                                    System.out.println(t.viewCourses());
                                    break;
                                case 3:
                                    System.out.println("Enter file name: ");
                                    String fileName = reader.readLine();
                                    System.out.println("Enter CourseID: ");
                                    String courseId = reader.readLine();
                                    System.out.println("Enter description: ");
                                    String description = reader.readLine();
                                    t.addCourseFile(fileName, courseId, description);
                                    Database.save();
                                    System.out.println("Course file successfully added.");
                                    break;
                                case 4:
                                    System.out.println("Enter File name: ");
                                    String fileName1 = reader.readLine();
                                    System.out.println("Enter CourseID: ");
                                    String courseId1 = reader.readLine();
                                    t.deleteCourseFile(fileName1, courseId1);
                                    Database.save();
                                    System.out.println("Course file successfully deleted.");
                                    break;
                                case 5:
                                    System.out.println(t.viewStudents());
                                    break;
                                case 6:
                                    System.out.println("Enter student's name: ");
                                    String name = reader.readLine();
                                    System.out.println(t.viewStudentInfo(name));
                                    break;
                                case 7:
                                    System.out.println("Enter name of subject: ");
                                    String courseName = reader.readLine();
                                    System.out.println("Enter studentId: ");
                                    String studentId = reader.readLine();
                                    System.out.println("Enter First Attestation Points: ");
                                    Double firstAtt = Double.parseDouble(reader.readLine());
                                    System.out.println("Enter Second Attestation Points: ");
                                    Double secondAtt = Double.parseDouble(reader.readLine());
                                    System.out.println("Enter Final grade: ");
                                    Double finalGrade = Double.parseDouble(reader.readLine());
                                    t.putMark(courseName, studentId, firstAtt, secondAtt, finalGrade);
                                    Database.save();
                                    for (User user : Database.users) {
                                        if (user instanceof Student) {
                                            Student student = (Student) user;
                                            System.out.println(student.getId());
                                            System.out.println(student.courseMarks);
                                        }
                                    }
                                    System.out.println("Success!");
                                    break;
                                case 8:
                                    System.out.println("Enter course name: ");
                                    String courseName1 = reader.readLine();
                                    System.out.println(t.viewMarks(courseName1));
                                    break;
                                case 9:
                                    String messageFrom = t.getName();
                                    System.out.println("Enter employee login you want to message to: ");
                                    String messageTo = reader.readLine();
                                    System.out.println("Enter message title: ");
                                    String title = reader.readLine();
                                    System.out.println("Enter text: ");
                                    String text = reader.readLine();
                                    t.sendMessage(messageFrom, messageTo, title, text);
                                    Database.save();
                                    System.out.println("Message sent");
                                    break;
                                case 10:
                                    System.out.println(t.getMessages());
                                    break;
                                case 11:
                                    System.out.println(t.viewRating());
                                    break;
                                case 12:
                                    System.out.println(t.viewNewsTab());
                                    break;
                                case 13:
                                    System.exit(0);
                                case 0:
                                    System.out.println("Enter old password: ");
                                    String oldPassword = reader.readLine();
                                    System.out.println("Enter new password: ");
                                    String newPassword = reader.readLine();
                                    if (t.changePassword(oldPassword, newPassword)) {
                                        System.out.println("Your password has been changed.");
                                    } else System.out.println("Incorrect password.");
                                    Database.save();
                                    break;
                            }

                        }

                    } else if (u instanceof Manager) {
                        boolean flag = true;
                        while (flag) {
                            Manager m = (Manager) u;
                            System.out.println("Manager's mode");
                            System.out.println(
                            		"1. Create course\n" +
                                    "2. View info about students\n" +
                                    "3. View info about teachers\n" +
                                    "4. View requests about registration\n" +
                                    "5. Approve registration\n" +
                                    "6. Assign course to teachers\n" +
                                    "7. Add news\n" +
                                    "8. Remove news\n" +
                                    "9. Update news\n" +
                                    "10. Order of students by GPA\n" +
                                    "11. Order students alphabetically\n" +
                                    "12. Order teachers alphabetically\n" +
                                    "13. Order teachers by status\n" +
                                    "14. View news\n" +
                                    "15. View messages\n" +
                                    "16. Send message\n" +
                                    "17. Quit\n" +
                                    "0. Change password");

                            int chosen = Integer.parseInt(reader.readLine());

                            switch (chosen) {
                                case 1:
                                    System.out.println("Enter course's name: ");
                                    String courseName = reader.readLine();
                                    System.out.println("Enter course's credits: ");
                                    int courseCredit = Integer.parseInt(reader.readLine());
                                    System.out.println("Enter course's id: ");
                                    String courseId = reader.readLine();
                                    m.createCourse(courseName, courseCredit, courseId);
                                    Database.save();
                                    System.out.println("New course is created.");
                                    break;
                                case 2:
                                    System.out.println(m.infoStudents());
                                    break;
                                case 3:
                                    System.out.println("Enter teacher's name: ");
                                    String teacherName = reader.readLine();
                                    System.out.println(m.infoTeachers(teacherName));
                                    break;
                                case 4:
                                    System.out.println(m.viewRequests());
                                    break;
                                case 5:
                                    System.out.println("Enter student's ID: ");
                                    String studentId1 = reader.readLine();
                                    System.out.println("Enter course's id: ");
                                    String courseId1 = reader.readLine();
                                    System.out.println("Enter REJECT or ACCEPT: ");
                                    String courseApprove = reader.readLine();
                                    m.approveRegistration(studentId1, courseId1, courseApprove);
                                    Database.save();
                                    break;
                                case 6:
                                    System.out.println("Enter course's ID: ");
                                    String courseId2 = reader.readLine();
                                    System.out.println("Enter teacher's name: ");
                                    String teacherName1 = reader.readLine();
                                    m.assignCourseToTeachers(courseId2, teacherName1);
                                    Database.save();
                                    System.out.println("Teacher was assigned to course");
                                    break;
                                case 7:
                                    System.out.println("Enter news's ID: ");
                                    String newsId = reader.readLine();
                                    System.out.println("Enter news's title: ");
                                    String newsTitle = reader.readLine();
                                    System.out.println("Enter news's content: ");
                                    String newsText = reader.readLine();
                                    m.addNews(newsId, newsTitle, newsText);
                                    Database.save();
                                    System.out.println("News are added.");
                                    break;
                                case 8:
                                    System.out.println("Enter news's id you want to delete: ");
                                    String newsId1 = reader.readLine();
                                    m.removeNews(newsId1);
                                    Database.save();
                                    System.out.println("News are deleted");
                                    break;
                                case 9:
                                    System.out.println("Enter news's ID you want to update: ");
                                    String newsOldId2 = reader.readLine();
                                    System.out.println("Enter new id: ");
                                    String newId = reader.readLine();
                                    System.out.println("Enter news's title: ");
                                    String newsTitle1 = reader.readLine();
                                    System.out.println("Enter news's content: ");
                                    String newsText1 = reader.readLine();
                                    m.updateNews(newsOldId2, newId, newsTitle1, newsText1);
                                    Database.save();
                                    System.out.println("News are updated.");
                                    break;
                                case 10:
                                    System.out.println(m.orderStudentsByGPA());
                                    break;
                                case 11:
                                    System.out.println(m.orderStudentsAlphabetically());
                                    break;
                                case 12:
                                    System.out.println(m.orderTeachersAlphabetically());
                                    break;
                                case 13:
                                    System.out.println(m.orderTeachersStatus());
                                    break;
                                case 14:
                                    System.out.println(m.viewNewsTab());
                                    break;
                                case 15:
                                    String messageFrom = m.getName();
                                    System.out.println("Enter employee login you want to message to: ");
                                    String messageTo = reader.readLine();
                                    System.out.println("Enter message title: ");
                                    String title = reader.readLine();
                                    System.out.println("Enter text: ");
                                    String text = reader.readLine();
                                    m.sendMessage(messageFrom, messageTo, title, text);
                                    Database.save();
                                    System.out.println("Message sent");
                                    break;
                                case 16:
                                    System.out.println(m.getMessages());
                                    break;
                                case 17:
                                    System.exit(0);
                                case 0:
                                    System.out.println("Enter old password: ");
                                    String oldPassword = reader.readLine();
                                    System.out.println("Enter new password: ");
                                    String newPassword = reader.readLine();
                                    if (m.changePassword(oldPassword, newPassword)) {
                                        System.out.println("Your password has been changed.");
                                    } else System.out.println("Incorrect password.");
                                    Database.save();
                                    break;
                            }
                        }
                    } else if (u instanceof Admin) {
                        boolean flag = true;
                        while (flag) {
                            Admin a = (Admin) u;
                            System.out.println("Admin's mode");
                            System.out.println(
                            		"1. Create Student\n" +
                                    "2. Create Teacher\n" +
                                    "3. Create Manager\n" +
                                    "4. Create Librarian\n" +
                                    "5. View news\n" +
                                    "6. Send message\n" +
                                    "7. Get messages\n" +
                                    "8. Get users\n" +
                                    "9. Quit\n" +
                                    "10. Delete user\n" +
                                    "0. Change password\n");

                            int chosen = Integer.parseInt(reader.readLine());

                            switch (chosen) {
                                case 1:
                                    System.out.println("Enter Student's Name: ");
                                    String studentName = reader.readLine();
                                    System.out.println("Enter Student's Surname: ");
                                    String studentSurname = reader.readLine();
                                    System.out.println("Enter birth date: ");
                                    String birthDate = reader.readLine();
                                    System.out.println("Enter Student's phone number: ");
                                    String phoneNumber = reader.readLine();
                                    System.out.println("Enter email: ");
                                    String email = reader.readLine();
                                    System.out.println("Enter password: ");
                                    String password = reader.readLine();
                                    System.out.println("Enter Student id: ");
                                    String id = reader.readLine();
                                    System.out.println("Enter year of study: ");
                                    Integer yearOfStudy = Integer.parseInt(reader.readLine());
                                    System.out.println("Enter faculty: ");
                                    Faculty faculty = Faculty.valueOf(reader.readLine());
                                    System.out.println("Enter degree: ");
                                    Degree degree = Degree.valueOf(reader.readLine());
                                    a.createStudent(studentName, studentSurname, birthDate, phoneNumber, email, password, id, yearOfStudy, faculty, degree);
                                    Database.save();
                                    break;
                                case 2:
                                    System.out.println("Enter Teacher's Name: ");
                                    String teacherName = reader.readLine();
                                    System.out.println("Enter Teacher's Surname: ");
                                    String teacherSurname = reader.readLine();
                                    System.out.println("Enter birth date: ");
                                    String birthDate1 = reader.readLine();
                                    System.out.println("Enter phone number: ");
                                    String phoneNumber1 = reader.readLine();
                                    System.out.println("Enter email: ");
                                    String email1 = reader.readLine();
                                    System.out.println("Enter password: ");
                                    String password1 = reader.readLine();
                                    System.out.println("Enter experience: ");
                                    String experience = reader.readLine();
                                    a.createTeacher(teacherName, teacherSurname, birthDate1, phoneNumber1, email1, password1, experience);
                                    Database.save();
                                    break;
                                case 3:
                                    System.out.println("Enter Manager's Name: ");
                                    String managerName = reader.readLine();
                                    System.out.println("Enter Manager's Surname: ");
                                    String managerSurname = reader.readLine();
                                    System.out.println("Enter birth date: ");
                                    String birthDate2 = reader.readLine();
                                    System.out.println("Enter phone number: ");
                                    String phoneNumber2 = reader.readLine();
                                    System.out.println("Enter email: ");
                                    String email2 = reader.readLine();
                                    System.out.println("Enter password: ");
                                    String password2 = reader.readLine();
                                    System.out.println("Enter manager type: ");
                                    Managers managerType = Managers.valueOf(reader.readLine());
                                    a.createManager(managerName, managerSurname, birthDate2, phoneNumber2, email2, password2, managerType);
                                    Database.save();
                                    break;
                                case 4:
                                    System.out.println("Enter Librarian's Name: ");
                                    String librarianName = reader.readLine();
                                    System.out.println("Enter Librarian's Surname: ");
                                    String librarianSurname = reader.readLine();
                                    System.out.println("Enter birth date: ");
                                    String birthDate3 = reader.readLine();
                                    System.out.println("Enter phone number: ");
                                    String phoneNumber3 = reader.readLine();
                                    System.out.println("Enter email: ");
                                    String email3 = reader.readLine();
                                    System.out.println("Enter password: ");
                                    String password3 = reader.readLine();
                                    a.createLibrarian(librarianName, librarianSurname, birthDate3, phoneNumber3, email3, password3);
                                    Database.save();
                                    break;
                                case 5:
                                    System.out.println(a.viewNewsTab());
                                    break;
                                case 6:
                                    String messageFrom = a.getName();
                                    System.out.println("Enter employee login you want to message to: ");
                                    String messageTo = reader.readLine();
                                    System.out.println("Enter message title: ");
                                    String title = reader.readLine();
                                    System.out.println("Enter text: ");
                                    String text = reader.readLine();
                                    a.sendMessage(messageFrom, messageTo, title, text);
                                    Database.save();
                                    System.out.println("Message sent");
                                    break;
                                case 7:
                                    System.out.println(a.getMessages());
                                    break;
                                case 8:
                                    System.out.println(a.getUsers());
                                    break;
                                case 9:
                                    System.exit(0);
                                case 10:
                                    System.out.println("Enter login: ");
                                    String login = reader.readLine();
                                    a.deleteUser(login);
                                    Database.save();
                                    System.out.println("User has been deleted.");
                                    break;
                                case 0:
                                    System.out.println("Enter old password: ");
                                    String oldPassword = reader.readLine();
                                    System.out.println("Enter new password: ");
                                    String newPassword = reader.readLine();
                                    if (a.changePassword(oldPassword, newPassword)) {
                                        System.out.println("Your password has been changed.");
                                    } else System.out.println("Incorrect password.");
                                    Database.save();
                                    break;
                            }
                        }

                    } else if (u instanceof Librarian) {
                        boolean flag = true;
                        while (flag) {
                            Librarian l = (Librarian) u;
                            System.out.println("Librarian's mode");
                            System.out.println(
                            		"1. Add book\n" +
                                    "2. Remove book\n" +
                                    "3. Update order book\n" +
                                    "4. View news\n" +
                                    "5. Send message\n" +
                                    "6. Get messages\n" +
                                    "7. Quit\n" +
                                    "8. View books\n" +
                                    "0. Change password\n");

                            int chosen = Integer.parseInt(reader.readLine());

                            switch (chosen) {
                                case 1:
                                    System.out.println("Enter book's title: ");
                                    String bookTitle = reader.readLine();
                                    System.out.println("Enter book's id: ");
                                    String bookId = reader.readLine();
                                    System.out.println("Enter book's author: ");
                                    String bookAuthor = reader.readLine();
                                    l.addBook(bookTitle, bookId, bookAuthor);
                                    Database.save();
                                    System.out.println("Book has been added.");
                                    break;
                                case 2:
                                    System.out.println("Enter book's ID you want to delete: ");
                                    String bookId1 = reader.readLine();
                                    l.removeBook(bookId1);
                                    Database.save();
                                    System.out.println("Book has beed removed.");
                                    break;
                                case 3:
                                    System.out.println("Enter student's ID: ");
                                    String studentId = reader.readLine();
                                    System.out.println("Enter book's id: ");
                                    String bookId2 = reader.readLine();
                                    System.out.println("Enter REJECT or ACCEPT: ");
                                    String bookRequest = reader.readLine();
                                    l.updateOrderBook(studentId, bookId2, bookRequest);
                                    Database.save();
                                    break;
                                case 4:
                                    System.out.println(l.viewNewsTab());
                                    break;
                                case 5:
                                    String messageFrom = l.getName();
                                    System.out.println("Enter employee login you want to message to: ");
                                    String messageTo = reader.readLine();
                                    System.out.println("Enter message title: ");
                                    String title = reader.readLine();
                                    System.out.println("Enter text: ");
                                    String text = reader.readLine();
                                    l.sendMessage(messageFrom, messageTo, title, text);
                                    Database.save();
                                    System.out.println("Message sent");
                                    break;
                                case 6:
                                    System.out.println(l.getMessages());
                                    break;
                                case 7:
                                    System.exit(0);
                                case 0:
                                    System.out.println("Enter old password: ");
                                    String oldPassword = reader.readLine();
                                    System.out.println("Enter new password: ");
                                    String newPassword = reader.readLine();
                                    if (l.changePassword(oldPassword, newPassword)) {
                                        System.out.println("Your password has been changed.");
                                    } else System.out.println("Incorrect password.");
                                    Database.save();
                                    break;
                                case 8:
                                    System.out.println(Database.books.toString());
                            }
                        }

                    }
                } else {
                    System.out.println("Wrong password.");
                }
            }

        }
        System.out.println(Database.studentRegistration.toString());

    }
}
