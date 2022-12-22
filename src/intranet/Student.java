package intranet;

import java.util.HashMap;
import java.util.Map;

/**
 * @generated
 */
public class Student extends User {
    private String id;
    private Integer yearOfStudy;
    private Integer totalCredits;
    private Double GPA;
    protected HashMap<Course, Mark> courseMarks = new HashMap<Course, Mark>();
    private Faculty faculty;
    private Degree degree;
    private Integer creditLimit;
    private Integer chosenCredits = 0;

    public Student() {

    }

    public Student(String name, String surname, String birthDate, String phoneNumber, String email, String password, String id, Integer yearOfStudy, Faculty faculty, Degree degree) {
        super(name, surname, birthDate, phoneNumber, email, password);
        this.id = id;
        this.yearOfStudy = yearOfStudy;
        this.totalCredits = 0;
        this.GPA = 0.0;
        this.faculty = faculty;
        this.degree = degree;
        this.creditLimit = 35;
    }


    //TODO Auto-generated constructor stub


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getYearOfStudy() {
        return this.yearOfStudy;
    }

    public void setYearOfStudy(Integer yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public Integer getTotalCredits() {
        return this.totalCredits;
    }

    public void setTotalCredits(Integer totalCredits) {
        this.totalCredits = totalCredits;
    }

    public Double getGPA() {
        return this.GPA;
    }

    public void setGPA(Double GPA) {
        this.GPA = GPA;
    }

    public Faculty getFaculty() {
        return this.faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }


    public Degree getDegree() {
        return this.degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }


    public Integer getCreditLimit() {
        return this.creditLimit;
    }

    public void setCreditLimit(Integer creditLimit) {
        this.creditLimit = creditLimit;
    }


    //                          Operations                                  

    /**
     * @generated
     */
    public void increaseCredits(int creditCount) {
        this.chosenCredits += creditCount;
    }

    public void registerToCourse(String courseID) throws CreditOverFlow {
        Course newCourse = null;
        for (Course course : Database.courses) {
            if (course.getCourseId().equals(courseID)) {
                newCourse = course;
                if (this.chosenCredits+newCourse.getCredits() <= this.creditLimit && newCourse.getIsAvailable()) {
                	System.out.println(this.id);
                    Database.studentRegistration.put(this.id, newCourse);
                } else {
                    throw new CreditOverFlow("Number of credits exceeded or Course is not available!!!");
                }
            }
        }
    }

    public void orderBook(String bookId) {
        Book b = new Book();
        for (Book book : Database.books) {
            if (book.getId().equals(bookId)) {
                b = book;
            }
        }
        Database.orders.put(this.getId(), b);
    }

    /**
     * @generated
     */
    public String viewTeacherInfo(String name) {
        for (User user : Database.users) {
            if (user instanceof Teacher) {
                Teacher t = (Teacher) user;
                if (t.getName().equals(name)) {
                    return t.getAllInfo();
                }
            }
        }
        return "";
    }

    /**
     * @generated
     */
    public void rateTeacher(String teacherName, int rating) {
        for (User user : Database.users) {
            if (user instanceof Teacher) {
                Teacher t = (Teacher) user;
                if (t.getName().equals(teacherName)) {
                    t.increaseRating(rating);
                }
            }
        }
    }

    /**
     * @generated
     */
    public void dropCourse(String courseId) {
        for (Course course : this.courseMarks.keySet()) {
            if (course.getCourseId().equals(courseId)) {
                this.courseMarks.remove(course);
                break;
            }
        }
        // courseDoesNotExistException
    }

    public String totalGpa() {
        int i = 0;
        double points = 0.0;
        for (Mark mark : Database.marks) {
            points += mark.getTotalGrade();
            i++;
        }
        points /= i;
        Mark mark = new Mark();
        mark.setTotalGrade(points);
        return (mark.convertToGPA());
    }

    public String viewTranscript() {
        int i = 0;
        String s = "";
        double points = 0.0;
        for (User user : Database.users) {
            if (user instanceof Student) {
                Student student = (Student) user;
                if (student.getId().equals(this.id)) {
                    for (Map.Entry<Course, Mark> courseMark : student.courseMarks.entrySet()) {
                    	if (courseMark.getValue() != null) {
	                    	points += courseMark.getValue().getTotalGrade();
	                    	System.out.println(points);
	                        i++;
	                        s += i + ") Course Name: " + courseMark.getKey().getCourseName()
	                                + "\n    First Att.: " + courseMark.getValue().getFirstAtt()
	                                + "\n    Second Att.: " + courseMark.getValue().getSecondAtt()
	                                + "\n    Final Grade: " + courseMark.getValue().getFinalGrade()
	                                + "\n    Total Grade: " + courseMark.getValue().getTotalGrade() + " " + courseMark.getValue().convertToLetter() + " " + courseMark.getValue().convertToGPA() + "\n";
                    	}
                    }
                }
            }
        }
        points /= i;
        System.out.println(points);
        Mark mark = new Mark();
        mark.setTotalGrade(points);
        System.out.println(mark.getTotalGrade());
        s += "Total GPA: " + mark.convertToGPA();
        return s;
    }

    /**
     * @generated
     */
    public String getTranscript() {
        return "Transcript is downloaded";
    }


    /**
     * @generated
     */
    public String viewMarks() {
        String s = "";
        int i = 0;
        for (User user : Database.users) {
            if (user instanceof Student) {
                Student student = (Student) user;
                if (student.getId().equals(this.id)) {
                    for (Map.Entry<Course, Mark> courseMark : student.courseMarks.entrySet()) {
                        Course course = courseMark.getKey();
                        Mark mark = courseMark.getValue();
                        if(mark == null){
                            continue;
                        }
                        i++;
                        s += i + ") Course Name: " + course.getCourseName()
                                + "\n    First Att.: " + mark.getFirstAtt()
                                + "\n    Second Att.: " + mark.getSecondAtt()
                                + "\n    Final Grade: " + mark.getFinalGrade()
                                + "\n    Total Grade: " + mark.getTotalGrade() + " " + mark.convertToLetter() + " " + mark.convertToGPA() + "\n\n";
                    }
                }
            }
        }
        return s;
    }

    /**
     * @generated
     */
    public String viewAvailableCourses() {
        int i = 0;
        String s = "";
        for (Course course : Database.courses) {
            if (course.getIsAvailable()) {
                i++;
                s += i + ") Course Name: " + course.getCourseName()
                        + "\n    Course ID: " + course.getCourseId()
                        + "\n    Course credits: " + course.getCredits()
                        + "\n    Course description: " + course.getDescription() + "\n\n";
            }
        }
        return s;
    }

    /**
     * @generated
     */
    public String viewCourseFiles(String courseId) {
        int i = 0;
        String s = "";
        for (File file : Database.files) {
            if (file.getCourseId().equals(courseId)) {
                i++;
                s += i + ") File Name: " + file.getFileName()
                        + "\n    CourseId: " + file.getCourseId()
                        + "\n    File description: " + file.getDescription()
                        + "\n    Post date: " + file.getPostDate() + "\n\n";
            }
        }
        return s;
    }

    // @Override
    public String getAllInfo() {
        return "{" +
                " name='" + getName() + "'" +
                ", surname='" + getSurname() + "'" +
                ", birthDate='" + getBirthDate() + "'" +
                ", phoneNumber='" + getPhoneNumber() + "'" +
                ", email='" + getEmail() + "'" +
                " id='" + getId() + "'" +
                ", yearOfStudy='" + getYearOfStudy() + "'" +
                 ", totalCredits='" + getTotalCredits() + "'" +
                ", faculty='" + getFaculty() + "'" +
                ", degree='" + getDegree() + "'" +
                "}";
    }
}
