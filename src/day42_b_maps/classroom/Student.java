package day42_b_maps.classroom;

public class Student {
    String name;
    int age;
    String ID;

    public Student(String name, int age, String ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }


    @Override
    public String toString() {
        return "Student Info:" +
                "\tName: " + name +
                "\tAge: " + age +
                "\tID: " + ID;
    }

}