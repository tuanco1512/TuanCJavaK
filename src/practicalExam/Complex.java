package practicalExam;

public class Complex {
    public double realPart;
    public double imaginaryPart;

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public String toString() {
        return "Complex{" +
                "realPart=" + realPart +
                ", imaginaryPart=" + imaginaryPart +
                '}';
    }

    public Complex(){

    }

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public static Complex add(Complex n1,Complex n2){
        Complex temp = new Complex(0.0,0.0);
        temp.realPart = n1.realPart + n2.realPart;
        temp.imaginaryPart = n1.imaginaryPart + n2.imaginaryPart;
        return temp;
    }

    public static Complex subtract(Complex n1,Complex n2){
        Complex temp = new Complex(0.0,0.0);
        temp.realPart = n1.realPart - n2.realPart;
        temp.imaginaryPart = n1.imaginaryPart - n2.imaginaryPart;
        return temp;
    }

    public static Complex multiply(Complex n1,Complex n2){
        Complex temp = new Complex(0.0,0.0);
        temp.realPart = n1.realPart* n2.realPart - n1.imaginaryPart* n2.imaginaryPart;
        temp.imaginaryPart = n1.realPart* n2.imaginaryPart - n1.imaginaryPart* n2.realPart;
        return temp;
    }

    public static Complex divide(Complex n1,Complex n2){
        Complex temp = new Complex(0.0,0.0);
        double denom = n2.imaginaryPart* n2.imaginaryPart + n2.realPart* n2.realPart;
        temp.realPart = (n1.realPart*n2.realPart + n1.imaginaryPart*n2.imaginaryPart)/denom;
        temp.imaginaryPart = (n2.realPart*n1.imaginaryPart - n1.realPart*n2.imaginaryPart)/denom;
        return temp;
    }
}
