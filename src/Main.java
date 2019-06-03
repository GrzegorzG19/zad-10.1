public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Jan", "Kowalski", "Wrocław", 5000);
//        System.out.println(employee1.getFirstName());
//        System.out.println(employee1.getLastName());
//        System.out.println(employee1.getCity());
//        System.out.println(employee1.getSalary());

        Director dyr = new Director("Przemek", "Wyga", "Wroc", 1200, 44);
        Employee[] pers = new Employee[2];
        pers[0] = new Director("Han", "Mrauczek", "Wroc", 555, 332);
        pers[1] = new Employee("Lang", "Wang", "Szczecin", 3333);

        for (int i = 0; i < pers.length; i++) {
            pers[i].showInfo();
        }

        double sum = 0;
        for (int i = 0; i < pers.length; i++) {
            sum += pers[i].getSalary();
        }


        System.out.println(sum);



        System.out.print(howMany(pers,200));


    }

   public static int howMany(Employee[] employ, int cash) {
        int many = 0;
        for (int i = 0; i < employ.length; i++) {
            if (employ[i].getSalary() > cash) {
                many++;
            }
        }
        return many;

    }
}