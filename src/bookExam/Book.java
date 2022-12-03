package bookExam;

public class Book {
    public String bCode;
    public String bName;
    public String bAuthor;
    public String bPrice;

    public String getbCode() {
        return bCode;
    }

    public void setbCode(String bCode) {
        this.bCode = bCode;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getbAuthor() {
        return bAuthor;
    }

    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }

    public String getbPrice() {
        return bPrice;
    }

    public void setbPrice(String bPrice) {
        this.bPrice = bPrice;
    }

    public Book(String bCode, String bName, String bAuthor, String bPrice) {
        this.bCode = bCode;
        this.bName = bName;
        this.bAuthor = bAuthor;
        this.bPrice = bPrice;
    }
}
