package staff;

public abstract class Employee {
    private String name;
    private String ni;
    private double salary;
    
    public Employee(String name, String ni, double salary) {
        this.name = name;
        this.ni = ni;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNi() {
        return this.ni;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double raise) {
        if (raise >= 0) {
            this.salary += raise;
        }
    }

    public double payBonus() {
        return this.salary * 0.01;
    }

    public void setName(String name) {
        if (name != "") {
            this.name = name;
        }
    }
}
