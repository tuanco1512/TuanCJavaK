package javaBookLibary;

public class Book {
    public String bCode;
    public String bName;
    public String bAuthor;
    public String bPh;
    public String bType;
    public Integer bPrice;
    public Integer bQty;

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

    public String getbPh() {
        return bPh;
    }

    public void setbPh(String bPh) {
        this.bPh = bPh;
    }

    public String getbType() {
        return bType;
    }

    public void setbType(String bType) {
        this.bType = bType;
    }

    public Integer getbPrice() {
        return bPrice;
    }

    public void setbPrice(Integer bPrice) {
        this.bPrice = bPrice;
    }

    public Integer getbQty() {
        return bQty;
    }

    public void setbQty(Integer bQty) {
        this.bQty = bQty;
    }

    public Book(String bCode, String bName, String bAuthor, String bPh, String bType, Integer bPrice, Integer bQty) {
        this.bCode = bCode;
        this.bName = bName;
        this.bAuthor = bAuthor;
        this.bPh = bPh;
        this.bType = bType;
        this.bPrice = bPrice;
        this.bQty = bQty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bCode='" + bCode + '\'' +
                ", bName='" + bName + '\'' +
                ", bAuthor='" + bAuthor + '\'' +
                ", bPh='" + bPh + '\'' +
                ", bType='" + bType + '\'' +
                ", bPrice=" + bPrice +
                ", bQty=" + bQty +
                '}';
    }
}
