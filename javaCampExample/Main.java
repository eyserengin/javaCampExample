package javaCampExample;

public class Main {
    public static void main(String[] args) {
        Courses course1 = new Courses("Java Course",0,"Eyser Engin");
        Courses course2 = new Courses("Java Script Course",0,"Engin ");
        CoursesManager coursesManager = new CoursesManager();

        Courses[] courses = {course1, course2};

        for( Courses course : courses){
            System.out.println(course.nameOfTheCourse + " " + course.price + " " + course.owner);
        }

        coursesManager.includeToCourse(course1);
        coursesManager.includeToCourse(course2);
        coursesManager.addToAnnouncement();
    }
}
