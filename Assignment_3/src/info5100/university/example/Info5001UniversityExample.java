/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Persona.StudentProfile;

/**
 *
 * @author kal bugrara
 */
public class Info5001UniversityExample {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
     Department department = new Department("Computer Science"); // one department
        PersonDirectory pd = department.getPersonDirectory();
        
        // Adding people for students and professors
        Person person1 = pd.newPerson("person1");
        Person person2 = pd.newPerson("person2");
        Person person3 = pd.newPerson("person3");
        Person person4 = pd.newPerson("person4");
        Person person5 = pd.newPerson("person5");
        Person person6 = pd.newPerson("person6");
        Person person7 = pd.newPerson("person7");
        Person person8 = pd.newPerson("person8");
        Person person9 = pd.newPerson("person9");
        Person person10 = pd.newPerson("person10");
        
        // Adding people for professors
        Person person11 = pd.newPerson("person11");
        Person person12 = pd.newPerson("person12");
        Person person13 = pd.newPerson("person13");
        Person person14 = pd.newPerson("person14");
        Person person15 = pd.newPerson("person15");
        
        // Creating student profiles
        StudentDirectory sd = department.getStudentDirectory();
        StudentProfile student1 = sd.newStudentProfile(person1);
        StudentProfile student2 = sd.newStudentProfile(person2);
        StudentProfile student3 = sd.newStudentProfile(person3);
        StudentProfile student4 = sd.newStudentProfile(person4);
        StudentProfile student5 = sd.newStudentProfile(person5);
        StudentProfile student6 = sd.newStudentProfile(person6);
        StudentProfile student7 = sd.newStudentProfile(person7);
        StudentProfile student8 = sd.newStudentProfile(person8);
        StudentProfile student9 = sd.newStudentProfile(person9);
        StudentProfile student10 = sd.newStudentProfile(person10);

        // Adding new courses to the course catalog
        CourseCatalog courseCatalog = department.getCourseCatalog();
        Course course = courseCatalog.newCourse("Machine Learning", "CS 5001", 4);
        Course course1 = courseCatalog.newCourse("Artificial Intelligence", "CS 5200", 3);
        Course course2 = courseCatalog.newCourse("Data Mining", "CS 5300", 3);
        Course course3 = courseCatalog.newCourse("Computer Vision", "CS 5400", 4);
        Course course4 = courseCatalog.newCourse("Natural Language Processing", "CS 5500", 3);
        Course course5 = courseCatalog.newCourse("Deep Learning", "CS 5600", 3);
        Course course6 = courseCatalog.newCourse("Big Data Analytics", "CS 5700", 4);
        Course course7 = courseCatalog.newCourse("Robotics", "CS 5800", 3);
        
        // Specifying core and elective courses
        department.addCoreCourse(course);
        department.addElectiveCourse(course1);
        department.addElectiveCourse(course2);
        department.addElectiveCourse(course3);
        department.addElectiveCourse(course4);
        department.addElectiveCourse(course5);
        department.addElectiveCourse(course6);
        department.addElectiveCourse(course7);
        
        // Creating course schedule for the semester
        CourseSchedule courseSchedule = department.newCourseSchedule("Fall2024");
        
        // Offering each course with seats
        CourseOffer courseOffer = courseSchedule.newCourseOffer("CS 5001");
        courseOffer.generatSeats(25);

        CourseOffer courseOffer1 = courseSchedule.newCourseOffer("CS 5200");
        courseOffer1.generatSeats(30);

        CourseOffer courseOffer2 = courseSchedule.newCourseOffer("CS 5300");
        courseOffer2.generatSeats(20);

        CourseOffer courseOffer3 = courseSchedule.newCourseOffer("CS 5400");
        courseOffer3.generatSeats(20);

        CourseOffer courseOffer4 = courseSchedule.newCourseOffer("CS 5500");
        courseOffer4.generatSeats(15);

        CourseOffer courseOffer5 = courseSchedule.newCourseOffer("CS 5600");
        courseOffer5.generatSeats(25);

        CourseOffer courseOffer6 = courseSchedule.newCourseOffer("CS 5700");
        courseOffer6.generatSeats(30);

        CourseOffer courseOffer7 = courseSchedule.newCourseOffer("CS 5800");
        courseOffer7.generatSeats(10);
        
        // Creating faculty profiles and assigning them to course offers
        FacultyDirectory fd = department.getFacultyDirectory();
        
        FacultyProfile f1 = fd.newFacultyProfile(person11);
        FacultyProfile f2 = fd.newFacultyProfile(person12);
        FacultyProfile f3 = fd.newFacultyProfile(person13);
        FacultyProfile f4 = fd.newFacultyProfile(person14);
        FacultyProfile f5 = fd.newFacultyProfile(person15);
        
        courseOffer.AssignAsTeacher(f1);
        courseOffer1.AssignAsTeacher(f2);
        courseOffer2.AssignAsTeacher(f3);
        courseOffer3.AssignAsTeacher(f4);
        courseOffer4.AssignAsTeacher(f5);
        courseOffer5.AssignAsTeacher(f1);
        courseOffer6.AssignAsTeacher(f2);
        courseOffer7.AssignAsTeacher(f3);

