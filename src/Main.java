import Chapter_02_OOP.Define_Class.Company;
import Chapter_02_OOP.Define_Class.Employee;

public class Main {
    public static void main(String[] args) {
        Company company1 = new Company("hoof");
        Company company2 = new Company("hoof2");
        Employee employee1 = new Employee("ali",company1);
        Employee employee2 = new Employee("ali2",company1);
        Employee employee3 = new Employee("ali3",company2);
        Employee employee4 = new Employee("ali4",company2);
//        System.out.println(company1.getEmployees());
//        System.out.println(company2.getEmployees());
        System.out.println(employee1);
    }
}