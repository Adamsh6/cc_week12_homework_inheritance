package staff.Management;

import staff.Employee;

public class Manager extends Employee {

    String department;

    public Manager(String name, String niNumber, int salary, String department) {
        super(name, niNumber, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
