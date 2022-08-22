package javaCampExample;

public class Courses {
    String nameOfTheCourse;
    int price;
    String owner;

    public Courses(){
        System.out.println("I am in too");
    }

    public Courses(String nameOfTheCourse, int price, String owner){
        this();
        this.nameOfTheCourse = nameOfTheCourse;
        this.price = price;
        this.owner = owner;
    }
}
