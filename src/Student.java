public class Student {
    private long identifier;
    private String fullName;
    private double worstGrade;
    private static double bestGrade;

    public Student(long identifier, String fullName, double worstGrade, double bestGrade) {
        this.identifier = identifier;
        this.fullName = fullName;
        this.worstGrade = worstGrade;
        Student.bestGrade = bestGrade;
    }
    public long getIdentifier() {
        return identifier;
    }

    public String getFullName() {
        return fullName;
    }

    public double getBestGrade() {
        return bestGrade;
    }

    public static void printExcellentStudents(Student[] arrayStudent) {
        for (Student student : arrayStudent) {
            if (student.getBestGrade() > 28.0) {
                System.out.println(student.getFullName());
                System.out.println(student.getIdentifier());
            }
        }



    }
}
