package OOP.Homework3;

public class Student {
  String name;
  String address;
  String phoneNumber;
  String id;

  Student() {}

  Student(String name, String address, String phoneNumber, String id) {
    this.name = name;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.id = id;
  }

  void gotoSchool() {
    System.out.println("Go to school");
  }

  void doHomework() {
    System.out.println("Do homework");
  }

  void payTuitionFees() {
    System.out.println("Pay Tuition Fees");
  }

  void takeAnExam() {
    System.out.println("Take an exam");
  }

  void showInfo() {
    System.out.println("Tên: " + name);
    System.out.println("Địa chỉ: " + address);
    System.out.println("Số điện thoại: " + phoneNumber);
    System.out.println("Mã số sinh viên: " + id);
  }
}
