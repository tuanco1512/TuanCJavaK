package javafxStudentForm;

public class Student {
    private String name;
    private String email;
    private String address;
    private String age;
    private String phone;

    public Student(String name, String email, String address, String age, String phone) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.age = age;
        this.phone = phone;
    }

    public String toString(){
        return this.name+"--"+this.email+"--"+this.address+"--"+this.age+"--"+this.phone;
    }
}
