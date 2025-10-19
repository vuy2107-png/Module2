public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student(); // Tạo đối tượng student mặc định
        student.display(); // In ra giá trị mặc định

        // Gọi các phương thức public để thay đổi giá trị
        student.setName("Duy");
        student.setClasses("C07");

        // In lại để kiểm tra
        student.display();
    }
}

// ===============================
// LỚP STUDENT
// ===============================
class Student {
    // Thuộc tính private
    private String name = "John";
    private String classes = "C02";

    // Constructor không tham số
    public Student() {
    }

    // Phương thức public để gán giá trị cho name
    public void setName(String name) {
        this.name = name;
    }

    // Phương thức public để gán giá trị cho classes
    public void setClasses(String classes) {
        this.classes = classes;
    }

    // Phương thức hiển thị thông tin
    public void display() {
        System.out.println("Name: " + name + ", Class: " + classes);
    }
}
