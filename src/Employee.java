public class Employee extends Person {
    private double salary;

    public Employee(String firstName, String lastName, String city, double salary) {
        super(firstName, lastName, city);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setCity(city);
        this.salary = salary;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(salary);
    }
}