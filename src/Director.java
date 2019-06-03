public class Director extends Employee{
    private double bonus;

    public Director(String firstName, String lastName, String city, double salary, double bonus) {
        super(firstName, lastName, city, salary);
        this.bonus = bonus;
    }

    double totalPayment(){

        return bonus + getSalary();


    }
    @Override
    public double getSalary() {

        return super.getSalary() + bonus;
    }

}
