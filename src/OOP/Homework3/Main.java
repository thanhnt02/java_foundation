package OOP.Homework3;

public class Main {
  public static void main(String[] args) {
    Student student = new Student("Thành", "Trần Quốc Hoàn", "0393324902", "B8932N1");
    student.gotoSchool();
    student.doHomework();
    student.payTuitionFees();
    student.takeAnExam();
    student.showInfo();
  }
}
