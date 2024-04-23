/***********************************************************************
 @Title:	ChanatYahyaEmployee.java
 @Purpose:	To get familiar with methods defined in a class
 @Author:    (Chanat Yahya)
 @Date:   	(06/01/2024)
 @Version:	1.0
 ************************************************************************/
public class Employee {
    private String name;
    private int id;
    private double salary;
    private int age;
    private String position;
    public Employee(){

    }
    public Employee(String name, int id, double salary, int age, String position){
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.age = age;
        this.position = position;
    }
    public void setName(String fullName){
        this.name = fullName;
    }
    public void setId(int idNumber){
        this.id = idNumber;
    }
    public void setSalary(double sal){
        this.salary = sal;
    }
    public void setAge(int ag){
        this.age = ag;
    }
    public void setPosition(String pos){
        this.position = pos;
    }
    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }
    public double getSalary(){
        return this.salary;
    }
    public int getAge(){
        return this.age;
    }
    public String getPosition(){
        return this.position;
    }
    public int getFedTax(){
        double taxableAmount = Math.max(salary - 800, 0);
        double tax = taxableAmount * 0.17;
        return (int) Math.ceil(tax);
    }
    public int getSsTax(int rate){
        double ssTax = salary * (rate*1.0/100);
        return (int) Math.ceil(ssTax);
    }
    public int getHealthFee(int rate){
        double healthFee = salary * (rate*1.0/100);
        return (int) Math.ceil(healthFee);
    }
    public int getInsurance(){
        int rate;
        if(age < 40){
            rate = 3;
        } else if (age <= 50){
            rate = 4;
        } else if (age <= 60) {
            rate = 5;
        }else {
            rate = 6;
        }
        double insurance = salary * (rate*1.0/100);
        return (int) Math.ceil(insurance);
    }
    public double getNetPay(){
        return salary - (getFedTax() + getSsTax(10) + getHealthFee(5) + getInsurance());
    }
}
