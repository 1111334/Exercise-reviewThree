public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[3];
        students[0] = new Student(3636, "Marco Rossi", 25.0, 30.0);
        students[1] = new Student(4775, "Luca Rossi", 27.0, 29.5);
        students[2] = new Student(6859, "Elena Rossi", 30.0, 32.0);

        System.out.println("Excellent student: ");
        Student.printExcellentStudents(students);
    }
}