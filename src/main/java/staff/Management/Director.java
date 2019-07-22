package staff.Management;

public class Director extends Manager{

    private double budget;

    public Director(String name, String niNumber, int salary, String department, double budget) {
        super(name, niNumber, salary, department);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public double payBonus() {
        return super.payBonus() * 2;
    }
}
