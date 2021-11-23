import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Viết chương trình kiểm tra 3 cạnh có là tam giác không. Có xử lý ngoại lệ khi người dùng nhập không phải số hoặc nhập cạnh tam giác nhỏ hơn 0
        double a, b, c;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap a: ");
            a = sc.nextDouble();
            System.out.print("Nhap b: ");
            b = sc.nextDouble();
            System.out.print("Nhap c: ");
            c = sc.nextDouble();

            Triangle triangle = new Triangle();
            triangle.isTriangle(a, b, c);
        } catch (InputMismatchException e) {
            System.out.println("Ban phai nhap so!");
        }

//        Viết chương trình nhập vào thông tin cá nhân gồm tên, năm sinh, địa chỉ.
//        Có xử lý ngoại lệ khi nhập năm sinh không phải số hoặc năm sinh phải từ năm 1900 đến hiện tại.
//        Dựa vào năm sinh để tính tuổi. Nếu tuổi từ 18 trở lên thông báo người đó đã đủ tuổi bầu cử

        Person person = new Person();
        person.printAge();

    }
}
