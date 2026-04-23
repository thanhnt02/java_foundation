package OverviewOOP.homework;

public class Student {
    private String fullName;
    private String address;
    private String email;
    private String phoneNumber;
    private String id;

    public Student(String fullName, String address, String email, String phoneNumber, String id) {
        this.fullName = fullName;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.id = id;
    }

    public void goToSchool() {
        System.out.println("Go to school..."); // cần kèm them đầy đủ thông tin của sinh viên như full Name + "... is going to school"
    }

    public void doHomework() {
        System.out.println("Do homework..."); // Tương tự như trên
    }

    public void payTuition() {
        System.out.println("Pay tuition..."); // Tương tự như trên
    }

    public void takeAnExam() {
        System.out.println("Take an exam..."); // Tương tự như trên
    }

    public void showInfo() {
        System.out.printf("FullName: %s\nAddress: %s\nEmail: %s\nPhone Number: %s\nId: %s\n", fullName, address, email, phoneNumber, id);
    }

    public String getAddress() {
        return address;
    } // similar to others

    public void setAddress(String address) {
        this.address = address;
    }
}
