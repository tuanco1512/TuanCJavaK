package practicalExam;

public class main {
    public static void main(String[] args) {
        Complex n1 = new Complex(15.12,20.0),
        n2 = new Complex(2.11,20.22),
                tempadd,
                tempsub,
                tempmult,
                tempdiv;
        tempadd = Complex.add(n1,n2);
        tempsub = Complex.subtract(n1,n2);
        tempmult = Complex.multiply(n1,n2);
        tempdiv = Complex.divide(n1,n2);
        System.out.println(tempadd);
        System.out.println(tempsub);
        System.out.println(tempmult);
        System.out.println(tempdiv);
    }
}
