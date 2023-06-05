
public class Main {
    public static void main(String[] args) {

     Employee[] employees = new Employee [10];
     employees[0] = new Employee(1, "Зиннатуллин Анатолий Эдуардович",
             50000);
     employees[1] = new Employee(2, "Баранулько Анатолий Геннадьевич",
             67000);
     employees[2] = new Employee(3, "Лицов Анатолий Александрович",
             57000);
     employees[3] = new Employee(4, "Козлан Ринат Данилович",
                73000);
     employees[4] = new Employee(5, "Колпачников Константин Яковлев",
                76000);
     employees[5] = new Employee(5, "Каменев Георгий Геннадьевич",
                65000);
     employees[6] = new Employee(4, "Шелонцев Михаил Петрович",
                55000);
     employees[7] = new Employee(3, "Сафонников Герман Алексеевич",
                89000);
     employees[8] = new Employee(2, "Ярошев Филипп Глебович",
                86000);
     employees[9] = new Employee(1, "Левский Георгий Константинович",
                59000);

     printEmployees(employees);
     salaryAmount(employees);
     minSalary(employees);
     maxSalary(employees);
     calculateTheAverageSalary(employees);
     getTheFullNameOfEachEmployees(employees);
    }
    public static void printEmployees(Employee[] employees) {
        for (Employee employee : employees){
            if ( employee != null )
                System.out.println(employee.toString());
        }
    }

    // Посчитать сумму затрат на зарплаты в месяц.
    public static void salaryAmount(Employee[] employees) {
        int salaryAmount = 0;
        for (Employee employee : employees){
            if ( employee != null ){
               salaryAmount += employee.getSalary();
            }
        }
        System.out.println(salaryAmount);
    }

    //Найти сотрудника с минимальной зарплатой.
    public static void minSalary(Employee[] employees) {
        Employee result = employees[0];
         if (employees[0] != null) {
             int minSalary = employees[0].getSalary();
             for (Employee employee : employees) {
                 if (employee.getSalary() < minSalary) {
                     minSalary = employee.getSalary();
                     result = employee;
                 }
             }
         }
        System.out.println(" Сотрудник с минимальной зарлатой " + result);
    }

    //Найти сотрудника с максимальной зарплатой.
    public static void maxSalary(Employee[] employees) {
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        System.out.println(" Сотрудник с максимальной зарлатой " + result);
    }

    //Подсчитать среднее значение зарплат.
    public static void calculateTheAverageSalary(Employee[] employees) {
        int summa = 0;
        for (Employee employee : employees) {
            summa += employee.getSalary();
        }
        int avergeSalary = summa / 10;
        System.out.println("Среднее значение зарплаты " +
                avergeSalary + " руб. ");
    }
    public static void getTheFullNameOfEachEmployees(Employee[] employees) {

        for (Employee employee : employees) {
            System.out.println(employee.getFio());
        }
    }
}
