package Chapter_02_OOP.Define_Class;

public class Employee {
    private String name;
    private Company company;
    private int age;
    private int baseSalary;
    private int extraHours;
    private int hourlyRate;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", company=" + company +
                ", age=" + age +
                ", baseSalary=" + baseSalary +
                ", extraHours=" + extraHours +
                ", hourlyRate=" + hourlyRate +
                '}';
    }

    public Employee(String name, Company company) {
        this.name = name;
        this.company = company;
        company.addEmployee(this);
    }

    public Employee(String name, int age, int baseSalary,Company company) {
        this.name = name;
        this.age = age;
        this.baseSalary = baseSalary;
        this.company = company;
        company.addEmployee(this);
    }

    public int calcWage() {
        var baseSalary = getBaseSalary();
        var extraHours = getExtraHours();
        var hourlyRate = getHourlyRate();

        return baseSalary + (extraHours * hourlyRate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getExtraHours() {
        return extraHours;
    }

    public void setExtraHours(int extraHours) {
        this.extraHours = extraHours;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
