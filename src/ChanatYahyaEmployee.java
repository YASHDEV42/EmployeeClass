/***********************************************************************
 @Title:	ChanatYahyaEmployee.java
 @Purpose:	To get familiar with methods defined in a class
 @Author:    (Chanat Yahya)
 @Date:   	(06/01/2024)
 @Version:	1.0
 ************************************************************************/
public class ChanatYahyaEmployee {
    public static void main(String[] args) {

        Employee employee1 = new Employee("John Doe", 101, 50000.0, 35, "Software Engineer");
        Employee employee2 = new Employee("Jane Smith", 202, 75000.0, 45, "Manager");


        printEmployeeInfo(employee1);
        printEmployeeInfo(employee2);
    }

    public static void printEmployeeInfo(Employee employee) {
        System.out.println("Employee Information:");
        System.out.println("Name: " + employee.getName());
        System.out.println("ID: " + employee.getId());
        System.out.println("Salary: $" + employee.getSalary());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Position: " + employee.getPosition());
        System.out.println("Federal Tax: $" + employee.getFedTax());
        System.out.println("SS Tax: $" + employee.getSsTax(10));
        System.out.println("Health Fee: $" + employee.getHealthFee(5));
        System.out.println("Insurance: $" + employee.getInsurance());
        System.out.println("Net Pay: $" + employee.getNetPay());
        System.out.println();
    }

}