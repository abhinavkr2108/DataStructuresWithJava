package OOPS;

public class StudentClass {
    // new data type with multiple attributes
    public static class Student{
        String name;
        int rollNo;
        double percent;
    }

    public static void printStudentDetails(Student student){
        System.out.println(student.name);
        System.out.println(student.rollNo);
        System.out.println(student.percent);
    }

    public static void changeStudentDetails(Student student){
        student.name = "Rohan";
        student.rollNo = 5;
        student.percent = 67.67;
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Abhinav";
        s1.rollNo = 1;
        s1.percent = 72.5;

        System.out.println("Before Changing");
        printStudentDetails(s1);
        System.out.println("After Changing");
        changeStudentDetails(s1);
        printStudentDetails(s1);

        College c1 = new College();
        c1.setName("NSIT");
        System.out.println(c1.getName());

        // Can be accessed only if function is static
        System.out.println(Hotel.getHotelNumber());
        Hotel h1 = new Hotel("Taj", "Mumbai", 5);
        System.out.println(h1.getHotelNumber());
        Hotel h2 = new Hotel("Country Sight", "Delhi", 4);
        System.out.println(h2.getHotelNumber());



    }
}
