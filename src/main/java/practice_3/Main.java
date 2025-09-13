package main.java.practice_3;

public class Main {
    public static void main(String[] args) {
        Company petya = new Company(1, "Petya");
        Company vasya = new Company(2, "Vasya");
        Company.printCompanyName(); // Pepsi
        Company.companyName = "Coca-Cola";
        Company.printCompanyName();
        // petya.employeeID = "100"; Cannot assign a value to final variable 'employeeID'

        System.out.println("Circle Area: " + MathConstants.calculateCircleArea(5));
        System.out.println("Circle Area: " + MathConstants.calculateCircleArea(8));
        System.out.println("Circle Circumference: " + MathConstants.calculateCircumference(3));
        System.out.println("Circle Circumference: " + MathConstants.calculateCircumference(7));

        University john = new University(1, "John");
        University mark = new University(2, "Mark");
        University anthony = new University(3, "Anthony");
        University.universityName = "Harvard";
        john.printStudentInfo();
        mark.printStudentInfo();
        anthony.printStudentInfo();

        //В main: создайте 2 игры, измените maxPlayers, добавьте игроков и выведите статус.*/
        GameSettings tableTennis = new GameSettings("Table Tennis");
        GameSettings.setMaxPlayers(2);
        tableTennis.addPlayer();
        tableTennis.printGameStatus();

        GameSettings hideAndSeek = new GameSettings("Hide and Seek");
        GameSettings.setMaxPlayers(3);
        hideAndSeek.addPlayer(); // current players 2
        hideAndSeek.addPlayer(); // current players 3
        hideAndSeek.addPlayer(); // current players is still 3, max players is reached
        hideAndSeek.printGameStatus();

        //В main: создайте несколько объектов, измените имя у одного и выведите информацию.*/
        Person mike = new Person("Mike", "Smith", "123-45-6789");
        Person bill = new Person("Bill", "Abrams", "345-56-7834");
        Person gary = new Person("Gary", "Moore", "124-78-3489");
        gary.setFirstName("Richard");
        mike.printPersonInfo();
        bill.printPersonInfo();
        gary.printPersonInfo();
    }
}
