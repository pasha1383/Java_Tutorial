package Chapter_02_OOP.Define_Class;

import java.util.ArrayList;

public class Company {
    private String companyName;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Company() {
        this.companyName = "";
    }

    public Company(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                '}';
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void clear() {
        this.companyName = "";
    }


}
