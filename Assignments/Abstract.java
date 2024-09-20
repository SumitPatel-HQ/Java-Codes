abstract class Student {
    private String studentName;
    private int[] testScores = new int[4];
    private String testResult;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() { return studentName; }
    public void setTestScore(int testNumber, int testScore) { this.testScores[testNumber] = testScore; }
    public String getTestResult() { return testResult; }
    protected void setTestResult(String testResult) { this.testResult = testResult; }
    public abstract void generateResult();
}
class UndergraduateStudent extends Student {
    public UndergraduateStudent(String studentName) { super(studentName); }
    public void generateResult() {
        int total = 0;
        for (int score : getTestScores()) total += score;
        setTestResult(total / 4.0 >= 60 ? "Pass" : "Fail");
    }
}
class GraduateStudent extends Student {
    public GraduateStudent(String studentName) { super(studentName); }
    public void generateResult() {
        int total = 0;
        for (int score : getTestScores()) total += score;
        setTestResult(total / 4.0 >= 70 ? "Pass" : "Fail");
    }
}
class Tester {
    public static void main(String[] args) {
        Student[] students = {
            new UndergraduateStudent("Philip"),
            new GraduateStudent("Jerry")
        };

        for (Student student : students) {
            for (int i = 0; i < 4; i++) student.setTestScore(i, 70 - i);
            student.generateResult();
            System.out.println("Student name: " + student.getStudentName());
            System.out.println("Result: " + student.getTestResult());
        }
    }
}
