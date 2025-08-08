package practice_2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2024);
        car.setYear(2025);
        car.print();

        Rectangle rectangle = new Rectangle(5, 3);
        rectangle.setWidth(7);
        System.out.println("Rectangle area: " + rectangle.calculateArea());

        Book book = new Book("Jungle Book", "R.Kipling");
        book.setAuthor("O.Wild");
        book.printInfo();

        BankAccount bankAccount = new BankAccount("Mike", 100.0);
        bankAccount.deposit(50);
        bankAccount.withdaw(20);
        bankAccount.printBalance();

        Point point = new Point(3, 8);
        point.setX(5);
        point.print();

        StudentGroup studentGroup = new StudentGroup("Teachers of English", 28);
        studentGroup.setStudentCount(25);
        studentGroup.printInfo();

        Circle circle = new Circle(3);
        circle.setRadius(5);
        System.out.println("Circle area: " + circle.calculateArea() + ", Circle circumference: " + circle.calculateCircumference());

        Teacher teacher = new Teacher("Mary Poppins", "Grammar");
        teacher.setSubject("Math");
        teacher.printInfo();

        Product product = new Product("Eggs", 3);
        product.setPrice(4);
        product.applyDiscount(10); // 10% discount
        product.printInfo();

        Laptop laptop = new Laptop("Lenovo", 3000.00);
        laptop.setPrice(3100.00);
        laptop.printInfo();
    }
}
