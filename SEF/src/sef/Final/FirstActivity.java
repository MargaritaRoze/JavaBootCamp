package sef.Final;

public class FirstActivity {
    public static void main(String[] args){
EmployeeN employee1 = new EmployeeN();
EmployeeN employee2= new EmployeeN();
EmployeeN employee3 = new EmployeeN();
employee1.setSalary(10);
employee1.setName("Rita");
employee2.setSalary(20);
employee2.setName("Sandy");
employee3.setSalary(30);
employee3.setName("Mandy");
        if (employee1.getSalary() < employee2.getSalary())
    System.out.println(employee1.getSalary());
        if (employee1.getSalary() > employee2.getSalary())
            System.out.println(employee1.getSalary());
        if (employee2.getSalary() > employee3.getSalary())
            System.out.println(employee1.getSalary());
        if (employee2.getSalary() < employee3.getSalary())
            System.out.println(employee1.getSalary());
    }

}
