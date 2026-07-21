import java.util.Scanner;

public class InputExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Employee Details =====");

        System.out.println("Enter Employee Name");
        String empName = sc.nextLine();

        System.out.println("Enter Employee ID");
        int empId = sc.nextInt();

        System.out.println("Enter Salary");
        double empSalary = sc.nextDouble();

        sc.nextLine();

        System.out.println("Enter Department");
        String empDepartment = sc.nextLine();
        
        System.out.println("Name " + empName);
        System.out.println("Emp ID " + empId);
        System.out.println("Emp Salary " + empSalary);
        System.out.println("Deparment " + empDepartment);

        sc.close();

    }
}
