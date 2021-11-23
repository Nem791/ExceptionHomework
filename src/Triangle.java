public class Triangle {

    public void isTriangle(double a, double b, double c) {
        if (a < 0 || b < 0 || c < 0) throw new ArithmeticException("Canh tam giac phai > 0");
        else {
            if (a < b + c && b < a + c && c < a + b) {
                System.out.println("Day la tam giac");
            } else {
                System.out.println("Day khong phai la tam giac");
            }
        }
    }
}
