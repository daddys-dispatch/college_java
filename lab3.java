package daddy;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double percent) {
        if (percent > 0) {
            salary += salary * (percent / 100);
            System.out.println(name + "'s salary raised by " + percent + "%. New salary: $" + salary);
        } else {
            System.out.println("Invalid percentage. Salary remains unchanged.");
        }
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: $" + salary;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(1, "John Doe", 50000.0);
        System.out.println("Initial Details:\n" + emp);
        emp.raiseSalary(10);
        System.out.println("\nUpdated Details:\n" + emp);
    }
}
