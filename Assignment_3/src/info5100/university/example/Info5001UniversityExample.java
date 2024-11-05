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
        
        // Adding people for students
        Person emma = pd.newPerson("Emma Watson");
        Person liam = pd.newPerson("Liam Johnson");
        Person olivia = pd.newPerson("Olivia Williams");
        Person noah = pd.newPerson("Noah Brown");
        Person ava = pd.newPerson("Ava Jones");
        Person sophia = pd.newPerson("Sophia Garcia");
        Person mason = pd.newPerson("Mason Martinez");
        Person isabella = pd.newPerson("Isabella Rodriguez");
        Person ethan = pd.newPerson("Ethan Wilson");
        Person mia = pd.newPerson("Mia Anderson");
        
        // Adding people for professors
        Person professor1 = pd.newPerson("Dr. Benjamin Carter");
        Person professor2 = pd.newPerson("Dr. Amelia Hernandez");
        Person professor3 = pd.newPerson("Dr. Oliver Miller");
        Person professor4 = pd.newPerson("Dr. Charlotte Clark");
        Person professor5 = pd.newPerson("Dr. Henry Lee");
        
        // Creating student profiles
        StudentDirectory sd = department.getStudentDirectory();
        StudentProfile student1 = sd.newStudentProfile(emma);
        StudentProfile student2 = sd.newStudentProfile(liam);
        StudentProfile student3 = sd.newStudentProfile(olivia);
        StudentProfile student4 = sd.newStudentProfile(noah);
        StudentProfile student5 = sd.newStudentProfile(ava);
        StudentProfile student6 = sd.newStudentProfile(sophia);
        StudentProfile student7 = sd.newStudentProfile(mason);
        StudentProfile student8 = sd.newStudentProfile(isabella);
        StudentProfile student9 = sd.newStudentProfile(ethan);
        StudentProfile student10 = sd.newStudentProfile(mia);

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
        
        FacultyProfile f1 = fd.newFacultyProfile(professor1);
        FacultyProfile f2 = fd.newFacultyProfile(professor2);
        FacultyProfile f3 = fd.newFacultyProfile(professor3);
        FacultyProfile f4 = fd.newFacultyProfile(professor4);
        FacultyProfile f5 = fd.newFacultyProfile(professor5);
        
        courseOffer.AssignAsTeacher(f1);
        courseOffer1.AssignAsTeacher(f2);
        courseOffer2.AssignAsTeacher(f3);
        courseOffer3.AssignAsTeacher(f4);
        courseOffer4.AssignAsTeacher(f5);
        courseOffer5.AssignAsTeacher(f1);
        courseOffer6.AssignAsTeacher(f2);
        courseOffer7.AssignAsTeacher(f3);

        // Creating course loads for students and ensuring a minimum of 20 registrations
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

        // Register students in courses to meet the 20 unique registrations requirement
        courseLoad1.newSeatAssignment(courseOffer1);
        courseLoad1.newSeatAssignment(courseOffer2);

        courseLoad2.newSeatAssignment(courseOffer2);
        courseLoad2.newSeatAssignment(courseOffer1);

        courseLoad3.newSeatAssignment(courseOffer3);
        courseLoad3.newSeatAssignment(courseOffer1);

        courseLoad4.newSeatAssignment(courseOffer1);
        courseLoad4.newSeatAssignment(courseOffer2);

        courseLoad5.newSeatAssignment(courseOffer2);
        courseLoad5.newSeatAssignment(courseOffer3);

        courseLoad6.newSeatAssignment(courseOffer4);
        courseLoad6.newSeatAssignment(courseOffer5);

        courseLoad7.newSeatAssignment(courseOffer6);
        courseLoad7.newSeatAssignment(courseOffer7);

        courseLoad8.newSeatAssignment(courseOffer1);
        courseLoad8.newSeatAssignment(courseOffer6);

        courseLoad9.newSeatAssignment(courseOffer7);
        courseLoad9.newSeatAssignment(courseOffer4);

        courseLoad10.newSeatAssignment(courseOffer5);
        courseLoad10.newSeatAssignment(courseOffer6);

        // Assigning grades to students
        assignGrade(courseLoad1, courseOffer1.toString(), courseOffer2.toString(), "A", "A");
        assignGrade(courseLoad2, courseOffer2.toString(), courseOffer1.toString(), "B", "A");
        assignGrade(courseLoad3, courseOffer3.toString(), courseOffer1.toString(), "A", "B");
        assignGrade(courseLoad4, courseOffer1.toString(), courseOffer2.toString(), "B", "B");
        assignGrade(courseLoad5, courseOffer2.toString(), courseOffer3.toString(), "A", "A");
        assignGrade(courseLoad6, courseOffer4.toString(), courseOffer5.toString(), "B", "A");
        assignGrade(courseLoad7, courseOffer6.toString(), courseOffer7.toString(), "A", "B");
        assignGrade(courseLoad8, courseOffer1.toString(), courseOffer6.toString(), "B", "A");
        assignGrade(courseLoad9, courseOffer7.toString(), courseOffer4.toString(), "A", "B");
        assignGrade(courseLoad10, courseOffer5.toString(), courseOffer6.toString(), "B", "A");

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
                System.out.println("\nAverage GPA of " + sp + " : " + Float.toString(averageGpa));
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