        // Creating course loads for students
        CourseLoad courseLoad1 = student1.newCourseLoad("Fall2024");
        CourseLoad courseLoad2 = student2.newCourseLoad("Fall2024");
        CourseLoad courseLoad3 = student3.newCourseLoad("Fall2024");
        CourseLoad courseLoad4 = student4.newCourseLoad("Fall2024");
        CourseLoad courseLoad5 = student5.newCourseLoad("Fall2024");
        CourseLoad courseLoad6 = student6.newCourseLoad("Fall2024");
        CourseLoad courseLoad7 = student7.newCourseLoad("Fall2024");
        CourseLoad courseLoad8 = student8.newCourseLoad("Fall2024");
        CourseLoad courseLoad9 = student9.newCourseLoad("Fall2024");
        CourseLoad courseLoad10 = student10.newCourseLoad("Fall2024");

        // Register students in courses
        courseLoad1.newSeatAssignment(courseOffer1);
        courseLoad1.newSeatAssignment(courseOffer2);
        courseLoad2.newSeatAssignment(courseOffer2);
        courseLoad2.newSeatAssignment(courseOffer1);
        courseLoad3.newSeatAssignment(courseOffer3);
        courseLoad3.newSeatAssignment(courseOffer1);
        courseLoad4.newSeatAssignment(courseOffer1);
        courseLoad4.newSeatAssignment(courseOffer2);
        courseLoad5.newSeatAssignment(courseOffer2);
        courseLoad5.newSeatAssignment(courseOffer1);
        courseLoad6.newSeatAssignment(courseOffer1);
        courseLoad6.newSeatAssignment(courseOffer2);
        courseLoad7.newSeatAssignment(courseOffer1);
        courseLoad7.newSeatAssignment(courseOffer6);
        courseLoad8.newSeatAssignment(courseOffer2);
        courseLoad8.newSeatAssignment(courseOffer1);
        courseLoad9.newSeatAssignment(courseOffer3);
        courseLoad9.newSeatAssignment(courseOffer1);
        courseLoad10.newSeatAssignment(courseOffer1);
        courseLoad10.newSeatAssignment(courseOffer3);

        // Assigning grades to students
        assignGrade(courseLoad1, courseOffer1.toString(), courseOffer2.toString(), "A", "A");
        assignGrade(courseLoad2, courseOffer2.toString(), courseOffer1.toString(), "B", "A");
        assignGrade(courseLoad3, courseOffer3.toString(), courseOffer1.toString(), "A", "B");
        assignGrade(courseLoad4, courseOffer1.toString(), courseOffer2.toString(), "B", "B");
        assignGrade(courseLoad5, courseOffer2.toString(), courseOffer1.toString(), "A", "A");
        assignGrade(courseLoad6, courseOffer1.toString(), courseOffer2.toString(), "B", "A");
        assignGrade(courseLoad7, courseOffer1.toString(), courseOffer6.toString(), "A", "B");
        assignGrade(courseLoad8, courseOffer2.toString(), courseOffer1.toString(), "B", "A");
        assignGrade(courseLoad9, courseOffer3.toString(), courseOffer1.toString(), "A", "B");
        assignGrade(courseLoad10, courseOffer1.toString(), courseOffer3.toString(), "B", "A");

        
        
         System.out.println("---------------------------- Report For Fall 2024 Semester -----------------------------");
        for(StudentProfile sp: sd.getStudentProfiles()){
            System.out.println("-------------------------------------------------------------------------------------");
            try{
                System.out.println("Student Name : " + sp + "\n");
                System.out.println("Course Number - Faculty - Score - Course Price\n");
                for(SeatAssignment seatAssigned : sp.getCourseLoadBySemester("Fall2024").getSeatAssignments()){
                    CourseOffer co = seatAssigned.getCourseOffer();
                    System.out.println(co.getCourseNumber() + " - "
                            + co.getFacultyProfile() + " - "
                            + Float.toString(seatAssigned.GetCourseStudentScore()) + " - $"
                            + co.getSubjectCourse().getCoursePrice() + ".00");
                }
                Float averageGpa = sp.getCourseLoadBySemester("Fall2024").getSemesterScore()/ sp.getCourseLoadBySemester("Fall2024").getSeatAssignments().size();
                System.out.println("\nAverage Gpa of " + sp + " : " + Float.toString(averageGpa));
            }catch(NullPointerException e){
                System.out.println("Not registered for any courses");
            }
            System.out.println("-------------------------------------------------------------------------------------");
        }
    

    }
    
    private static void assignGrade(CourseLoad cl, String course1, String course2, String grade1, String grade2) {
    cl.getSeatAssignments().get(0).addGrade(cl.getSeatAssignments().get(0).getCourseOffer().getCourseNumber().equals(course1) ? grade1 : "B-");
    cl.getSeatAssignments().get(1).addGrade(cl.getSeatAssignments().get(1).getCourseOffer().getCourseNumber().equals(course2) ? grade2 : "B-");
    }

}
