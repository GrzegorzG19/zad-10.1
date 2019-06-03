public class Customer extends Person {
    private double expenses;

    public Customer(String firstName, String lastName, String city, double expenses) {
        super(firstName, lastName, city);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setCity(city);
        this.expenses = expenses;
    }

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }


    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(expenses);
    }
}
