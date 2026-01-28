package Chapter_02_OOP.Define_Class;

public class Company {
    private String companyName;

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

    public void clear() {
        this.companyName = "";
    }
}
