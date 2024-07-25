import java.util.*;

public class prac17 {

    public static void main(String[] args) {
        System.out.println("23DIT017- DARSHAN HOTCHANDANI");
        System.out.println("DATA FOR MANAGER::::::::");
        Manager x = new Manager();
        x.getdata();
        x.input();
    
        System.out.println("DATA FOR Employee::::::::");
        Employee y = new Employee();
        y.getdata();
        y.input();

        System.out.println("DATA OF MANAGER:::::::");
        x.printdata();
        x.printSalary();
        x.output();

        System.out.println("DATA OF EMPLOYEE:::::::");
        y.printdata();
        y.printSalary();
        y.output();

    }

}

class Members {

    String name;
    int age;
    String pnum;
    String add;
    int sal;

    Scanner obj = new Scanner(System.in);

    void printSalary() {
        System.out.println("Salary is: " + sal);

    }

    void getdata() {

        System.out.println("Input the Data:");
        System.out.print("Name: ");
        name = obj.nextLine();
        System.out.print("Age: ");
        age = obj.nextInt();
        obj.nextLine();
        System.out.print("Phone Number: ");
        pnum = obj.nextLine();
        System.out.print("Address: ");
        add = obj.nextLine();
        System.out.print("Salary: ");
        sal = obj.nextInt();
        obj.nextLine();
        

    }

    void printdata() {
        System.out.println("Name is: "+name);
        System.out.println("Age is: "+age);
        System.out.println("Address is: "+add);
        System.out.println("Phone number is: "+pnum);
    }

}

class Manager extends Members {

    String special;

    void input() {
        System.out.println("Enter Specialization:");
        special = obj.nextLine();

    }

    void output() {
        System.out.println("Specialization in : "+special);
    }

}

class Employee extends Members {

    String dept;

    void input() {
        System.out.println("Enter Department:");
        dept = obj.nextLine();

    }

    void output() {
        System.out.println("Department name: "+dept);

    }

}