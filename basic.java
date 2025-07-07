public class basic {

        static class Student {
        int rollno = 101;
        String name = "ajay";

        void showDetails() {
            System.out.println("Roll No: " + rollno);
            System.out.println("Name: " + name);
        }
    }

    public static void main(String[] args) {
        Student s = new Student(); // Create object
        s.showDetails();             }
}