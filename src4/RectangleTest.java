import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        double height = scanner.nextDouble();

        // Tạo đối tượng Rectangle
        Rectangle rectangle = new Rectangle(width, height);

        // Gọi các phương thức
        System.out.println("\nYour Rectangle: " + rectangle.display());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: " + rectangle.getArea());
    }
}

// ========================
// LỚP HÌNH CHỮ NHẬT
// ========================
class Rectangle {
    double width;
    double height;

    // Constructor mặc định
    public Rectangle() {
    }

    // Constructor có tham số
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Tính diện tích
    public double getArea() {
        return this.width * this.height;
    }

    // Tính chu vi
    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    // Hiển thị thông tin hình chữ nhật
    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
