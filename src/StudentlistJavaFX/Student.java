package StudentlistJavaFX;

public class Student {
    private String name;
    private String email;
    private String score;

    public Student(String name, String email, String score) {
        this.name = name;
        this.email = email;
        this.score = score;
    }

    public String toString(){ return this.name+" \t"+this.email+"\t"+this.score;}
}
