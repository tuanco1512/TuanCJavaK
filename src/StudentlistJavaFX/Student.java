package StudentlistJavaFX;

public class Student {
    private String name;
    private String email;
    private Integer score;

    public Student(String name, String email, Integer score) {
        this.name = name;
        this.email = email;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String toString(){ return this.name+" \t"+this.email+"\t"+this.score;}
}
