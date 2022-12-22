package intranet;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

/**
* @generated
*/
public class Teacher extends Employee {
    
    private Status teacherStatus;
    private Vector<Course> courses;
    private String experience;
    private double rating;
    private int ratingCnt;

    public Teacher() {

    }

    public Teacher(String name, String surname, String birthDate, String phoneNumber, String email,
                String password, Status teacherStatus, String experience) {
        super(name, surname, birthDate, phoneNumber, email, password);
        this.teacherStatus = teacherStatus;
        this.courses = new Vector<Course>();
        this.experience = experience;
        this.rating = 0.0;
        this.ratingCnt = 0;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getRatingCnt() {
        return this.ratingCnt;
    }

    public void setRatingCnt(int ratingCnt) {
        this.ratingCnt = ratingCnt;
    }

    public Status getTeacherStatus() {
        return this.teacherStatus;
    }

    public void setTeacherStatus(Status teacherStatus) {
        this.teacherStatus = teacherStatus;
    }

    public Vector<Course> getCourses() {
        return this.courses;
    }

    public void setCourses(Vector<Course> courses) {
        this.courses = courses;
    }

    public String getExperience() {
        return this.experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }   
 

    //                          Operations                                  
    public void addCourseFile(String fileName, String courseId, String description) {
        File f = new File(fileName, courseId, description);
        Database.files.add(f);
    }

    public void deleteCourseFile(String fileName, String courseId) {
        for (File file : Database.files) {
            if(file.getFileName().equals(fileName) && file.getCourseId().equals(courseId)) {
                Database.files.remove(file);
            }
        }
    }

    public void increaseRating(int rating) {
        this.ratingCnt ++;
        this.rating += rating;
    }

    public Double viewRating() {
        return rating / ratingCnt * 1.0;
    }

    public String viewStudents() {
        int i = 0;
        String ans = "";
        for (User user : Database.users) {
            if(user instanceof Student) {
                Student st = (Student) user;
                i ++;
                ans += i + ") Student Name: " + st.getName()
                + "\n    Student surname: " + st.getSurname() 
                + "\n    Birth Date: " + st.getBirthDate()
                + "\n    Email: " + st.getEmail()
                + "\n    ID: " + st.getId()
                + "\n    Year of Study: " + st.getYearOfStudy()
                + "\n    Faculty: " + st.getFaculty()
                + "\n    Degree: " + st.getDegree() + "\n\n";
            }
        }
        return ans;
        // EXCEPTION
    }

    public String viewStudentInfo(String name) {
        String ans = "";
        for (User user : Database.users) {
            if (user instanceof Student) {
                Student st = (Student) user;
                if (st.getName().equals(name)) {
                    ans +=
                  "    Student Name: " + st.getName()
                + "\n    Student surname: " + st.getSurname() 
                + "\n    Birth Date: " + st.getBirthDate()
                + "\n    Email: " + st.getEmail()
                + "\n    ID: " + st.getId()
                + "\n    Year of Study: " + st.getYearOfStudy()
                + "\n    Faculty: " + st.getFaculty()
                + "\n    Degree: " + st.getDegree() + "\n\n";
                }
            }
        }
        return ans;
    }

    public void putMark(String courseName, String studentId, Double firstAtt, Double secondAtt, Double finalGrade) {
        Mark m = new Mark(firstAtt, secondAtt, finalGrade);
        for(User user : Database.users){
            if(user instanceof Student)
            {
                Student student = (Student) user;
                if(student.getId().equals(studentId)) {
                    for (Map.Entry<Course, Mark> courseMark : student.courseMarks.entrySet()) {
                        if(courseMark.getKey().getCourseName().equals(courseName)){
                            courseMark.setValue(m);
                        }
                    }
                }
            }

        }
    }

    public String viewMarks(String courseName) {
        int i = 0;
        String s = "";
        for (User user : Database.users) {
            if(user instanceof Student) {
                Student st = (Student) user;
                for (Map.Entry<Course, Mark> courseMark : st.courseMarks.entrySet()) {
                    if(courseMark.getKey().getCourseName().equals(courseName)) {
                        i ++;
                        s += i + ") Student Name: " + st.getName()
                        + "\n    Student surname: " + st.getSurname()
                        + "\n    Birth Date: " + st.getBirthDate()
                        + "\n    Email: " + st.getEmail()
                        + "\n    ID: " + st.getId()
                        + "\n    Year of Study: " + st.getYearOfStudy()
                        + "\n    Faculty: " + st.getFaculty()
                        + "\n    Degree: " + st.getDegree()
                        + "\n    First Att: " + courseMark.getValue().getFirstAtt()
                        + "\n    Second Att: " + courseMark.getValue().getSecondAtt()
                        + "\n    Final Grade: " + courseMark.getValue().getFinalGrade() + "\n\n";
                    }
                }
            }
        }
        return s;
    }

    public String viewCourses() {
        String s = "";
        int i = 0;
        for (Course course : Database.courses) {
            i ++;
            s += i + ") Course Name: " + course.getCourseName() 
            + "\n    Description: " + course.getDescription() 
            + "\n    Course ID: " + course.getCourseId() + "\n\n";
        }
        return s;
    }


    public String getAllInfo() {
        return "{" +
            " name='" + getName() + "'" +
            ", surname='" + getSurname() + "'" +
            ", birthDate='" + getBirthDate() + "'" +
             ", phoneNumber='" + getPhoneNumber() + "'" +
            ", email='" + getEmail() + "'" +
            " teacherStatus='" + getTeacherStatus() + "'" +
            ", experience='" + getExperience() + "'" +
            "}";
    }

    
}
