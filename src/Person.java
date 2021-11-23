import java.util.InputMismatchException;
import java.util.Scanner;

public class Person {
    String name;
    int birthYear;
    String address;
    Scanner sc = new Scanner(System.in);

    public Person() {
        try {
            System.out.print("Nhap ten: ");
            this.name = sc.nextLine();
            System.out.print("Nhap tuoi: ");
            this.birthYear = sc.nextInt();
            sc.nextLine();
            System.out.print("Nhap dia chi: ");
            this.address = sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Nam sinh phai nhap so!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void printAge() {
        if (birthYear < 1900) throw new ArithmeticException("Nam sinh phai >= 1900");
        else {
            System.out.printf("So tuoi hien tai: %d", 2021 - birthYear);
        }
    }
}
